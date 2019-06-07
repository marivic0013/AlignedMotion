package selenium.alignedMotion.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import selenium.alignedMotion.Util.Utility;
import selenium.alignedMotion.Util.TestCaseBase;
import selenium.alignedMotion.Data.AMotionManageTeacher_Data;

/*This class is used for declaring elements, and creating scenario methods based on the test cases
This class interacts with testcasebase class, utility class and script class*/

public class AMotionManageTeacher_POM {

	private static final String String = null;
	// element locators
	By profileMenuButton = By.xpath("//i[contains(text(),'arrow_drop_down')]");
	By myAccountButton = By.className("c-menu-dropdown__item");
	By firstNameTextBox = By.id("firstName");
	By lastNameTextBox = By.id("lastName");
	By savePersonalInfoButton = By.id("savePersonalInformation");
	By mySettingsButton = By.xpath("//span[contains(text(),'My Settings')]");
	By currentPasswordTextBox = By.id("currentPassword");
	By newPasswordTextBox = By.id("newPassword");
	By confirmPasswordTextBox = By.id("confirmPassword");
	By savePasswordButton = By.id("saveNewPassword");
	By successNotif = By.xpath("//span[contains(text(),'Your password has been changed')]");
	By notifCloseButton = By.xpath("//i[contains(text(),'close')]");
	By levelDropDown = By.id("level");
	By newLevel = By.id("level_0");

	// functionality and methods

	public void edit_PersonalInfo_POM(WebDriver driver) {
		Utility.temporaryWaitSolutionShort();
		Utility.clickThis(driver, profileMenuButton);
		Utility.clickThis(driver, myAccountButton);
		// Utility.clickThis(driver, firstNameTextBox);
		Utility.typeThis(driver, firstNameTextBox, AMotionManageTeacher_Data.fname);
		Utility.clickThis(driver, savePersonalInfoButton);
		Utility.temporaryWaitSolutionShort();
		Utility.scrollUp(driver);
		Utility.temporaryWaitSolutionShort();
		Utility.clickThis(driver, notifCloseButton);
		// validate
		String checkText = driver.findElement(firstNameTextBox).getAttribute("value");
		Utility.logger("test" + checkText);

		if (checkText.contains(AMotionManageTeacher_Data.fname)) {
			Utility.logger("Successfully Edited FirstName");
		}

		else {
			Assert.fail();
		}

	}

	public void edit_PersonalInfo_TeacherLvl_POM(WebDriver driver) {
		Utility.temporaryWaitSolutionShort();
		Utility.clickThis(driver, profileMenuButton);
		Utility.clickThis(driver, myAccountButton);
		Utility.temporaryWaitSolutionShort();
		Utility.clickThis(driver, levelDropDown);
		Utility.clickThis(driver, newLevel);
		Utility.clickThis(driver, savePersonalInfoButton);
		Utility.temporaryWaitSolutionShort();
		Utility.clickThis(driver, notifCloseButton);
		// validate
		/*
		 * String checkText = driver.findElement(newLevel).getAttribute("value");
		 * Utility.logger("test" + checkText);
		 * 
		 * if(checkText.contains(AMotionManageTeacher_Data.fname)) {
		 * Utility.logger("Successfully Edited FirstName"); }
		 * 
		 * else { Assert.fail(); }
		 */

	}

	public void changePassword_POM(WebDriver driver) {
		Utility.temporaryWaitSolutionShort();
		Utility.clickThis(driver, profileMenuButton);
		Utility.temporaryWaitSolutionShort();
		Utility.clickThis(driver, mySettingsButton);
		Utility.temporaryWaitSolutionShort();
		Utility.typeThis(driver, currentPasswordTextBox, AMotionManageTeacher_Data.currentPass);
		Utility.typeThis(driver, newPasswordTextBox, "pass2");
		Utility.typeThis(driver, confirmPasswordTextBox, "pass2");
		Utility.temporaryWaitSolutionShort();
		Utility.clickThis(driver, savePasswordButton);
		Utility.temporaryWaitSolutionShort();

		// validate
		if (driver.findElements(successNotif).size() != 0) {
			Utility.logger("Password successfully changed.");
		} else {
			Assert.fail();
		}
		Utility.clickThis(driver, notifCloseButton);

	}

}
