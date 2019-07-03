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

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL - PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/a_Dried flower'))

String b = WebUI.getWindowTitle()

WebUI.comment(' b= ' + b)

assert WebUI.getWindowTitle() == b

WebUI.click(findTestObject('OCS-DESKTOP/Product page/a_Cannabis'))

String c = WebUI.getWindowTitle()

WebUI.comment(' c= ' + c)

assert WebUI.getWindowTitle() == c

WebUI.click(findTestObject('OCS-DESKTOP/Product page/a_Home'))

String a = WebUI.getWindowTitle()

WebUI.comment(' a= ' + a)

assert WebUI.getWindowTitle() == a

