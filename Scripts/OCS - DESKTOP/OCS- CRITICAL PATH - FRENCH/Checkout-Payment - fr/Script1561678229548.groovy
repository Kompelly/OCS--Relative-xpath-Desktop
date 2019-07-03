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

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Quantity Increase - Button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Product page/Add to Bag-button'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Home - page/Cart icon -bag'), FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_I confirm that'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkbox_Accept the Terms Condition'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Cart flyout/Checkout - Button'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Adresse e-mail_checkoute'), 'suman@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Prnom_checkoutshipping_a'), 'suman')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Nom_checkoutshipping_add'), 'kompelly')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Adresse_checkoutshipping'), '123 test')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Appartement suite etc. ('), '123')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Ville_checkoutshipping_a'), 'montreal')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Code postal_checkoutship'), 'n0r1k0')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Tlphone_checkoutshipping'), '514-449-3883')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/button_Continuer vers le mode'))

WebUI.delay(4)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Ontario Cannabis Store - Livra/button_Continuer vers le moyen'))

WebUI.delay(1)

WebUI.click(findTestObject('FRENCH/Change link span 1'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(3)

WebUI.click(findTestObject('Page_Ontario Cannabis Store - Infor/button_Continuer vers le mode'))

WebUI.delay(3)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('Page_Ontario Cannabis Store - Livra/button_Continuer vers le moyen'))

WebUI.delay(3)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('FRENCH/Change link span 2'))

WebUI.delay(3)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('Page_Ontario Cannabis Store - Infor/button_Continuer vers le mode'))

WebUI.delay(3)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('Page_Ontario Cannabis Store - Infor/button_Continuer vers le mode'))

WebUI.delay(3)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Customer info page/Cart - Breadcrumb link'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(3)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/cart page-Checkbox_I confirm that'))

WebUI.delay(3)

WebUI.click(findTestObject('OCS-DESKTOP/Cart page/cart page - Checkbox_Accept the Terms Condition'))

WebUI.delay(1)

WebUI.click(findTestObject('FRENCH/Cart page -checkout button'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Payment -page/Information - Breadcrumb link'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('Page_Ontario Cannabis Store - Infor/button_Continuer vers le mode'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Shipping page/Shipping - Breadcrumb link'))

WebUI.delay(3)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('Page_Ontario Cannabis Store - Livra/button_Continuer vers le moyen'))

