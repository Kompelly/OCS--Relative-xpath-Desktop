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

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/FAQ menu - En'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /FAQ page/scroll view element'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Dropdown button -First chevron -open- FAQ'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Dropdown button -First chevron - close -FAQ'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/First accordian - add'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/First accordian - Subtract'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Second accordian- add'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Second accordian - subtract'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Load more1'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Loadmore2'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Loadmore3'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Learn about cannabis'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/FAQ menu - En'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Loadmore4'))

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Learn about OCS'))

WebUI.back()

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/FAQ page/Choose cannabis products'))

WebUI.back()

