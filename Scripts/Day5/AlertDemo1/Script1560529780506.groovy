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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert')

WebUI.click(findTestObject('Object Repository/Page_Tryit Editor v36/button_Try it'))

WebUI.verifyAlertPresent(5, FailureHandling.STOP_ON_FAILURE)

alertText = WebUI.getAlertText()

WebUI.verifyMatch(alertText, 'I am an alert box!', false)

println('\n  Alert Text is : ' + alertText)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.acceptAlert()

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
