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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.support.ui.Select as Select
import java.util.ArrayList as ArrayList

/*int num = GlobalVariable.num

Random rnd = new Random()

randomNum = rnd.nextInt(10 ** num)

int a = 2

int b = 5

WebUI.callTestCase(findTestCase('loginTemplate/_loginTemplate'), [:], FailureHandling.STOP_ON_FAILURE) */
System.setProperty('webdriver.chrome.driver', 'C:\\Users\\23480\\Katalon Studio\\All Projects\\chromedriver.exe')

//ChromeDriver driver = new ChromeDriver()
WebDriver driver = new ChromeDriver()

//WebUI.navigateToUrl(GlobalVariable.baseUrl)
driver.get(GlobalVariable.baseUrl)

DriverFactory.changeWebDriver(driver)

WebUI.delay(5)

WebUI.setText(findTestObject('Login_Page/input_WELCOME BACK_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Login_Page/input_WELCOME BACK_password'), GlobalVariable.password)

WebUI.click(findTestObject('Login_Page/button_Login'))

WebUI.click(findTestObject('Login_Page/button_CORE_app__button'))

WebUI.click(findTestObject('Core page/InventoryPage_icon_app/Instrument_defnition/svg'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/span_Cash Account Maintenance'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/a_Manage Till'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/button_ADD TILL'))

WebUI.setText(findTestObject('Core page/Cash_TillPage_icon-app/input_Till ID_ant-input'), 'TELLER1')

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/svg_1'))

WebUI.sendKeys(findTestObject('Core page/Cash_TillPage_icon-app/input_Branch_ant-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/button_Search'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/button_Select'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/div_EmployeeID'))

//WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/li_NEW001 - CYNTHIA PETER'))
/*WebElement testDropDown = driver.findElement(By.xpath('//div[2]/div/span/div/div/div'));
Select dropdown = new Select(testDropDown)
dropdown.selectByIndex(1);   */
//==========================================================================
//================================================================
/* def List<WebElement> listDropDown = new ArrayList<>()
listDropDown.add(driver.findElement(By.xpath('//div[2]/div/span/div/div/div')));

Random random = new Random()
int i = 1;
if(listDropDown!=null){
	i = random.nextInt(listDropDown.size())
}

listDropDown.get(i) 
listDropDown.println(i)  */
//this line will be storing loation of th items visible
List<E extends def> lists = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Core page/Cash_TillPage_icon-app/Employee_Attribute'), 
    0)

println(lists.text)

lists[0].click()

not_run: WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/div_ Currency'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/li_NGN - NIGERIAN NAIRA'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/svg_1_2'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/button_Search'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/button_Select'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/button_Add Currency'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/button_ADD TILL'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/div_Do you want to allocate this till click_19778b'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/button_Yes'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/div_successTill Allocated Successfully'))

WebUI.click(findTestObject('Core page/Cash_TillPage_icon-app/path'))

WebUI.closeBrowser()

