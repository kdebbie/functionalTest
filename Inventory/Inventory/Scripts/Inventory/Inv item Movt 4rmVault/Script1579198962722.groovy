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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('loginTemplate/_loginTemplate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login_Page/img'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/svg'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/span_inventory'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/a_Inventory Items'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/button_View Items'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/button_UNASSIGNED_table__btn ant-btn ant-bt_ed82db'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/a_Move'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/div_Destination Locationselect source location'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/div_select source location'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/li_TILL'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/div_Destination Location IDselect Destinati_4ecb64'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/div_select Destination Location'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/li_TELLER_K999'))

WebUI.setText(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/textarea_Remarks_ant-input'), 'MOVE CHEQUEBOOK LEAVES')

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/button_MOVE'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/div_Initiate Move Type VAULT - TILL        _f8608f'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Inv Item Movt 4rm Vault/button_Yes'))

