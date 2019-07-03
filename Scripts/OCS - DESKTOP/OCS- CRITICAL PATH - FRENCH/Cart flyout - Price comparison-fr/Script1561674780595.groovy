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

WebUI.delay(1)

WebUI.delay(3)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Back icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_3.5g'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Home - page/Cart icon -bag'), FailureHandling.OPTIONAL)

WebUI.delay(2)

String a = WebUI.getText(findTestObject('FRENCH/Unit price - 1st Product'))

WebUI.comment(a)

//
String a1 = a.substring(0, a.length() - 1)

WebUI.comment('a1 = ' + a1)

String x1 = a1.substring(0, a1.length() - 1)

WebUI.comment('x1 = ' + x1)

String x2 = x1.substring(0, x1.length() - 1)

WebUI.comment('x2 = ' + x2)

String x3 = x2.substring(0, x2.length() - 1)

WebUI.comment('x3 = ' + x3)

String x6 = x3.substring(0, x3.length() - 1)

WebUI.comment('x6 = ' + x6)

//
WebUI.delay(2)

String b = WebUI.getText(findTestObject('FRENCH/Unit price - 2nd Product'))

WebUI.comment(b)

//
String a2 = b.substring(0, b.length() - 1)

WebUI.comment('a2 = ' + a2)

String y1 = a2.substring(0, a2.length() - 1)

WebUI.comment('y1 = ' + y1)

String y2 = y1.substring(0, y1.length() - 1)

WebUI.comment('y2 = ' + y2)

String y3 = y2.substring(0, y2.length() - 1)

WebUI.comment('y3 = ' + y3)

String y4 = y3.substring(0, y3.length() - 1)

WebUI.comment('y4 = ' + y4)

//
String c = WebUI.getText(findTestObject('FRENCH/Sub-total'))

WebUI.comment(c)

//
String a3 = c.substring(0, c.length() - 1)

WebUI.comment('a3 = ' + a3)

String z1 = a3.substring(0, a3.length() - 1)

WebUI.comment('z1 = ' + z1)

String z2 = z1.substring(0, z1.length() - 1)

WebUI.comment('z2 = ' + z2)

String z3 = z2.substring(0, z2.length() - 1)

WebUI.comment('z3 = ' + z3)

String z4 = z3.substring(0, z3.length() - 1)

WebUI.comment('z4 = ' + z4)

//
double p2

double p3

try {
    String x4 = x6

    WebUI.comment('x4=' + x4)

    p2 = Double.valueOf(x4)

    WebUI.comment('p2=' + p2)
}
catch (NumberFormatException ex) {
} 

try {
    String x5 = y4

    WebUI.comment('x5=' + x5)

    p3 = Double.valueOf(x5)

    WebUI.comment('p3=' + p3)
}
catch (NumberFormatException ex) {
} 

WebUI.comment('p2=' + p2)

WebUI.comment('p3=' + p3)

double total = p2 + p3

WebUI.comment('total=' + total)

WebUI.verifyEqual(total, z4)

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL- SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

