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

WebUI.click(findTestObject('Object Repository/OQ-002/Page_beranda medbiz, contoh SEO/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Login/input_Email_loginusername'), 'arrumentari.purnamawati+apotekpersada@sirclo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OQ-003/Page_Login/input_Kata Sandi_loginpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Login/button_Masuk'))

WebUI.scrollToElement(findTestObject('Object Repository/OQ-003/Page_Akun Saya/a_Hubungi Kami'), 0)

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Akun Saya/a_Hubungi Kami'))

WebUI.navigateToUrl('https://smartpbf-p2-dev.digital-healthcare.id/contact/')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/input_Nomor HP_telephone'), '080989999')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/textarea_Pesan_comment'), 'Sample Pesan')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/input_Subyek_subject'), 'Sample Subyek')

WebUI.selectOptionByValue(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/select_IT MedbizQAFinanceDistributorSSO'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/span_STAGMB000000637'))

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/button_Kirim'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/div_Ticket was successfully created'), 
    'Ticket was successfully created')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/input_Nomor HP_telephone'), '080989999')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/textarea_Pesan_comment'), 'Sample Pesan')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/input_Subyek_subject_1'), 'Sample Subyek')

WebUI.selectOptionByValue(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/select_IT MedbizQAFinanceDistributorSSO_1'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/span_Kirim'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/div_Ticket was successfully created'), 
    'Ticket was successfully created')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/input_Nomor HP_telephone'), '080989999')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/textarea_Pesan_comment'), 'Sample Pesan')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/input_Subyek_subject_1_2'), 'Sample Subyek')

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/span_Belum ditetapkan'))

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/span_Kirim'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/div_Ticket was successfully created'), 
    'Ticket was successfully created')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/input_Nomor HP_telephone'), '080989999')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/textarea_Pesan_comment'), 'Sample Pesan')

WebUI.setText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/input_Subyek_subject_1_2_3'), 'Sample Subyek')

WebUI.selectOptionByValue(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/select_IT MedbizQAFinanceDistributorSSO_1_2'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/span_Belum ditetapkan_1'))

WebUI.click(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/button_Kirim'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/OQ-003/Page_Hubungi Kami/div_Ticket was successfully created'), 
    'Ticket was successfully created')

WebUI.closeBrowser()

