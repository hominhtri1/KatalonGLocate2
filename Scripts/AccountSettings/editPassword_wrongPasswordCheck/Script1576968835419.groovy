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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://mattermost-heroku-test.herokuapp.com/login')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'cabcaber')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), 'Ax++UeJEJOMdo+ATQUlG7R+/7ExWYIqDwSMYZeNULQQzQQL5Wywj9g==')

WebUI.click(findTestObject('Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Page_Town Square - this is me Mattermost/svg'))

WebUI.click(findTestObject('Page_Town Square - this is me Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Page_Town Square - this is me Mattermost/button_Security'))

WebUI.click(findTestObject('Page_Town Square - this is me Mattermost/span_Edit'))

WebUI.setEncryptedText(findTestObject('Page_Town Square - this is me Mattermost/input_Current Password_currentPassword'), 
    'Ax++UeJEJOMdo+ATQUlG7R+/7ExWYIqDwSMYZeNULQQzQQL5Wywj9g==')

WebUI.switchToWindowTitle('Town Square - this is me Mattermost')

WebUI.setEncryptedText(findTestObject('Page_Town Square - this is me Mattermost/input_Current Password_currentPassword'), 
    'Ax++UeJEJOMdo+ATQUlG7R+/7ExWYIqDwSMYZeNULQQzQQL5Wywj9g==')

WebUI.switchToWindowTitle('Town Square - this is me Mattermost')

WebUI.setEncryptedText(findTestObject('Page_Town Square - this is me Mattermost/input_New Password_newPassword'), 'z5fssOsktB7+mtsLHLOoZQ==')

WebUI.click(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/div_New Password'))

WebUI.setEncryptedText(findTestObject('Page_Town Square - this is me Mattermost/input_Retype New Password_confirmPassword'), 
    'xo/fHmGLdSsH0ucUz8q6Og==')

WebUI.click(findTestObject('Page_Town Square - this is me Mattermost/span_Save'))

WebUI.closeBrowser()
