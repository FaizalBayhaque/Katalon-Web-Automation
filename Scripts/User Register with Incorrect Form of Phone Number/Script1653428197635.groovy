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

WebUI.navigateToUrl('https://www.jakartanotebook.com/')

WebUI.click(findTestObject('Object Repository/Negative Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/button_Mengerti'))

WebUI.click(findTestObject('Object Repository/Negative Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/button_Login  Daftar'))

WebUI.click(findTestObject('Object Repository/Negative Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/span_Daftar'))

WebUI.setText(findTestObject('Object Repository/Negative Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/input_atau daftar dengan email_name'), 
    'Suparman')

WebUI.setText(findTestObject('Object Repository/Negative Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/input_Nama Lengkap_username'), 
    'jakartanotebook@gmail.com')

WebUI.setText(findTestObject('Object Repository/Negative Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/input_Contoh emailjakartanotebook.com_telephone'), 
    '081267')

WebUI.setText(findTestObject('Object Repository/Negative Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/input_Contoh 081712345678_password'), 
    'TheStrongestPassword2!')

WebUI.click(findTestObject('Object Repository/Negative Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/button_Daftar'))

WebUI.closeBrowser()

