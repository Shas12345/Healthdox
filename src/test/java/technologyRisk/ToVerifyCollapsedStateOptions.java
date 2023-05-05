package technologyRisk;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyCollapsedStateOptions extends BaseClass {

	@Test
	public void collapseFunctionalityofNavBarInTechnologyRisk() {
		// Clicking on technology risk on HRMS Page

		// Verifying all options in the collapsed state
		explicit.until(ExpectedConditions.visibilityOf(basePg.getCollapseIcon()));
		basePg.getCollapseIcon().click();
		action.moveToElement(basePg.getKriDashboardicon()).perform();
		explicit.until(ExpectedConditions.visibilityOf(basePg.getCollapseNavBar()));
		action.moveToElement(basePg.getKriDashboardLeftNavBar()).perform();
	}

}
