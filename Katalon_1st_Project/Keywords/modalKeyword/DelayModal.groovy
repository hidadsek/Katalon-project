package modalKeyword

import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

public class DelayModal {
	@Keyword
	def deLay(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to delay");
		}
	}

	@Keyword
	def implicitWait(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to wait");
		}
	}
}
