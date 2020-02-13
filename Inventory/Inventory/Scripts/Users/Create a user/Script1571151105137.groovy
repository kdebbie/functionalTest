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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

int num = GlobalVariable.num

Random rnd = new Random()

randomNum = rnd.nextInt(10 ** num)

int a = 2

int b = 5

WebUI.callTestCase(findTestCase('loginTemplate/_loginTemplate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SSO_Page/a_Users'), GlobalVariable.medWait)

WebUI.click(findTestObject('SSO_Page/user_Link'))

WebUI.click(findTestObject('user_page/Page_icon-app/button_Add User'))

WebUI.setText(findTestObject('user_page/Page_icon-app/employeeID'), 'LBT' + String.valueOf(randomNum))

WebUI.setText(findTestObject('user_page/Page_icon-app/email_field'), CustomKeywords.'randomData.TestDataGenerator.getRandomEmail'())

WebUI.setText(findTestObject('user_page/Page_icon-app/phone'), CustomKeywords.'randomData.TestDataGenerator.set_RandomNumber'(
        11))

WebUI.setText(findTestObject('user_page/Page_icon-app/firstName'), CustomKeywords.'randomData.TestDataGenerator.getRandomFirstName'())

WebUI.setText(findTestObject('user_page/Page_icon-app/mname'), CustomKeywords.'randomData.TestDataGenerator.getRandomName'(
        a, b))

WebUI.setText(findTestObject('user_page/Page_icon-app/lname'), CustomKeywords.'randomData.TestDataGenerator.getRandomLastName'())

WebUI.setText(findTestObject('user_page/Page_icon-app/usname'), 'USR' + String.valueOf(randomNum))

WebUI.click(findTestObject('user_page/Page_icon-app/div_UserType'))

WebUI.waitForElementVisible(findTestObject('user_page/Page_icon-app/li_USER'), 3)

WebUI.verifyElementVisible(findTestObject('user_page/Page_icon-app/li_USER'))

WebUI.verifyElementClickable(findTestObject('user_page/Page_icon-app/li_USER'))

//WebUI.click(findTestObject('user_page/Page_icon-app/li_USER'))
CustomKeywords.'comboPackage.ClickUserType.clickDropdownUserType'(findTestObject('user_page/Page_icon-app/li_USER'), 5)

WebUI.click(findTestObject('user_page/Page_icon-app/div_ResourceType'))

WebUI.verifyElementPresent(findTestObject('user_page/Page_icon-app/li_CORE_Res'), 5)

WebUI.waitForElementPresent(findTestObject('user_page/Page_icon-app/li_CORE_Res'), 5)

WebUI.verifyElementVisible(findTestObject('user_page/Page_icon-app/li_CORE_Res'))

WebUI.click(findTestObject('user_page/Page_icon-app/li_CORE_Res'))

WebUI.click(findTestObject('user_page/Page_icon-app/li_TRADE_Res'))

WebUI.click(findTestObject('user_page/Page_icon-app/li_TREASURY_Res'))

WebUI.click(findTestObject('user_page/Page_icon-app/button_Submit'))

WebUI.waitForAlert(3)

