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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://smartpbf-p2-dev.digital-healthcare.id/')

WebUI.click(findTestObject('Object Repository/OQ-001/Page_beranda medbiz, contoh SEO/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/OQ-001/Page_Login/input_Email_loginusername'), 'arrumentari.purnamawati+apotekpersada@sirclo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OQ-001/Page_Login/input_Kata Sandi_loginpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OQ-001/Page_Login/span_Masuk'))

WebUI.click(findTestObject('Object Repository/OQ-001/Page_Akun Saya/a_Pemesanan Saya'))

WebUI.click(findTestObject('Object Repository/OQ-001/Page_Pemesanan Saya/span_Lihat Order'))

WebUI.click(findTestObject('Object Repository/OQ-001/Page_Order  STAGMB000001211/span_Kirim Permohonan'))

WebUI.switchToWindowTitle('Buat Permohonan Baru')

WebUI.selectOptionByValue(findTestObject('Object Repository/OQ-001/Page_Buat Permohonan Baru/select_IT MedbizQAFinanceDistributorSSO'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/OQ-001/Page_Buat Permohonan Baru/input_Subyek_subject'), 'Sample Subyek')

WebUI.setText(findTestObject('Object Repository/OQ-001/Page_Buat Permohonan Baru/textarea_Pesan_content'), 'Sample pesan')

WebUI.click(findTestObject('Object Repository/OQ-001/Page_Buat Permohonan Baru/span_Kirim Permohonan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/OQ-001/Page_Permohonan Bantuan/div_Ticket was successfully created'), 
    'Ticket was successfully created')

WebUI.closeBrowser()

