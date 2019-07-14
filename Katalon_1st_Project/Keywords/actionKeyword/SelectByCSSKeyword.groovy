package actionKeyword

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

public class SelectByCSSKeyword {
	@Keyword
	def clickElementByXPath(String css) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.cssSelector(css)).click();
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
}
