package actionKeyword

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates
import org.openqa.selenium.interactions.Locatable

import java.awt.Point

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import internal.GlobalVariable

public class MouseHoverKeyword {
	/**
	 * Hover an element
	 * @param to xpath, driver is default
	 */
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

	/**
	 * Scroll down to an element
	 * @param to xpath, driver is default
	 */
	@Keyword
	def scrollToObject(String xpath) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			WebElement element = driver.findElement(By.xpath(xpath));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			//jse.executeScript("arguments[0].scrollIntoView(true);", element);
			//Thread.sleep(500);
			int x = element.getLocation().getX();
			int y = element.getLocation().getY()-100;
			jse.executeScript("scroll("+x+", "+y+")");
			Thread.sleep(500);
			KeywordUtil.markPassed("Scroll to "+y+" and successfully")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to move to element")
		}
	}
}
