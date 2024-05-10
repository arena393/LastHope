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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.idfcfirstbank.com/')

WebUI.click(findTestObject('Object Repository/Page_IDFC FIRST Bank - Personal Banking, Lo_ac6114/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_IDFC FIRST Bank - Personal Banking, Lo_ac6114/a_Login to Internet banking'))

WebUI.switchToWindowTitle('IDFC FIRST Bank')

WebUI.setText(findTestObject('Object Repository/Page_IDFC FIRST Bank/input_Mobile number_mobileNumber'), '888 416 2160')

WebUI.click(findTestObject('Object Repository/Page_IDFC FIRST Bank/span_Proceed to login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_IDFC FIRST Bank/input_Enter Password_login-password-input'), 
    'XS8jVL8eb+QoxSXze94T7A==')

WebUI.click(findTestObject('Object Repository/Page_IDFC FIRST Bank/span_Login securely'))

//WebUI.setEncryptedText(findTestObject('Object Repository/Page_IDFC FIRST Bank/input_OTP_otp'), '6PVm13BU/Dw=')

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Page_IDFC FIRST Bank/span_Verify'))

WebUI.click(findTestObject('Object Repository/Page_IDFC FIRST Bank/span_logout'))

