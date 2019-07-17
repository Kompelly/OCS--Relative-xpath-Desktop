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

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/CANNABIS menu - English'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Indica Dominant_Menu item'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Product image - 1st one'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.delay(3)

not_run: WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Product page/Product image'), 1)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Home - page/view my bag - cart dropdown'))

WebUI.delay(3)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_I confirm that'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkout - Button'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Customer info page/input_Email'), 0)

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Email'), 'suman.kompelly@diffagency.com')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_First name'), 'suman')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Last name'), 'kompelly')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Address'), '300 saint alxendre')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Apartment suite etc. (op'), '199')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_City'), 'montreal')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Postal code'), 'n0R1K0')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Phone'), '(514) 449-3882')

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Continue to shipping method - Button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Shipping page/Change link'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Continue to shipping method - Button'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Shipping page/Change link 2'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Continue to shipping method - Button'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Shipping page/Return to customer info'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Continue to shipping method - Button'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Cart - Breadcrumb link'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/cart page-Checkbox_I confirm that'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/cart page - Checkbox_Accept the Terms Condition'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/Cart page -checkout button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Payment -page/Information - Breadcrumb link'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Continue to shipping method - Button'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Shipping page/Continue to payment method - Button'))

WebUI.closeBrowser()

