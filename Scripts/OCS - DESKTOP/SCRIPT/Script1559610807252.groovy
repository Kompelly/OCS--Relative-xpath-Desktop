import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join


// OPENING THE BROWSER

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)


selenium.open("https://ocs.ca/?fts=0&preview_theme_id=72920106828")

// AGE GATE CONFIRMATION

selenium.click("id=dob__day")

selenium.select("id=dob__day", "label=19")

selenium.click("id=dob__month")

selenium.select("id=dob__month", "label=August - 08")

selenium.click("id=dob__year")

selenium.select("id=dob__year", "label=1995")

selenium.click("xpath=//button[@class='btn btn--outline']")

WebUI.delay(2)

selenium.click("id=dob__confirm__checkbox")

WebUI.delay(2)

selenium.click("xpath=//button[@class='btn btn--outline']")

WebUI.delay(2)

selenium.click("xpath=//button[@class='btn btn--primary']")

// HOME PAGE 

selenium.refresh()

selenium.click("xpath=//h3[@class='menu__item--title'][contains(text(),'Cannabis')]")

selenium.click("xpath=//li[@class='menu__tier-one js-menu__tier-one has-tier-two-open']//li[1]//div[1]//div[1]//ul[1]//li[1]//a[1]//span[1]")

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";',[])

// PRODUCT PAGE 

selenium.click("xpath=//article[@id='product_1314092451660']//a//img")

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";',[])


selenium.click("xpath=//span[@class='swatch__title'][contains(text(),'1g')]")

selenium.click("xpath=//button[@class='btn btn--primary btn--price btn--large variant-selector__submit full-width']")

selenium.click("xpath=//i[@class='icon icon--back js-close-flyout']")

WebUI.delay(2)

WebUI.back()

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";',[])


selenium.click("xpath=//article[@id='product_2108928657228']//a//img")

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";',[])


selenium.click("xpath=//span[@class='swatch__title'][contains(text(),'1g')]")

selenium.click("xpath=//button[@class='btn btn--primary btn--price btn--large variant-selector__submit full-width']")


selenium.click("xpath=//div[@id='flyout--overlay']//label[1]")

selenium.click("xpath=//input[@id='terms_confirm--flyout']")

selenium.click("xpath=//a[@class='btn btn--primary full-width js-checkout-button']")

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";',[])

// CUSTOMER INFORMATION PAGE 

selenium.click("id=checkout_email")

selenium.type("id=checkout_email", "suman@gmail.com")

selenium.type("id=checkout_shipping_address_first_name", "suman")

selenium.type("id=checkout_shipping_address_last_name", "kompelly")

selenium.type("id=checkout_shipping_address_address1", "demaisonneuve")

selenium.type("id=checkout_shipping_address_address2", "1004")


selenium.type("id=checkout_shipping_address_city", "montreal")

selenium.click("id=checkout_shipping_address_zip")

selenium.type("id=checkout_shipping_address_zip", "N0R1K0")

selenium.click("id=checkout_shipping_address_phone")

selenium.type("id=checkout_shipping_address_phone", "(514) 449-3882")

selenium.click("xpath=//button[@name='button']")


WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";',[])


selenium.click("xpath=//button[@name='button']")

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";',[])


selenium.isTextPresent("xpath=//p[@class='section__text']")

















