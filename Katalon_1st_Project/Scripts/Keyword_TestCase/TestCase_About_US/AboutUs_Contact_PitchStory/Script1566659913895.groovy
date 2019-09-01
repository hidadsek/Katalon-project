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

CustomKeywords.'actionKeyword.MouseHoverKeyword.moveMouseToObject'('//div[@class=\'navigation float-left\']//li//a[text()=\'About Us\']')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.clickElementByXPath'('//div[@class=\'navigation float-left\']//li//li/a[text()=\'Contact us\']')

CustomKeywords.'modalKeyword.DelayModal.deLay'(5000)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectSubjectDropDownList'('Pitch us a story')

WebUI.callTestCase(findTestCase('Feature_TestCase/TestCase_About_US/AboutUs_Contact_FillInData'), [('varFirstname') : 'Thuc'
        , ('varLastname') : 'Nguyen', ('varEmail') : 'nguyendongthuc13@gmail.com', ('varContact') : '579135', ('varCountry') : 'Vietnam'
        , ('varCity') : 'Ho Chi Minh', ('varNationality') : 'Vietnam', ('varMessage') : 'Test'], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectChoiceByXpath'('//*[@id="edit-have-you-pitched-your-story-to-our-better-world-before"]', 
    'No')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id="edit-name-of-organisation"]', 'University of Education')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id="edit-your-role-in-organisation"]', 
    'Student')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectPersonCountryDropDownList'('Vietnam')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id="edit-organisation-website"]', 'https://hcmue.edu.vn/vi/')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//textarea[@id="edit-include-any-social-media-urls"]', 
    'Testing')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectMultipleAreaInList'('Animals,Arts and Culture')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id="edit-explain-what-good-the-organisation-does-in-the-community"]', 
    'Testing and studying')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//input[@id=\'edit-who-are-the-main-beneficiaries-of-this-organisation\']', 
    'Testing')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//textarea[@id=\'edit-how-does-the-organisation-benefit-the-community-up-to-500-words\']', 
    'Testing')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//textarea[@id=\'edit-share-an-example-of-how-this-has-happened-in-real-life-up-to-500\']', 
    'Testing')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//textarea[@id=\'edit-why-should-our-better-world-tell-this-story-up-to-500-words\']', 
    'Testing')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//textarea[@id=\'edit-how-can-the-public-help-this-organisation-please-give-precise-de\']', 
    'Testing')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.selectChoiceByXpath'('//div[@id=\'edit-has-the-organisation-had-their-story-told-by-the-media-before\']', 
    'No')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//textarea[@id=\'edit-if-yes-please-share-the-links-to-the-stories\']', 
    'Testing')

CustomKeywords.'actionKeyword.SelectByXPathKeyword.setTextElementByXPath'('//textarea[@id=\'edit-is-there-anything-else-you-would-like-to-share-about-this-organi\']', 
    'Testing')

