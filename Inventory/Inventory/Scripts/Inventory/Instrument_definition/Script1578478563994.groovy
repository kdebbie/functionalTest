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

int num = GlobalVariable.num

Random rnd = new Random()

randomNum = rnd.nextInt(10 ** num)

int a = 2

int b = 5

WebUI.callTestCase(findTestCase('loginTemplate/_loginTemplate'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/svg'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/span_inventory'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_ADD INSTRUMENT'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Instrument Type'))

not_run: WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_CHQ (CHEQUES)'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Mode of Serialization            BANK  _f125ce'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_BANK'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_BRANCH'))

WebUI.setText(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/input_Instrument Category_ant-input'), 
    'CHQ' + String.valueOf(randomNum))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Serialization Code'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_CHQ_ISS_ID (CHEQUE BOOK ISSUANCE ID SEQU_bd6f67'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Currency'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_NGN (NIGERIAN NAIRA)'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Denominationselect currency first'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_select currency first'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_50N'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Base Quantity'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_100'))

WebUI.setText(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/input_Cost Per Leaf_ant-input ant-input'), 
    '20.000')

WebUI.setText(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/input_Days_ant-input ant-input'), '2')

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_NO_ant-switch'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_Next'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_Add Authorizers'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Branch'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/divBranch'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_094 - NAVY TOWNMAMMY MKT'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Authorizer'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_QA004'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_Add Authorizer'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_Add Charges'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Charge Type'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/divChargeType'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_CHQI - CHEQUEBOOK ISSUANCE'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Charge Fee Codes'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/li_CHQ_ISS - CHARGE DETAILS FOR CHEQUE BOOK_c4b205'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_Add'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_CREATE INSTRUMENT'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/div_Do you want to create instrumentclick y_cd4e5d'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/button_Yes'))

