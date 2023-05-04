package technologyRisk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class TestVerticalScroll extends BaseClass {
	@Test
	public void toadd() {
		String riskId = "RSKT689";
		hrmPg.getRiskReviewBoardText().click();
		riskReviewPg.getTechnologyRisk().click();
		WebElement scrollEle = driver.findElement(By.xpath("(//td[text()='Actions'])[3]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrollEle);
		driver.findElement(
				By.xpath("(//td[contains(text(),'" + riskId + "')]/..//a[contains(@onClick,'" + riskId + "')])[3]"))
				.click();

	}

}
