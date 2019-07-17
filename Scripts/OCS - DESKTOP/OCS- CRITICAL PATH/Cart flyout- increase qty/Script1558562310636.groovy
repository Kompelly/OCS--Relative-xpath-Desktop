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

boolean flag = WebUI.verifyElementPresent(findTestObject('OCS-DESKTOP/Product page/Swatch_3.5g'), 0)

WebUI.comment(' flag =' + flag)

if (flag == true) {
    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_3.5g'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Home - page/view my bag - cart dropdown'), FailureHandling.OPTIONAL)

    not_run: WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity increase - Product'))

    WebUI.delay(1)

    not_run: WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity increase - Product'))

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

    not_run: WebUI.setText(findTestObject('OCS-DESKTOP/Cart flyout/Qty - Input field'), Keys.chord(Keys.CLEAR))

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
} else {
    WebUI.back()

    not_run: WebUI.delay(2)

    not_run: WebUI.click(findTestObject('OCS-DESKTOP/Theme preview - Hide bar'), FailureHandling.OPTIONAL)

    WebUI.delay(2, FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Shishkaberry'))

    WebUI.delay(2)

    not_run: WebUI.click(findTestObject('OCS-DESKTOP/Theme preview - Hide bar'), FailureHandling.OPTIONAL)

    not_run: WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'))

    WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'), 1)

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

    WebUI.delay(2)

    WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

    WebUI.delay(1)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity increase - Product'))

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Quantity increase - Product'))

    WebUI.delay(2)

    String a = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Unit price - Product'))

    WebUI.comment(a)

    String b = a.substring(1)

    WebUI.comment(b)

    WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Qty - Input field'))

    WebUI.setText(findTestObject('OCS-DESKTOP/Cart flyout/Qty - Input field'), Keys.chord(Keys.CLEAR))

    WebUI.delay(1)

    WebUI.setText(findTestObject('OCS-DESKTOP/Cart flyout/Qty - Input field'), '10')

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
}

