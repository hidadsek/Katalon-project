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

WebUI.openBrowser('https://www.ourbetterworld.org/')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//li[@class=\'signup\']')

CustomKeywords.'modalKeyword.SelectByJavascript.deLay'(1)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@placeholder=\'First name\']', 'Thuc')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@placeholder=\'Last name\']', 'Nguyen')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@placeholder=\'Email\']', 'nguyendongthuc13@gmail.com')

CustomKeywords.'actionKeyword.SelectByCSSKeyword.clickElementByXPath'('input[data-drupal-selector=edit-field-account-accept-tnc-value]')

not_run: CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//input[@value=\'Sign up\']')

not_run: WebUI.closeBrowser()

