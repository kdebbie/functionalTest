import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('loginApproval/loginApproval_Credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login_Page/img'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/svg'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/span_inventory'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/a_Inventory Items'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Approve Inv_item 4rmVault/div_Pending Verifications - Copy'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Approve Inv_item 4rmVault/button_NGN_ant-btn ant-btn-primary - Copy'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Approve Inv_item 4rmVault/svg_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Approve Inv_item 4rmVault/button_Search Request'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Approve Inv_item 4rmVault/button_eye(action)'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Approve Inv_item 4rmVault/div_Request Details'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Approve Inv_item 4rmVault/button_Approve'))

