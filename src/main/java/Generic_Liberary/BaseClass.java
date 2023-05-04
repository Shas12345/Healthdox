package Generic_Liberary;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

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

	@BeforeClass
	@Parameters("bname")
	public void driver(@Optional("chrome") String bname) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		// Getting browser value from xml and comparing them.
		if (bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Reporter.log("Chrome Browser launched successfully", true);

		} else if (bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log("Firefox Browser launched successfully", true);
		} else if (bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			Reporter.log("Edge Browser launched successfully", true);
		} else {
			System.out.println("Invalid browser name");
			Reporter.log("Invaid Browser", true);
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		explicit = new WebDriverWait(driver, 15);

		// Up casting the driver for JavaScrtpt
		js = (JavascriptExecutor) driver;

		softassert = new SoftAssert();

		// navigating to the application by entering the url
		String url = data.fromPropertyFile("url");
		driver.get(url);
		Reporter.log("Successfully navigated to the url", true);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.linkText("Proceed to demo.healthdox.com (unsafe)")).click();

		// using action class reference variable to do mouse over actions on the
		// application
		action = new Actions(driver);

		// Verifying the title of the application
		String actualTitle = driver.getTitle();
		String expectedTitle = data.fromPropertyFile("expectedTitle");
		softassert.assertEquals(expectedTitle, actualTitle, "Title is mismatched");
		Reporter.log("Title Matched", true);

		// Verifying UserId TextBox is displayed.
		softassert.assertEquals(loginPg.getUserIdTextBox().isDisplayed(), true,
				"UserId TextBox is not displayed in the home page");
		Reporter.log("UserId TextBox is provided in login page", true);
		String actualUserIdPlaceHolder = loginPg.getUserIdTextBox().getAttribute("placeholder");
		String expectedUserIdPlaceHolder = data.fromPropertyFile("userIdPlaceHolder");

		softassert.assertEquals(expectedUserIdPlaceHolder, actualUserIdPlaceHolder,
				"Place Holder is not provided in UserId TextBox");
		Reporter.log("Place Holder is provided for UserId TextBox in login page", true);
		// Entering UserId into UserId TextBox.
		loginPg.getUserIdTextBox().clear();
		loginPg.getUserIdTextBox().sendKeys(data.fromPropertyFile("username"));
		String actualValue = loginPg.getUserIdTextBox().getAttribute("value");
		String expectedValue = data.fromPropertyFile("username");
		softassert.assertEquals(expectedValue, actualValue, "Entered value is not matching with expected value");

		// Verifying Password TextBox is displayed
		softassert.assertEquals(loginPg.getPasswordTextBox().isDisplayed(), true,
				"password TextBox is not displayed in the home page");
		Reporter.log("password TextBox is provided in login page", true);
		String actualpasswordPlaceHolder = loginPg.getPasswordTextBox().getAttribute("placeholder");
		String expectedpasswordPlaceHolder = data.fromPropertyFile("passwordPlaceHolder");
		softassert.assertEquals(expectedpasswordPlaceHolder, actualpasswordPlaceHolder,
				"Place Holder is not provided in Password TextBox");
		Reporter.log("Place Holder is provided for UserId TextBox in login page", true);

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
		Reporter.log("Clicked on Login button in login page", true);

		// Clicking on the login button.
		loginPg.getLoginButton().click();

		// Waiting till the elements are loading
		explicit.until(ExpectedConditions.visibilityOf(homePg.getNavBarText()));
		Reporter.log("Successfully navigated to home page of the application", true);
		
		// Verifying Hipaa image module and performing click action
		softassert.assertEquals(homePg.getHipaaText().isDisplayed(), true, "Hipaa image is not provided on home page");
		homePg.getHipaaImage().click();

		// Switching the driver control
		String ParentWindowId = driver.getWindowHandle();
		Set<String> allWindowId = driver.getWindowHandles();
		SwitchingDriverControl.switchDriverControl(driver, ParentWindowId, allWindowId);

		Reporter.log("Successfully navigated to hipaa risk management system page", true);

	}

	@AfterClass
	public void quit() {
		driver.quit();
		softassert.assertAll();

	}

}
