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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/svg'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/span_inventory'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/svg_1'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/button_NGN_table__btn ant-btn ant-btn-prima_960a77'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/a_View'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/div_Additional Details'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/svg_1_2'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/button_NGN_table__btn ant-btn ant-btn-prima_960a77'))

not_run: WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/a_Delete'))

not_run: WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/div_Are you sure you want to delete DDSCATinstrument  DDSDDSCATNoYes'))

not_run: WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/button_Yes_del'))

not_run: WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/button_NGN_table__btn ant-btn ant-btn-prima_960a77'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/a_Modify'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/div_Base Quantity100'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/li_50'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/button_Next'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/button_MODIFY INSTRUMENT'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/div_Do you want to Modify instrument (DDSCA_df4a9c'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/button_Yes'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_View_Modify_Delete/div_Instrument Category (DDSCAT)  Modified _bbbcaa'))

