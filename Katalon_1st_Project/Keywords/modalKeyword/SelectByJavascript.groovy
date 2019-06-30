package modalKeyword

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class SelectByJavascript {
	@Keyword
	def clickButtonJavascript(String xpath) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			WebElement element =driver.findElement(By.xpath(xpath));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()",element);
			KeywordUtil.markPassed("Element has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}
	
	@Keyword
	def setTextElementJavascript(String xpath, String text) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath(xpath)).sendKeys(text);
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	void jsClicker(String selector) {
		String js = '''
		var selector = arguments[0],
        	elem = document.querySelector(selector);
		elem.click();
		''';
		WebUI.executeJavaScript(js, Arrays.asList(selector));
	}
}
