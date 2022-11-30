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

WebUI.setText(findTestObject('Object Repository/OQ-002/Page_Login/input_Email_loginusername'), 'arrumentari.purnamawati+apotekpersada@sirclo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OQ-002/Page_Login/input_Kata Sandi_loginpassword'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/OQ-002/Page_Login/button_Masuk'))

WebUI.click(findTestObject('Object Repository/OQ-002/Page_Akun Saya/a_Permohonan Bantuan'))

WebUI.click(findTestObject('Object Repository/OQ-002/Page_Permohonan Bantuan/a_Sample Subyek'))

WebUI.setText(findTestObject('Object Repository/OQ-002/Page_XZZ-85884 Sample Subyek/textarea_Kirim Balasan_content'), 'Sample kirim balasan')

WebUI.click(findTestObject('Object Repository/OQ-002/Page_XZZ-85884 Sample Subyek/span_Kirim Balasan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/OQ-002/Page_XZZ-85884 Sample Subyek/div_Reply successfully added'), 
    'Reply successfully added')

WebUI.closeBrowser()

