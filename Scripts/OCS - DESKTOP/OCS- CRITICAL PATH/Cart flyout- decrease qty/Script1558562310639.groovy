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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL - Navigate to PDP'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Product page/Product image'), 1)

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

flag = WebUI.verifyElementPresent(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'), 0)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'))

WebUI.takeScreenshot()

WebUI.comment(' flag =' + flag)

if (flag == true) {
    WebUI.delay(2)

    not_run: WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Home - page/Cart icon -bag'), FailureHandling.OPTIONAL)

    not_run: WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity decrease - Product'))

    WebUI.delay(2)

    String a = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Unit price - Product'))

    WebUI.comment(a)

    String b = a.substring(1)

    WebUI.comment(b)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/input_-_updates'))

    WebUI.setText(findTestObject('OCS-DESKTOP/Cart flyout/input_-_updates'), Keys.chord(Keys.CLEAR))

    WebUI.delay(1)

    WebUI.setText(findTestObject('OCS-DESKTOP/Cart flyout/input_-_updates'), '10')

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity decrease - Product'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity decrease - Product'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity decrease - Product'))

    WebUI.delay(5)

    String c = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Sub-total Price'))

    WebUI.comment(c)

    String d = c.substring(1)

    WebUI.comment(d)

    WebUI.verifyNotEqual('b', 'd')

    WebUI.comment(' Sub-total Price changed . Quantity selector is working')
} else {
    WebUI.back()

    WebUI.delay(2)

    not_run: WebUI.click(findTestObject('OCS-DESKTOP/Theme preview - Hide bar'), FailureHandling.OPTIONAL)

    not_run: WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Shishkaberry'))

    WebUI.delay(2)

    not_run: WebUI.click(findTestObject('OCS-DESKTOP/Theme preview - Hide bar'), FailureHandling.OPTIONAL)

    not_run: WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_3.5g'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity decrease - Product'))

    WebUI.delay(2)

    String a = WebUI.getText(findTestObject('OCS-DESKTOP/Cart page/Unit price - product'))

    WebUI.comment(a)

    String b = a.substring(1)

    WebUI.comment(b)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Qty - Input field'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('OCS-DESKTOP/Cart flyout/Qty - Input field'), Keys.chord(Keys.CLEAR))

    WebUI.delay(1)

    WebUI.setText(findTestObject('OCS-DESKTOP/Cart flyout/Qty - Input field'), '4')

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity decrease - Product'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity decrease - Product'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity decrease - Product'))

    WebUI.delay(5)

    String c = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Sub-total Price'))

    WebUI.comment(c)

    String d = c.substring(1)

    WebUI.comment(d)

    WebUI.verifyNotEqual('c', 'd')

    WebUI.comment(' price changed . Quantity selector is working')
}

