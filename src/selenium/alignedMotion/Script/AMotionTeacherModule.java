package selenium.alignedMotion.Script;

import selenium.alignedMotion.Util.TestCaseBase;
import org.testng.annotations.Test;
import selenium.alignedMotion.Util.Utility;

public class AMotionTeacherModule extends TestCaseBase

{

	/*
	 * This class is for listing all scenarios from the test cases; Also for easier
	 * tracking on which step the error occured by detailing the step by step below.
	 * This way non-technical people will still be able to understand/assess the
	 * flow of the program
	 */

	// -----------------------------MANAGE
	// TEACHER------------------------------------

	@Test(priority = 0)
	public void xPasswordLogin() {
		Utility.logger("STEP1: LOAD TEACHER PLATFORM");
		Utility.logger("STEP1: ENTER CORRECT EMAIL");
		Utility.logger("STEP1: ENTER INCORRECT PASSWORD");
		aMotionTeacherAuth.xPasswordLogin_POM(driver);

	}

	@Test(priority = 1)
	public void xEmailLogin() {
		Utility.logger("STEP1: LOAD TEACHER PLATFORM");
		Utility.logger("STEP1: ENTER INCORRECT EMAIL");
		Utility.logger("STEP1: ENTER CORRECT PASSWORD");
		aMotionTeacherAuth.xEmailLogin_POM(driver);

	}
/*
	@Test(priority = 2)
	public void successLogin() {
		Utility.logger("STEP1: LOAD TEACHER PLATFORM");
		Utility.logger("STEP1: ENTER CORRECT EMAIL");
		Utility.logger("STEP1: ENTER CORRECT PASSWORD");
		aMotionTeacherAuth.successLogin_POM(driver);

	}

	@Test(priority = 3)
	public void editPersonalInfo() {
		Utility.logger("TEST SCENARIO 1: Edit Personal Info");
		Utility.logger("STEP 1: LOG IN ACCOUNT");
		Utility.logger("STEP 2: CLICK PROFILE MENU");
		Utility.logger("STEP 3: CLICK MY ACCOUNT TAB");
		aMotionManageTeacher.edit_PersonalInfo_POM(driver);
	}

	/*
	 * @Test (priority = 0) public void changePassword () {
	 * Utility.logger("TEST SCENARIO 2: Change Password");
	 * Utility.logger("STEP 1: LOG IN ACCOUNT");
	 * Utility.logger("STEP 2: CLICK PROFILE MENU");
	 * Utility.logger("STEP 3: CLICK MY SETTINGS");
	 * aMotionManageTeacher.changePassword_POM(driver);
	 * 
	 * }
	 * 
	 * 
	 * @Test (priority = 4) public void edit_PersonalInfo_TeacherLvl_POM () {
	 * Utility.logger("TEST SCENARIO 3: Change Password");
	 * Utility.logger("STEP 1: LOG IN ACCOUNT");
	 * Utility.logger("STEP 2: CLICK PROFILE MENU");
	 * Utility.logger("STEP 3: CLICK MY SETTINGS");
	 * aMotionManageTeacher.edit_PersonalInfo_TeacherLvl_POM(driver);
	 * 
	 * }
	 */

}