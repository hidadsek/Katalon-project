import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'actionKeyword.BrowserKeyword.openBrowser'('https://www.ourbetterworld.org/')

CustomKeywords.'actionKeyword.MouseHoverKeyword.moveMouseToObject'('//div[@class=\'navigation float-left\']//li//a[text()=\'Stories\']')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//div[@class=\'navigation float-left\']//li//li/a[text()=\'Good Story of the Year\']')

CustomKeywords.'modalKeyword.DelayModal.deLay'(5000)

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//div[@id="block-obw-theme-content"]//h1[@class=\'text-center\']', 
    'Winners of Good Story of the Year')

CustomKeywords.'actionKeyword.MouseHoverKeyword.scrollToObject'('//*[@id="views-exposed-form-gsoty-list-block-gsoty-list"]/div/div[2]/div[2]/div/div[1]/span')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//*[@id="views-exposed-form-gsoty-list-block-gsoty-list"]/div/div[2]/div[2]/div/div[1]')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectGoodStoryDropDownList'('India')

WebUI.waitForJQueryLoad(10)

CustomKeywords.'modalKeyword.DelayModal.deLay'(5000)

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//*[@id="stories-list"]/div/div/div[1]/div/div[2]/p', 'INDIA')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyText'('//*[@id="stories-list"]/div/div/div[1]/div', '//*[@id="story"]/div/div/div[1]/div/div[1]/h1/span')

