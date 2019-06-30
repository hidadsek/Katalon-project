
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import org.openqa.selenium.WebDriver


def static "actionKeyword.SelectByXPathKeyword.setTextElementByXPath"(
    	String xpath	
     , 	String text	) {
    (new actionKeyword.SelectByXPathKeyword()).setTextElementByXPath(
        	xpath
         , 	text)
}

def static "actionKeyword.SelectByXPathKeyword.clickElementByXPath"(
    	String xpath	) {
    (new actionKeyword.SelectByXPathKeyword()).clickElementByXPath(
        	xpath)
}

def static "actionKeyword.SelectByXPathKeyword.clickElementByOffset"(
    	String xpath	
     , 	int x	
     , 	int y	) {
    (new actionKeyword.SelectByXPathKeyword()).clickElementByOffset(
        	xpath
         , 	x
         , 	y)
}

def static "modalKeyword.SelectByJavascript.clickButtonJavascript"(
    	String xpath	) {
    (new modalKeyword.SelectByJavascript()).clickButtonJavascript(
        	xpath)
}

def static "modalKeyword.SelectByJavascript.setTextElementJavascript"(
    	String xpath	
     , 	String text	) {
    (new modalKeyword.SelectByJavascript()).setTextElementJavascript(
        	xpath
         , 	text)
}

def static "actionKeyword.BrowserKeyword.refreshBrowser"() {
    (new actionKeyword.BrowserKeyword()).refreshBrowser()
}

def static "actionKeyword.BrowserKeyword.openBrowser"() {
    (new actionKeyword.BrowserKeyword()).openBrowser()
}

def static "actionKeyword.BrowserKeyword.closeBrowser"(
    	WebDriver driver	) {
    (new actionKeyword.BrowserKeyword()).closeBrowser(
        	driver)
}
