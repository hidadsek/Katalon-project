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

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'state\']', '')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//*[@id="edit-actions-submit"]')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'edit-first-name\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'First name must have a value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'edit-last-name\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'Last name must have a value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'edit-email\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'Email must be a valid e-mail')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'edit-phone\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'Contact number must have a value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//select[@id=\'edit-country\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'Country of residence must have a value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyTextByXPath'('//input[@id=\'state\']//following-sibling::div[@class="ui basic red pointing prompt label transition visible"]', 
    'City of residence must have a value')

CustomKeywords.'actionKeyword.VerifyKeyword.verifyElementExistByXpath'('//*[@id="edit-general-footer"]/div/div[contains(@class,\'error\')]')

