package actionKeyword
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.List
import java.util.concurrent.TimeUnit
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
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.remote.server.handler.FindElement
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class SelectByXPathKeyword {
	/**
	 * Enter text in element
	 * @param to xpath, driver is default
	 */
	@Keyword
	def setTextElementByXPath(String xpath, String text) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath(xpath)).clear();
			driver.findElement(By.xpath(xpath)).sendKeys(text);
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Text is inputted successfully");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to enter text");
		}
	}

	/**
	 * Click element
	 * @param to xpath, driver is default
	 */
	@Keyword
	def clickElementByXPath(String xpath) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath(xpath)).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Element has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	@Keyword
	def clickElementByOffset(String xpath, int x, int y) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			WebElement elem =driver.findElement(By.xpath(xpath));
			Actions build = new Actions(driver);
			build.moveToElement(elem, x, y).click().build().perform();
			KeywordUtil.markPassed("Element has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	/**
	 * Select country
	 * @param to xpath, driver is default
	 */
	@Keyword
	def selectStoriesBySection(String section) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath("//*[@id='country-list']//a[contains(text(),'"+section+"')]")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Section has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
	/**
	 * Select country
	 * @param to xpath, driver is default
	 */
	@Keyword
	def selectStoriesInList(String storyTitle) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath("//*[@id='stories-list']//div//a/span[text()='"+storyTitle+"']")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Story has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	/**
	 * Select country
	 * @param to xpath, driver is default
	 */
	@Keyword
	def selectSerie(String serie) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath("//*[@id='series-list']//h2[contains(text(),'"+serie+"')]/../following-sibling::div/a")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Serie has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	/**
	 * Select dropdown
	 * @param to xpath, driver is default
	 */
	@Keyword
	def selectDropdownByXpath(String xpath, String value) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			WebElement element = driver.findElement(By.xpath(xpath));
			Select selectElement = new Select(element);
			selectElement.selectByVisibleText(value);
			Thread.sleep(5000);
			KeywordUtil.markPassed("Dropdownlist has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
	/**
	 * Select dropdownlist item
	 * @param to xpath, driver is default
	 */
	@Keyword
	def selectGoodStoryDropDownList(String value) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			WebElement elem = driver.findElement(By.xpath("//li[starts-with(@id, 'select2-edit-field-gsoty-category-target-id-result-') and contains(text(),'"+value+"')]")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Dropdownlist has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
	/**
	 * Select a person by one's role
	 * @param to xpath, driver is default
	 */
	@Keyword
	def selectPersonByRole(String role) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			String text = driver.findElement(By.xpath("//*[@id='block-obw-theme-content']//div[contains(text(),'"+role+"')]")).getText();
			WebElement elem = driver.findElement(By.xpath("//*[@id='block-obw-theme-content']//div[contains(text(),'"+role+"')]")).click();
			String verifiedText = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div")).getText();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			boolean isMatch = verifiedText.contains(text);
			if (isMatch == true){
				KeywordUtil.markPassed("Pop-up displays successfully");
			}
			else {
				KeywordUtil.markFailed(verifiedText+" do not match");
			}
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	/**
	 * Select payment by type
	 * @param to paymentType and amount, driver is default
	 */
	@Keyword
	def selectPaymentType(String paymentType, String amount) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			String xpath = "//*[@id='edit-custom-amount-donation' and @required]";
			boolean isExisted = isElementExistedByXPath(xpath);
			if (paymentType == 'Custom') {
				if (isExisted == false) {
					driver.findElement(By.xpath("//*[@id='edit-support-us-step-1']/div[2]/label")).click();
					driver.findElement(By.xpath(xpath)).sendKeys(amount);
				}
				else{
					driver.findElement(By.xpath(xpath)).sendKeys(amount);
				}
			}
			else {
				driver.findElement(By.xpath("//label[starts-with(@for,'edit-amount-donation')]//preceding-sibling::input [@value='"+amount+"']")).click();
			}
			driver.findElement(By.xpath("//*[@id='edit-support-us-step-1']/label[2]")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Pop-up displays successfully");
		}
		catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		}
		catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
	/**
	 * Check if element exist
	 * @param to xpath, driver is default
	 */
	boolean isElementExistedByXPath(String xpath) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			java.util.List<WebElement> elem =driver.findElements(By.xpath(xpath));
			if (elem.size() == 0){
				return false;
			}
			else {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Select dropdownlist item
	 * @param to value, driver is default
	 */
	@Keyword
	def selectSubjectDropDownList(String value) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath("//*[@id='edit-header-section']/div/div[2]/span")).click();
			driver.findElement(By.xpath("//li[starts-with(@id,'select2-edit-purpose-result') and contains(text(),'"+value+"')]")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Dropdownlist has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	/**
	 * Select dropdownlist item
	 * @param to value, driver is default
	 */
	@Keyword
	def selectCountryDropDownList(String value) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath("//*[@id='select2-edit-country-container']")).click();
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")).sendKeys(value);
			driver.findElement(By.xpath("//li[starts-with(@id,'select2-edit-country-result') and contains(text(),'"+value+"')]")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Dropdownlist has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
	/**
	 * Select dropdownlist item
	 * @param to value, driver is default
	 */
	@Keyword
	def selectNationalityDropDownList(String value) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath("//*[@id='select2-edit-nationality-container']")).click();
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']//input")).sendKeys(value);
			driver.findElement(By.xpath("//li[starts-with(@id,'select2-edit-nationality-result') and contains(text(),'"+value+"')]")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Dropdownlist has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
	/**
	 * Select skill item
	 * @param to skill, driver is default
	 */
	@Keyword
	def selectSkillByXpath(String skill) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath("//label[@class='option' and contains(text(),'"+skill+"')]//preceding-sibling::input[starts-with(@id,'edit-skills')]")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Skill is clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
	/**
	 * Select radio button item
	 * @param to value, driver is default
	 */

	@Keyword
	def selectChoiceByXpath(String xpath,String answer) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			answer =answer.trim();
			answer =answer.toLowerCase();
			if (answer =='yes'){
				driver.findElement(By.xpath(xpath+"//input[@value='yes']")).click();
			}
			else {
				driver.findElement(By.xpath(xpath+"//input[@value='no']")).click();
			}
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
			KeywordUtil.markPassed("Radio button is clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	/**
	 * Select dropdownlist item
	 * @param to value, driver is default
	 */
	@Keyword
	def selectPersonCountryDropDownList(String value) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			driver.findElement(By.xpath("//*[@id='select2-edit-where-in-asia-is-this-organisation-based--container']")).click();
			driver.findElement(By.xpath("//span[@class='select2-search select2-search--dropdown']/input")).sendKeys(value);
			driver.findElement(By.xpath("//li[starts-with(@id,'select2-edit-where-in-asia-is-this-organisation-based') and contains(text(),'"+value+"')]")).click();
			driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
			KeywordUtil.markPassed("Dropdownlist has been clicked");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	/**
	 * Input n item as text in format: 1st item, 2nd item, 3rd item
	 * @param to value, driver is default
	 */
	@Keyword
	def selectMultipleAreaInList(String value) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			java.util.List<String> myList = new ArrayList<String>(Arrays.asList(value.split(",")));
			for (int i =0; i< myList.size(); i++){
				driver.findElement(By.xpath("//*[@id='edit-organisation-profile']//span[@class='select2-selection select2-selection--multiple']")).click();
				driver.findElement(By.xpath("//*[@id='edit-organisation-profile']//li[@class='select2-search select2-search--inline']/input")).sendKeys(myList[i]);
				driver.findElement(By.xpath("//li[starts-with(@id,'select2-edit-what-area-is-this-organisation-doing-good') and contains(text(),'"+myList[i]+"')]")).click();
				driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
			}
			KeywordUtil.markPassed("All areas are selected");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}

	/**
	 * Input n item as text in format: 1st item, 2nd item, 3rd item
	 * @param to value, driver is default
	 */
	@Keyword
	def selectMultipleActionInList(String value) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			java.util.List<String> myList = new ArrayList<String>(Arrays.asList(value.split(",")));
			for (int i =0; i< myList.size(); i++){
				driver.findElement(By.xpath("//label[starts-with(@for,'edit') and text()='"+myList[i]+"']//preceding-sibling::input")).click();
			}
			driver.findElement(By.xpath("//div[starts-with(@id,'edit-markup')]/a")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			KeywordUtil.markPassed("All actions are selected");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
	/**
	 * Select navigation in Nav bar
	 * @param to value, driver is default
	 */
	@Keyword
	def selectOptionInNavBar(String navOtion, String topic ) {
		try {
			WebDriver driver = DriverFactory.getWebDriver();
			Actions builder = new Actions(driver);
			WebElement elem = driver.findElement(By.xpath("//nav[@id='block-mainnavigation']//li//a[text()='"+navOtion+"']"));
			builder.moveToElement(elem).perform();
			driver.findElement(By.xpath("//nav[@id='block-mainnavigation']//li/ul//a[text()='"+topic+"']")).click();
			KeywordUtil.markPassed("Option is selected");
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found");
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element");
			e.printStackTrace();
		}
	}
}