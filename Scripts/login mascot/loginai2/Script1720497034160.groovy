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

WebUI.navigateToUrl('http://206.189.158.91:8080/sparepart-factory-cms/login.zul')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('login mascot/input username'), 'sadm001')

WebUI.setEncryptedText(findTestObject('login mascot/input password'), 'da8fEzhczGg=')

WebUI.click(findTestObject('login mascot/klik button login'))

WebUI.delay(5)

WebUI.closeBrowser()
/*
*  Automates the process of logging into a web application.
*
*  1. Opens a browser.
*  2. Navigates to a specific URL.
*  3. Maximizes the browser window.
*  4. Enters a username into the designated field.
*  5. Enters an encrypted password into the designated field.
*  6. Clicks on the login button.
*  7. Delays the execution for 5 seconds.
*  8. Closes the browser.
*
*/

