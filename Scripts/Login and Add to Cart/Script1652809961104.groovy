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

WebUI.click(findTestObject('Object Repository/Login Add to Cart Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/button_Mengerti'))

WebUI.click(findTestObject('Object Repository/Login Add to Cart Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/button_Login  Daftar'))

WebUI.setText(findTestObject('Object Repository/Login Add to Cart Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/input_atau_username'), 
    'jakartagraound21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Add to Cart Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/input_Contoh emailjakartanotebook.com_password'), 
    'cX1OkbGJTklkia+VhAfQvA==')

WebUI.click(findTestObject('Object Repository/Login Add to Cart Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Login Add to Cart Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/input_Kategori_key'), 
    'Keyboard')

WebUI.click(findTestObject('Object Repository/Login Add to Cart Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/button_Xiaomi Gaming Monitor_Button__Styled_4d64f4'))

WebUI.click(findTestObject('Object Repository/Login Add to Cart Repository/Page_Pencarian produk Keyboard  JakartaNote_cbec34/a_MIIIW Wireless Bluetooth Dual Mode Keyboa_74c490'))

WebUI.click(findTestObject('Object Repository/Login Add to Cart Repository/Page_MIIIW Wireless Bluetooth Dual Mode Key_e7a3cd/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Login Add to Cart Repository/Page_Keranjang Belanja - JakartaNotebook.com/i_Pengiriman via Sicepat dan JNE_fa fa-circle-o'))

WebUI.click(findTestObject('Object Repository/Login Add to Cart Repository/Page_Keranjang Belanja - JakartaNotebook.com/button_Lanjut ke Pembayaran'))

WebUI.closeBrowser()

