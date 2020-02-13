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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.support.ui.Select as Select
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//WebUI.openBrowser('')
System.setProperty('webdriver.chrome.driver', 'C:\\Users\\23480\\Katalon Studio\\All Projects\\chromedriver.exe')

//ChromeDriver driver = new ChromeDriver()
WebDriver driver = new ChromeDriver()

//WebUI.navigateToUrl(GlobalVariable.baseUrl)
driver.get(GlobalVariable.baseUrl)

DriverFactory.changeWebDriver(driver)

WebUI.refresh()

WebUI.setText(findTestObject('Login_Page/input_WELCOME BACK_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Login_Page/input_WELCOME BACK_password'), GlobalVariable.password)

WebUI.click(findTestObject('Login_Page/button_Login'))

WebUI.click(findTestObject('Login_Page/button_CORE_app__button'))

