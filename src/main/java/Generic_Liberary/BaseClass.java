package Generic_Liberary;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import POM.AdministrativeRiskAssessmentPage;
import POM.BasePage;
import POM.GrcLoginPage;
import POM.HardwareAssetPage;
import POM.HipaaRiskManagementSystemPage;
import POM.HomePage;
import POM.KriDashboardPage;
import POM.PhysicalRiskAssessmentPage;
import POM.RiskReviewBoardPage;
import POM.SelfRiskAssessmentQuestionPage;
import POM.SoftwareAssetPage;
import POM.TechnologyRiskAssessmentPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ExtentReports extentReports;
	public ExtentTest extentTest;
	public String screenShotsSubFolderName;

	public WebDriver driver;
	public JavascriptExecutor js;
	public WebDriverWait explicit;
	public ReadData data = new ReadData();
	public Actions action;
	public Select select;
	public BasePage basePg;
	public GrcLoginPage loginPg;
	public HomePage homePg;
	public KriDashboardPage dashboardpg;
	public HipaaRiskManagementSystemPage hrmPg;
	public SoftwareAssetPage softwarePg;
	public HardwareAssetPage hardwarepg;
	public TechnologyRiskAssessmentPage technoPg;
	public AdministrativeRiskAssessmentPage adminPg;
	public PhysicalRiskAssessmentPage physicalPg;
	public RiskReviewBoardPage riskReviewPg;
	public SelfRiskAssessmentQuestionPage selfRiskQuestionPg;
	public SoftAssert softassert;

	@BeforeTest
	@Parameters("bname")
	public void driver(ITestContext context, @Optional("chrome") String bname) {
		extentTest = extentReports.createTest(context.getName());
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		// Getting browser value from xml and comparing them.
		if (bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			extentTest.info("Chrome Browser launched successfully");

		} else if (bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			extentTest.info("Firefox Browser launched successfully");
		} else if (bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			extentTest.info("Edge Browser launched successfully");
		} else {
			System.out.println("Invalid browser name");
			extentTest.info("Invaid Browser");
		}
		// Creating object for Pom Classes
		basePg = new BasePage(driver);
		loginPg = new GrcLoginPage(driver);
		homePg = new HomePage(driver);
		hrmPg = new HipaaRiskManagementSystemPage(driver);
		softwarePg = new SoftwareAssetPage(driver);
		hardwarepg = new HardwareAssetPage(driver);
		technoPg = new TechnologyRiskAssessmentPage(driver);
		physicalPg = new PhysicalRiskAssessmentPage(driver);
		adminPg = new AdministrativeRiskAssessmentPage(driver);
		riskReviewPg = new RiskReviewBoardPage(driver);
		selfRiskQuestionPg = new SelfRiskAssessmentQuestionPage(driver);
		dashboardpg = new KriDashboardPage(driver);

		// maximizing the browser window and adding waiting conditions
		driver.manage().window().maximize();
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String device = cap.getBrowserName() + " " + cap.getVersion().subSequence(0, cap.getVersion().indexOf("."));
		String author = "Shahank";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		explicit = new WebDriverWait(driver, 15);

		// Up casting the driver for JavaScrtpt
		js = (JavascriptExecutor) driver;

		softassert = new SoftAssert();

		//
		
		extentTest.assignAuthor(author);
		extentTest.assignDevice(device);

		// navigating to the application by entering the url
		String url = data.fromPropertyFile("url");
		driver.get(url);
		extentTest.info("Successfully navigated to the url");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.linkText("Proceed to demo.healthdox.com (unsafe)")).click();

		// using action class reference variable to do mouse over actions on the
		// application
		action = new Actions(driver);

		// Verifying the title of the application
		String actualTitle = driver.getTitle();
		String expectedTitle = data.fromPropertyFile("expectedTitle");
		softassert.assertEquals(expectedTitle, actualTitle, "Title is mismatched");
		extentTest.pass("Title Matched");

		// Verifying UserId TextBox is displayed.
		softassert.assertEquals(loginPg.getUserIdTextBox().isDisplayed(), true,
				"UserId TextBox is not displayed in the home page");
		extentTest.pass("UserId TextBox is provided in login page");
		String actualUserIdPlaceHolder = loginPg.getUserIdTextBox().getAttribute("placeholder");
		String expectedUserIdPlaceHolder = data.fromPropertyFile("userIdPlaceHolder");

		softassert.assertEquals(expectedUserIdPlaceHolder, actualUserIdPlaceHolder,
				"Place Holder is not provided in UserId TextBox");
		extentTest.pass("Place Holder is provided for UserId TextBox in login page");
		// Entering UserId into UserId TextBox.
		loginPg.getUserIdTextBox().clear();
		loginPg.getUserIdTextBox().sendKeys(data.fromPropertyFile("username"));
		String actualValue = loginPg.getUserIdTextBox().getAttribute("value");
		String expectedValue = data.fromPropertyFile("username");
		softassert.assertEquals(expectedValue, actualValue, "Entered value is not matching with expected value");

		// Verifying Password TextBox is displayed
		softassert.assertEquals(loginPg.getPasswordTextBox().isDisplayed(), true,
				"password TextBox is not displayed in the home page");
		extentTest.pass("password TextBox is provided in login page");
		String actualpasswordPlaceHolder = loginPg.getPasswordTextBox().getAttribute("placeholder");
		String expectedpasswordPlaceHolder = data.fromPropertyFile("passwordPlaceHolder");
		softassert.assertEquals(expectedpasswordPlaceHolder, actualpasswordPlaceHolder,
				"Place Holder is not provided in Password TextBox");
		extentTest.pass("Place Holder is provided for UserId TextBox in login page");

		// Entering password into password TextBox
		loginPg.getPasswordTextBox().clear();
		loginPg.getPasswordTextBox().sendKeys(data.fromPropertyFile("password"));
		String actualValueofPassword = loginPg.getPasswordTextBox().getAttribute("value");
		String expectedValueofPassword = data.fromPropertyFile("password");
		softassert.assertEquals(expectedValueofPassword, actualValueofPassword,
				"Entered value is not matching with expected value");

		// Verifying the login button
		softassert.assertEquals(loginPg.getLoginButton().isDisplayed(), true,
				"Login button is not displayed in the home page");
		extentTest.pass("Clicked on Login button in login page");

		// Clicking on the login button.
		loginPg.getLoginButton().click();

		// Waiting till the elements are loading
		explicit.until(ExpectedConditions.visibilityOf(homePg.getNavBarText()));
		extentTest.info("Successfully navigated to home page of the application");

		// Verifying Hipaa image module and performing click action
		softassert.assertEquals(homePg.getHipaaText().isDisplayed(), true, "Hipaa image is not provided on home page");
		homePg.getHipaaImage().click();

		// Switching the driver control
		String ParentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		SwitchingDriverControl.switchDriverControl(driver, ParentWindowId, allWindowId);

		extentTest.info("Successfully navigated to hipaa risk management system page");

	}

	@BeforeSuite
	public void initialiseExtendReports() {

		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Result.html");
		// creating object for extent report
		extentReports = new ExtentReports();
		extentReports.attachReporter(sparkReporter);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
	}

	@AfterSuite
	public void generateExtentReports() throws IOException {
		extentReports.flush();
		Desktop.getDesktop().browse(new File("Result.html").toURI());
	}

	@AfterMethod
	public void quit(Method m, ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = null;
			screenShotPath = captureScreenShot(
					result.getTestContext().getName() + "_" + result.getMethod().getMethodName() + ".png");
			extentTest.addScreenCaptureFromPath(screenShotPath);
			extentTest.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.pass(m.getName() + " is passed");
		}
	}

	@AfterTest
	public void quit() {

		driver.quit();
		softassert.assertAll();

	}

	public String captureScreenShot(String fileName) {
		if (screenShotsSubFolderName == null) {
			LocalDateTime myDataObj = LocalDateTime.now();
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
			screenShotsSubFolderName = myDataObj.format(myFormatObj);
		}
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/" + screenShotsSubFolderName + "/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (Exception e) {
		}
		return destFile.getAbsolutePath();
	}
}
