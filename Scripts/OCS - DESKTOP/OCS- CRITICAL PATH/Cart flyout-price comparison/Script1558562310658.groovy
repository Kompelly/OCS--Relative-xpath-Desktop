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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.callTestCase(findTestCase('OCS - DESKTOP/CALL - Navigate to PDP'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Product page/Product image'), 1)

WebUI.delay(2)

not_run: boolean flag = WebUI.verifyElementPresent(findTestObject('OCS-DESKTOP/Product page/Swatch_3.5g'), 0)

not_run: WebUI.comment(' flag=' + flag)

WebUI.takeScreenshot()

not_run: WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Product page/Swatch_3.5g'), 1)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_1g'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Theme preview - Hide bar'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Back icon'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/CANNABIS menu - English'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Chevron_Cannabis'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Dried Flower_Plus icon'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Indica Dominant_Menu item'))

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Product image - 2nd one'))

WebUI.delay(2)

not_run: WebUI.navigateToUrl('https://ocs.ca/products/la-confidential')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Swatch_3.5g'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Home - page/view my bag - cart dropdown'), FailureHandling.OPTIONAL)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Theme preview - Hide bar'))

String a = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Unit price - 1st Product'))

WebUI.delay(2)

WebUI.comment('a=' + a)

String without = a.substring(1)

WebUI.comment('without = ' + without)

//String last = without.substring(0, without.length() - 1)

WebUI.comment('without=' + without)

WebUI.delay(2)

String k = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Unit price - 2nd Product'))

WebUI.delay(2)

// Dollar removal code... product 2
WebUI.comment('k=' + k)

String without1 = k.substring(1)

WebUI.comment('without1 = ' + without1)

double p1

double p2

// code to convert string to int
try {
    String str = without

    WebUI.comment('str=' + str)

    p1 = Double.valueOf(str)

    WebUI.comment('p1=' + p1)
}
catch (NumberFormatException ex) {
} 

try {
    String str5 = without1

    WebUI.comment('str5=' + str5)

    p2 = Double.valueOf(str5)

    WebUI.comment('p2=' + p2)
}
catch (NumberFormatException ex) {
} 

double total = p1 + p2

WebUI.comment('total =' + total)

String amount = WebUI.getText(findTestObject('OCS-DESKTOP/Cart flyout/Sub-total Price'))

WebUI.delay(2)

WebUI.comment('amount =' + amount)

String soustotal = amount.substring(1)

WebUI.comment('soustotal= ' + soustotal)

double p

try {
    String finalprice = soustotal

    WebUI.comment('finalprice=' + finalprice)

    p = Double.valueOf(finalprice)

    WebUI.comment('p=' + p)
}
catch (NumberFormatException ex) {
} 

String finalprice = soustotal

WebUI.comment('finalprice=' + finalprice)

p = Double.valueOf(finalprice)

WebUI.comment('p=' + p)

WebUI.verifyEqual(total, p)

WebUI.comment('cart items price equal')

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_I confirm that'))

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkout - Button'))

WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Customer info page/input_Email'), 0)

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Email'), 'suman.kompelly@diffagency.com')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_First name'), 'suman')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Last name'), 'kompelly')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Address'), '300 saint alxendre')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Apartment suite etc. (op'), '199')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_City'), 'montreal')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Postal code'), 'n0R1K0')

WebUI.setText(findTestObject('OCS-DESKTOP/Customer info page/input_Phone'), '(514) 449-3882')

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Continue to shipping method - Button'))

WebUI.delay(2)

WebUI.refresh()

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Shipping page/Continue to payment method - Button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Payment', false // Dollar removal code... product 2
    // code to convert string to int
    )

