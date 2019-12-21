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

WebUI.click(findTestObject('Page_Town Square - this is me Mattermost/span_'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/textarea_(optional)_newChannelPurpose'), 
    'h')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/textarea_h'), 'ha')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/textarea_ha'), 'hay')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/textarea_hay'), 'hayo')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/textarea_(optional)_newChannelHeader'), 
    'h')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/textarea_h_1'), 'ho')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/textarea_ho'), 'hoy')

WebUI.setText(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/textarea_hoy'), 'hoya')

WebUI.click(findTestObject('Object Repository/Page_Town Square - this is me Mattermost/span_Create New Channel'))

WebUI.closeBrowser()
