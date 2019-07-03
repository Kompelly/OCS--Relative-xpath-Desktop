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

not_run: WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Chevron_Cannabis'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Dried Flower_Plus icon'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Cannabis page/Dried flower - Indica dominant'))

WebUI.delay(2)

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/sort option'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Price Low to High'))

WebUI.delay(1)

WebUI.refresh()

WebUI.delay(1)

WebUI.callTestCase(findTestCase('OCS - DESKTOP/OCS-COLLECTION PAGE/calling test case'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('OCS-MOBILE /Collection page/scroll element'), 0)

WebUI.delay(1)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Collection page/sort option'))

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Price High to Low'))

WebUI.delay(1)

WebUI.refresh()

WebUI.callTestCase(findTestCase('OCS - DESKTOP/OCS-COLLECTION PAGE/calling test case'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Collection page/sort option'))

WebUI.delay(1)

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Alphabetically A - Z'))

WebUI.delay(1)

WebUI.refresh()

WebUI.callTestCase(findTestCase('OCS - DESKTOP/OCS-COLLECTION PAGE/calling test case'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Collection page/sort option'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/Alphabetically Z - A'))

WebUI.delay(1)

WebUI.refresh()

WebUI.callTestCase(findTestCase('OCS - DESKTOP/OCS-COLLECTION PAGE/calling test case'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Collection page/sort option'))

WebUI.delay(1)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/CBD Low to High'))

WebUI.delay(1)

WebUI.refresh()

WebUI.callTestCase(findTestCase('OCS - DESKTOP/OCS-COLLECTION PAGE/calling test case'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Collection page/sort option'))

WebUI.delay(1)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/CBD High to Low'))

WebUI.delay(1)

WebUI.refresh()

