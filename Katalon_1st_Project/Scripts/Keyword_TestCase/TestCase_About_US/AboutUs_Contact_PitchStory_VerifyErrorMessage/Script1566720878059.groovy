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

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectOptionInNavBar'('About Us', 'Contact us')

CustomKeywords.'modalKeyword.DelayModal.deLay'(5000)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectSubjectDropDownList'('Pitch us a story')

WebUI.callTestCase(findTestCase('Feature_TestCase/TestCase_About_US/AboutUs_Contact_GeneralErrorMessage'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'edit-name-of-organisation\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'Please input value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//*[@id="edit-organisation-profile"]/div/div[3]/div', 'Please select value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'edit-organisation-website\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'Please input value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//*[@id="edit-organisation-profile"]/div/div[6]/div', 'Please select value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'edit-explain-what-good-the-organisation-does-in-the-community\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'Please input value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'edit-who-are-the-main-beneficiaries-of-this-organisation\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'Please input value')

