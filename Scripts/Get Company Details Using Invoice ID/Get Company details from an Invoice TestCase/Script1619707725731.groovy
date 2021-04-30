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
response = WS.sendRequest(findTestObject('Get Company Details Using Invoice ID/Get Company details from an Invoice'))

println(response.getResponseText())

//Verify that the request returned a 200
WS.verifyResponseStatusCode(response, 200)

//Verify that the reponse has a content of the company Google.
WS.verifyElementPropertyValue(response, 'name', 'Google')

//Verify that the reponse has a content of the company's employeeid 1
WS.verifyElementPropertyValue(response, 'lineItems[0].employeeId', '1')

//Verify that the reponse has a content of the company's billable rate per hour as 300
WS.verifyElementPropertyValue(response, 'lineItems[0].ratePerHour', '300.00')

//Verify that the reponse has a content of the company's employee total hours worked as 8
WS.verifyElementPropertyValue(response, 'lineItems[0].hoursWorked', '8')

//Verify that the reponse has a content of the company's total cost amount as 2400
WS.verifyElementPropertyValue(response, 'totalAmount', '2400.00')
