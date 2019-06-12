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

WebUI.navigateToUrl('https://orangehrm-demo-6x.orangehrmlive.com/auth/login')

WebUI.setText(findTestObject('CapturedObjectsForTest2/Page_OrangeHRM/input_OrangeHRM Demo_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('CapturedObjectsForTest2/Page_OrangeHRM/input_OrangeHRM Demo_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('CapturedObjectsForTest2/Page_OrangeHRM/input_OrangeHRM Demo_Submit'))

WebUI.click(findTestObject('CapturedObjectsForTest2/Page_OrangeHRM/i_keyboard_arrow_down'))

WebUI.click(findTestObject('CapturedObjectsForTest2/Page_OrangeHRM/a_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

