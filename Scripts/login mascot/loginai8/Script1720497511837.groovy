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
*  This code opens a browser, navigates to a specific URL, maximizes the window, logs in with a username and encrypted password, clicks on the login button, waits for 5 seconds, and then closes the browser.
*
*  1. Open a browser with an empty URL.
*  2. Navigate to a specific URL.
*  3. Maximize the browser window.
*  4. Set text in the username field.
*  5. Set encrypted text in the password field.
*  6. Click on the login button.
*  7. Wait for 5 seconds.
*  8. Close the browser.
*
*/

