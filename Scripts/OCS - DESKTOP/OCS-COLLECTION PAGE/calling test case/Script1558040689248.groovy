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

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Age gate and burger menu/Burger menu - English'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Cannabis chevron'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Dried flower - plus accordian'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('OCS-MOBILE /Cannabis page/Dried flower - Indica dominant'))

not_run: WebUI.delay(2)

WebUI.scrollToElement(findTestObject('OCS-DESKTOP/Collection page/scroll element'), 0)

WebUI.click(findTestObject('OCS-DESKTOP/Collection page/sort option'))

