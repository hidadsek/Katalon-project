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

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'edit-first-name\']', varFirstname)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'edit-last-name\']', varLastname)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'edit-email\']', varEmail)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'edit-phone\']', varContact)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectCountryDropDownList'('Vietnam')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'state\']', varCity)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectNationalityDropDownList'('Vietnamese')

