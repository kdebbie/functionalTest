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

WebUI.setText(findTestObject('null'), 'tester')

WebUI.setEncryptedText(findTestObject('null'), '3iF79iufxPg=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Core page/AOPage_icon-app/div_CoreResource_icon'))

WebUI.click(findTestObject('Core page/AOPage_icon-app/path'))

WebUI.click(findTestObject('Core page/AOPage_icon-app/a_Account Officer'))

WebUI.click(findTestObject('Core page/AOPage_icon-app/button_Add Account Officer'))

WebUI.setText(findTestObject('Core page/AOPage_icon-app/input_Officer Code_ant-input'), '123')

WebUI.click(findTestObject('Core page/AOPage_icon-app/div_'))

WebUI.click(findTestObject('Core page/AOPage_icon-app/li_LBT008 - CASHIER'))

