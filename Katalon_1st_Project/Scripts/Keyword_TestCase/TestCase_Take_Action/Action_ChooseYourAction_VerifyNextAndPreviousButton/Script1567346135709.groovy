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

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectOptionInNavBar'('Take Action', 'Choose your action')

CustomKeywords.'modalKeyword.DelayModal.deLay'(5000)

WebUI.callTestCase(findTestCase('Feature_TestCase/TestCase_Take_Action/Action_VerifyActionPage'), [('varStep') : 'Step 1 of 3'
        , ('varAction') : 'Select your preferred actions', ('varButton') : '//*[starts-with(@id,\'edit-markup\')]/a[text()=\'Next\']'], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//*[starts-with(@id,\'edit-markup\')]/a[text()=\'Next\']')

WebUI.callTestCase(findTestCase('Feature_TestCase/TestCase_Take_Action/Action_VerifyActionPage'), [('varStep') : 'Step 2 of 3'
        , ('varAction') : 'Select causes you want to support', ('varButton') : '//p[@class=\'back-quiz\']//i'], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//*[starts-with(@id,\'edit-markup\')]/a[text()=\'Next\']')

WebUI.callTestCase(findTestCase('Feature_TestCase/TestCase_Take_Action/Action_VerifyActionPage'), [('varStep') : 'Step 3 of 3'
        , ('varAction') : 'Select countries where you want to take action', ('varButton') : '//a[contains(@class,\'preview-quiz btn-quiz\') and contains(text(),\'Show me who I can help\')]'], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//p[@class=\'back-quiz\']//i')

WebUI.callTestCase(findTestCase('Feature_TestCase/TestCase_Take_Action/Action_VerifyActionPage'), [('varStep') : 'Step 2 of 3'
        , ('varAction') : 'Select causes you want to support', ('varButton') : '//p[@class=\'back-quiz\']//i'], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//p[@class=\'back-quiz\']//i')

WebUI.callTestCase(findTestCase('Feature_TestCase/TestCase_Take_Action/Action_VerifyActionPage'), [('varStep') : 'Step 1 of 3'
        , ('varAction') : 'Select your preferred actions', ('varButton') : '//*[starts-with(@id,\'edit-markup\')]/a[text()=\'Next\']'], 
    FailureHandling.STOP_ON_FAILURE)

