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

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL- Age gate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/CANNABIS menu - English'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Indica Dominant_Menu item'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Product image - 1st one'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Product page/Product image'), 1)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Home - page/Cart icon -bag'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_I confirm that'))

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkout - Button'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Customer info page/Return to Cart - Link'), 1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Return to Cart - Link'))

WebUI.delay(1)

String a = WebUI.getText(findTestObject('OCS-DESKTOP/Cart page/Unit price - product - price in cart page'))

WebUI.comment(a)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/Quantity Input field'))

WebUI.sendKeys(findTestObject('OCS-DESKTOP/Cart page/Quantity Input field'), Keys.chord(Keys.CLEAR))

WebUI.setText(findTestObject('OCS-DESKTOP/Cart page/Quantity Input field'), '5')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('OCS-DESKTOP/Cart page/Quantity Input field'), Keys.chord(Keys.CLEAR))

WebUI.setText(findTestObject('OCS-DESKTOP/Cart page/Quantity Input field'), '7')

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/Qty Increase icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/Qty Increase icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/Qty Increase icon'))

WebUI.delay(2)

String b = WebUI.getText(findTestObject('OCS-DESKTOP/Cart page/Unit price - product - price in cart page'))

WebUI.comment(b)

WebUI.verifyNotEqual('a', 'b')

WebUI.comment(' price changed . Quantity selector is working')

