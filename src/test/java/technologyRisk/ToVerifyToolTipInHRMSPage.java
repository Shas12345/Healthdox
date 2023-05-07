package technologyRisk;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_Liberary.BaseClass;

public class ToVerifyToolTipInHRMSPage extends BaseClass {
	@Test
	public void toVerifyToolTipInHRMSPage() {
		// hovering on Technology Risk Assessment image
		action.moveToElement(hrmPg.getTraImage()).perform();
		softassert.assertEquals(hrmPg.getTraImage().getAttribute("title"), data.fromPropertyFile("technologyToolTip"),
				"Technology tooltip is not provided in HRMS Page");
		Reporter.log("Verified tool tip for Technology Risk Assessment in HRMS Page",true);
		extentTest.info("Verified tool tip for Technology Risk Assessment in HRMS Page");
		// hovering on Administrative Risk Assessment image
		action.moveToElement(hrmPg.getAraImage()).perform();
		softassert.assertEquals(hrmPg.getAraImage().getAttribute("title"),
				data.fromPropertyFile("administrativeToolTip"), "Administrative tooltip is not provided in HRMS Page");
		Reporter.log("Verified tool tip for Administrative Risk Assessment in HRMS Page",true);
		extentTest.info("Verified tool tip for Administrative Risk Assessment in HRMS Page");
		// hovering on Physical Risk Assessment image
		action.moveToElement(hrmPg.getPraImage()).perform();
		softassert.assertEquals(hrmPg.getPraImage().getAttribute("title"), data.fromPropertyFile("physicalToolTip"),
				"Physical tooltip is not provided in HRMS Page");
		Reporter.log("Verified tool tip for Physical Risk Assessment in HRMS Page",true);
		extentTest.info("Verified tool tip for Physical Risk Assessment in HRMS Page");
		// hovering on Risk Review Board image
		action.moveToElement(hrmPg.getRrbImage()).perform();
		softassert.assertEquals(hrmPg.getRrbImage().getAttribute("title"), data.fromPropertyFile("riskReviewToolTip"),
				"Risk Review Board tooltip is not provided in HRMS Page");
		Reporter.log("Verified tool tip for Risk Review Board in HRMS Page",true);
		extentTest.info("Verified tool tip for Risk Review Board in HRMS Page");

	}

}
