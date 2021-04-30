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


//Start the Billable Hours application using the Appium server.
Mobile.startApplication('C:\\Users\\peter\\Desktop\\Mine\\Coding\\Bundle\\app-armeabi-v7a-release.apk', true)

//Test that the Text 'Billable Hours' on the application is identifiable by the user
Mobile.scrollToText('Billable Hours')

//Test that the Text 'Enter the file path below' on the application is identifiable by the user
Mobile.scrollToText('Enter the file path below')

//Test that the Text box on the application is clickable by the user
Mobile.tap(findTestObject('App UI/android.widget.EditText (1)'), 0)

//Test that the Text box on the application can be long pressed to display a paste dialog box by the user
Mobile.tapAndHold(findTestObject('App UI/android.widget.EditText (2)'), 0, 0)

//Test that the paste dialog box is actually displayed to the user
Mobile.getText(findTestObject('App UI/android.widget.Button - PASTE'), 0)

//Close the Billable Hours application
Mobile.closeApplication()
