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

//Send a request to the server and store the response in the variable 'response'
response = WS.sendRequest(findTestObject('Get Invoice Details Using Invoice ID/Get Invoice Details Using Invoice ID (Wrong Invoice ID)'))

println(response.getResponseText())

//Verify that the request returned a 400, as the wrong invoice is not meant to fetch any company invoice detail
WS.verifyResponseStatusCode(response, 400, FailureHandling.CONTINUE_ON_FAILURE)

//Also verify that the request returned a 200 to see if the API fetches a company invoice detail
WS.verifyResponseStatusCode(response, 200)

//Verify that the reponse has a company invoice ID attached
WS.verifyElementPropertyValue(response, 'id', 'c92f9b3c-120b-4928-9101-6e52e8404590142')

