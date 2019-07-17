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

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL - Navigate to PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_3.5g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Home - page/Cart icon -bag'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity increase - Product'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_I confirm that'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('OCS-DESKTOP/Cart flyout/Checkout - Button'))

