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

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL- Age gate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL - TOGGLING LANGUAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/CANNABIS menu - English'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Indica Dominant_Menu item'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('FRENCH/Product image - 1st one'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(3)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Home - page/Cart icon -bag'), FailureHandling.OPTIONAL)

WebUI.delay(2)

String a = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Unit price - Product'))

WebUI.comment(a)

String b = a.substring(1)

WebUI.comment(b)

String la = b.substring(0, b.length() - 1)

WebUI.comment('la=' + la)

String la1 = la.substring(0, la.length() - 1)

WebUI.comment(' la1 =' + la1)

String la2 = la1.substring(0, la1.length() - 1)

WebUI.comment('la2 =' + la2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/input_-_updates'))

WebUI.delay(1)

WebUI.doubleClick(findTestObject('OCS-DESKTOP/Cart flyout/input_-_updates'))

WebUI.delay(1)

WebUI.setText(findTestObject('OCS-DESKTOP/Cart flyout/input_-_updates'), '3')

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity increase - Product'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity increase - Product'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity increase - Product'))

WebUI.delay(2)

String c = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Sub-total Price'))

WebUI.comment(c)

String d = c.substring(1)

WebUI.comment(d)

WebUI.verifyNotEqual('c', 'd')

WebUI.comment(' price changed . Quantity selector is working')

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL- SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

