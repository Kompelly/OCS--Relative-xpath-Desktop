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

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/All accessories'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Vaporizers'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a)

String b = 'Vaporizers | Ontario Cannabis Store'

WebUI.comment(b)

// WebUI.verifyEqual('a', 'b', FailureHandling.STOP_ON_FAILURE)
if (a == b) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Bongs - water pipes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a1 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a1)

String b1 = 'Bongs & Water Pipes | Ontario Cannabis Store'

WebUI.comment(b1)

if (a1 == b1) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Handheld pipes'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a11 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a11)

String b11 = 'Handheld Pipes | Ontario Cannabis Store'

WebUI.comment(b11)

if (a11 == b11) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Papers -filters'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a111 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a111)

String b111 = 'Papers & Filters | Ontario Cannabis Store'

WebUI.comment(b111)

if (a111 == b111) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Grinders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a1111 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a1111)

String b1111 = 'Grinders | Ontario Cannabis Store'

WebUI.comment(b1111)

if (a1111 == b1111) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Tools -kits'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a11111 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a11111)

String b11111 = 'Multi-Tools & Kits | Ontario Cannabis Store'

WebUI.comment(b11111)

if (a11111 == b11111) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Cleaning supplies'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a12 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a12)

String b12 = 'Cleaning Supplies | Ontario Cannabis Store'

WebUI.comment(b12)

if (a12 == b12) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Storage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a13 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a13)

String b13 = 'Storage | Ontario Cannabis Store'

WebUI.comment(b)

if (a13 == b13) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Trays'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a14 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a14)

String b14 = 'Trays | Ontario Cannabis Store'

WebUI.comment(b14)

if (a14 == b14) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Infusers'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

String a15 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment(a15)

String b15 = 'Infusers | Ontario Cannabis Store'

WebUI.comment(b15)

if (a15 == b15) {
    WebUI.comment('correct window page ')
} else {
    WebUI.comment('Some random page ')
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Best selling pipes'))

WebUI.delay(1, FailureHandling.OPTIONAL)

not_run: boolean flag = WebUI.verifyTextPresent('Page Not Found', false, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.comment('flag=' + flag)

not_run: if (flag == true) {
    not_run: WebUI.comment('pae not ready yet')
} else {
    not_run: String x = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment(x)

    String y = 'best selling pipes | Ontario Cannabis Store'

    WebUI.comment(y)

    if (x == y) {
        WebUI.comment('correct window page ')
    } else {
        WebUI.comment('Some random page ')
    }
}

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Travel storage'))

not_run: boolean flag1 = WebUI.verifyTextPresent('Page Not Found', false, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.comment('flag1=' + flag1)

not_run: if (flag1 == true) {
    WebUI.comment('pae not ready yet')
} else {
    String x1 = WebUI.getWindowTitle(FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment(x1)

    String y1 = 'best selling pipes | Ontario Cannabis Store'

    WebUI.comment(y1)

    if (x1 == y1) {
        WebUI.comment('correct window page ')
    } else {
        WebUI.comment('Some random page ')
    }
}

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Age gate and Mega menu/Header/ACCESSORIES menu - En'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.OPTIONAL)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OCS-DESKTOP/Accessories page/Shop all acessories'))

