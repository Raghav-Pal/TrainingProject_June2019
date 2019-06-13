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

addResult = WS.sendRequest(findTestObject('SOAP/Add'))

String xml1 = addResult.responseBodyContent

def dataValue1 = new XmlSlurper().parseText(xml1)

println('\n Result for add is : ' + dataValue1)

GlobalVariable.NUM1 = dataValue1

println('\n Value for Global Variable NUM1 is : ' + GlobalVariable.NUM1)

subResult = WS.sendRequest(findTestObject('SOAP/Subtract'))

String xml2 = subResult.responseBodyContent

def dataValue2 = new XmlSlurper().parseText(xml2)

println('\n Result for sub is : ' + dataValue2)

GlobalVariable.NUM2 = dataValue2

println('\n Value for Global Variable NUM2 is : ' + GlobalVariable.NUM2)

WS.sendRequestAndVerify(findTestObject('SOAP/Multiply', [('num1') : GlobalVariable.NUM1, ('num2') : GlobalVariable.NUM2]))

