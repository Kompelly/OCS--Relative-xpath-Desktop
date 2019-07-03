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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ocs.ca/#/verify-age')

WebUI.click(findTestObject('Page_Magasin de Cannabis de lOntari/h3_Cannabis'))

WebUI.click(findTestObject('Page_Magasin de Cannabis de lOntari/span_Indica'))

WebUI.click(findTestObject('Page_Indica de fleurs sches  Ontari/img'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ocs.ca/#/verify-age')

WebUI.click(findTestObject('Object Repository/Page_Blue Dream  Ontario Cannabis S/label_1g'))

WebUI.click(findTestObject('Object Repository/Page_Blue Dream  Ontario Cannabis S/button_Ajouter1050'))

WebUI.click(findTestObject('Object Repository/Page_Blue Dream  Ontario Cannabis S/i_Created with Sketch._icon ic'))

WebUI.click(findTestObject('Object Repository/Page_Blue Dream  Ontario Cannabis S/label_3.5g'))

WebUI.click(findTestObject('Object Repository/Page_Blue Dream  Ontario Cannabis S/button_Ajouter3500'))

WebUI.click(findTestObject('Object Repository/Page_Blue Dream  Ontario Cannabis S/span_Je confirme que jai au mo'))

WebUI.click(findTestObject('Object Repository/Page_Blue Dream  Ontario Cannabis S/span_Acceptez les_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Blue Dream  Ontario Cannabis S/a_Passer  la caisse'))

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ocs.ca/?fts=0#/verify-age')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Adresse e-mail_checkoute'), 'suman@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Prnom_checkoutshipping_a'), 'suman')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Nom_checkoutshipping_add'), 'kompelly')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Adresse_checkoutshipping'), '123 test')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Appartement suite etc. ('), '123')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Ville_checkoutshipping_a'), 'montreal')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Code postal_checkoutship'), 'n0r1k0')

WebUI.setText(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/input_Tlphone_checkoutshipping'), '514-449-3883')

WebUI.click(findTestObject('Object Repository/Page_Ontario Cannabis Store - Infor/button_Continuer vers le mode'))

WebUI.click(findTestObject('Object Repository/Page_Ontario Cannabis Store - Livra/button_Continuer vers le moyen'))

