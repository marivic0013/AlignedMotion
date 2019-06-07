package selenium.alignedMotion.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import selenium.alignedMotion.Util.Utility;
import selenium.alignedMotion.Util.ProjectConfiguration;
import selenium.alignedMotion.Util.TestCaseBase;
import selenium.alignedMotion.Data.AMotionManageTeacher_Data;

public class AlignedMotionTeacherAuthentication_POM {

	By loginErrorMessage = By.xpath("//p[contains(text(),'Invalid email or password.')]");
	By login_Username_Field = By.id("email");
	By login_Password_Field = By.id("password");
	By login_login_Button = By.id("signIn");

	public void successLogin_POM(WebDriver driver) {
		// login variables
		String login_username = "teacher41@yopmail.com";
		String login_password = "pass2";

		driver.get(ProjectConfiguration.url);

		// login method
		Utility.typeThis(driver, login_Username_Field, login_username);
		Utility.typeThis(driver, login_Password_Field, login_password);
		Utility.clickThis(driver, login_login_Button);

	}

	public void xPasswordLogin_POM(WebDriver driver) {
		// login variables
		String login_username = "teacher41@yopmail.com";
		String login_password = "pass3";

		driver.get(ProjectConfiguration.url);

		// login method
		Utility.typeThis(driver, login_Username_Field, login_username);
		Utility.typeThis(driver, login_Password_Field, login_password);
		Utility.clickThis(driver, login_login_Button);
		Utility.temporaryWaitSolution();
		// validate
		String checkText = driver.findElement(loginErrorMessage).getAttribute("value");
		Utility.logger("test" + checkText);

		if (checkText.contains("Invalid email or password.")) {
			Utility.logger("Validated incorrect password ");
		}

		else {
			Assert.fail();
		}

	}

	public void xEmailLogin_POM(WebDriver driver) {
		// login variables
		String login_username = "teacher5454121215454@yopmail.com";
		String login_password = "pass2";

		driver.get(ProjectConfiguration.url);

		// login method
		Utility.typeThis(driver, login_Username_Field, login_username);
		Utility.typeThis(driver, login_Password_Field, login_password);
		Utility.clickThis(driver, login_login_Button);
		Utility.temporaryWaitSolution();
		// validate
		String checkText = driver.findElement(loginErrorMessage).getAttribute("value");
		Utility.logger("test" + checkText);

		if (checkText.contains("Invalid email or password.")) {
			Utility.logger("Validated incorrect email ");
		}

		else {
			Assert.fail();
		}

	}

}
