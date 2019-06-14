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

WebUI.navigateToUrl('https://automationstepbystep.blogspot.com/')

WebUI.setText(findTestObject('Object Repository/Page_Automation Step by Step/input_Email_email'), 'abcd@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Step by Step/input_Password_psw'), '4nvbrPglk7k=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Step by Step/input_Repeat Password_psw-repeat'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Page_Automation Step by Step/button_Sign Up'))

WebUI.closeBrowser()

