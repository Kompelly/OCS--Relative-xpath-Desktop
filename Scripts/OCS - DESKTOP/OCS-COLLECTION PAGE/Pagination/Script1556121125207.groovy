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

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/CANNABIS menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cannabis page/Prerolled - Indica dominant'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_2'))

not_run: WebUI.delay(2)

not_run: WebUI.scrollToPosition(570, 49)

not_run: WebUI.click(findTestObject('COLLECTION PAGE _OR/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_3'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToPosition(570, 49)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_Previous'))

WebUI.delay(2)

WebUI.scrollToPosition(570, 49)

WebUI.click(findTestObject('OCS-DESKTOP/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_Next'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_What to consider'))

WebUI.back()

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(4)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_Previous'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_Next - down'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_2 - down'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_4'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('COLLECTION PAGE _OR/Pagination_OR/pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_Previous'))

not_run: WebUI.scrollToPosition(570, 40)

not_run: WebUI.delay(2)

not_run: WebUI.scrollToPosition(570, 40)

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('COLLECTION PAGE _OR/Pagination_OR/pagination_OR/Page_Pre-Rolled  Ontario Cannabis S/a_Next'))

