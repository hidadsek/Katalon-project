package actionKeyword

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Desktop.Action

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.remote.server.handler.FindElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

public class VerifyKeyword {
	/**
	 * Verify text in element
	 * @param to xpath, driver is default
	 */
	@Keyword
	def verifyTextByXPath(String xpath, String text) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			String verifiedText= driver.findElement(By.xpath(xpath)).getText();
			boolean isMatch = verifiedText.contains(text);
			if (isMatch == true){
				KeywordUtil.markPassed("Text is verified successfully");
			}
			else {
				KeywordUtil.markFailed(verifiedText+" do not match");
			}
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error happens");
			e.printStackTrace();
		}
	}

	/**
	 * Verify text in element
	 * @param to CSS, driver is default
	 */
	@Keyword
	def verifyTextByCSS(String css, String text) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			String verifiedText= driver.findElement(By.cssSelector(css)).getText();
			if (text==verifiedText.trim()){
				KeywordUtil.markPassed("Text is verified successfully");
			}
			else {
				KeywordUtil.markFailed("Text do not match");
			}
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error happens");
			e.printStackTrace();
		}
	}

	/**
	 * Verify URL in element
	 * @param to url, driver is default
	 */
	@Keyword
	def verifyURLInDifferentTab(String url) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			switchTab();
			String currentURL= driver.getCurrentUrl();
			if (currentURL.contains(url)== true){
				KeywordUtil.markPassed("URL is verified successfully");
			}
			else {
				KeywordUtil.markFailed(""+currentURL+" do not match");
			}
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error happens");
			e.printStackTrace();
		}
	}
	/**
	 * Verify URL in element
	 * @param to url, driver is default
	 */
	@Keyword
	def verifyURLInTheSameTab(String url) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			String currentURL= driver.getCurrentUrl();
			if (currentURL.contains(url)== true){
				KeywordUtil.markPassed("URL is verified successfully");
			}
			else {
				KeywordUtil.markFailed(""+currentURL+" do not match");
			}
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error happens");
			e.printStackTrace();
		}
	}

	def switchTab(){
		try{
			WebDriver driver = DriverFactory.getWebDriver();
			Set<String> handles = driver.getWindowHandles();
			String currentHandle = driver.getWindowHandle();
			for (String handle : handles) {

				if (!handle .equals(currentHandle)) {
					driver.switchTo().window(handle);
				}
			}
		} catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error happens");
			e.printStackTrace();
		}
	}
	/**
	 * Verify text in element
	 * @param to xpath, driver is default
	 */
	@Keyword
	def verifyText(String xpath1, String xpath2) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			String verifiedText= driver.findElement(By.xpath(xpath1+"//h3//span")).getText();
			driver.findElement(By.xpath(xpath1+"//span")).click();
			String text= driver.findElement(By.xpath(xpath2)).getText();
			boolean isMatch = verifiedText.contains(text);
			if (isMatch == true){
				KeywordUtil.markPassed("Text is verified successfully");
			}
			else {
				KeywordUtil.markFailed(verifiedText+" do not match "+ text);
			}
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error happens");
			e.printStackTrace();
		}
	}

	/**
	 * Verify text in element
	 * @param to xpath, driver is default
	 */
	@Keyword
	def verifyElementExistByXpath(String xpath) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			boolean isMatch = true;
			java.util.List<WebElement> elem =driver.findElements(By.xpath(xpath));
			if (elem.size() == 0){
				isMatch = false;
			}
			if (isMatch == true){
				KeywordUtil.markPassed("Element exists");
			}
			else {
				KeywordUtil.markFailed("Element does not exists");
			}
		} catch (Exception e) {
			KeywordUtil.markFailed("Unexpected error happens");
			e.printStackTrace();
		}
	}
}
