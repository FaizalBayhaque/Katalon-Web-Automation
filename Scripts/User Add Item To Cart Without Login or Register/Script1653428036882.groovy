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

WebUI.click(findTestObject('Object Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/button_Mengerti'))

WebUI.setText(findTestObject('Object Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/input_Kategori_key'), 
    'Jam Tangan')

WebUI.click(findTestObject('Object Repository/Page_JakartaNotebook  Toko Online Lengkap  _55a6a0/svg_Xiaomi Gaming Monitor_Icon___StyledSvg-_ca2ae9'))

WebUI.click(findTestObject('Object Repository/Page_Pencarian produk Jam Tangan  JakartaNo_4f2fc1/a_SKMEI Jam Tangan Analog Chrono Pria Stain_46b265'))

WebUI.click(findTestObject('Object Repository/Page_SKMEI Jam Tangan Analog Chrono Pria St_1e16cb/a_Add to cart'))

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/Page_Keranjang Belanja - JakartaNotebook.com/i_Antar barang melalui Kurir_fa fa-circle-o'))

WebUI.scrollToPosition(0, 1000)

WebUI.click(findTestObject('Object Repository/Page_Keranjang Belanja - JakartaNotebook.com/button_Lanjut ke Pembayaran'))

WebUI.closeBrowser()

