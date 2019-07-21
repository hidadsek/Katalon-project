package actionKeyword

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import internal.GlobalVariable

public class MouseHoverKeyword {
	@Keyword
	def moveMouseToObject(String xpath) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			Actions builder = new Actions(driver);
			WebElement elem = driver.findElement(By.xpath(xpath));
			builder.moveToElement(elem).perform();
			KeywordUtil.markPassed("Mouse moves successfully")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to move to element")
		}
	}
}
