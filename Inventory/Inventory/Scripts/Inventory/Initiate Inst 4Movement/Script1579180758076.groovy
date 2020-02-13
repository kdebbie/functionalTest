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

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/svg'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/span_inventory'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/a_Inventory Movement'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/button_INITIATE MOVEMENT'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/div_Destination Locationselect source location'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/li_VAULT'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/div_Source Location IDselect Source Location'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/li_AGENCY'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/div_Destination Location IDselect Destinati_4ecb64'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/div_select Destination Location'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/li_VAULT999'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/div_Instrument Category'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/div_'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/li_CHQCHQ6103'))

WebUI.setText(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/input_Alpha ID_ant-input'), 
    '001')

WebUI.setText(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/input_Quantity_ant-input ant-input'), 
    '1000')

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/button_Auto-split_ant-switch'))

WebUI.setText(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/input_Quantity Per Unit_ant-input ant-input (1)'), 
    '100')

WebUI.verifyElementPresent(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/input_Total Units_ant-input ant-input-disabled'), 
    5)

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/button_Add Movement Details'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/button_MOVE'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/div_Initiate Move Type AGENCY - VAULT      _f5394a'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Initiate Inst 4Movement/button_Yes'))

