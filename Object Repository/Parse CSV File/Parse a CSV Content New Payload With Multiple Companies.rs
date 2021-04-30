<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Parse a CSV Content New Payload With Multiple Companies</name>
   <tag></tag>
   <elementGuidId>43a7df1f-9e1c-4475-b958-bc66de8046d9</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;payload\&quot;: \&quot;RW1wbG95ZWUgSUQsQmlsbGFibGUgUmF0ZSAocGVyIGhvdXIpLFByb2plY3QsRGF0ZSxTdGFydCBUaW1lLEVuZCBUaW1lCjEsMzUsQnVuZGxlLDIwMTktMDctMDEsOTowMCwxNzowMAoyLDEwMCxHQmFuaywyMDE5LTA3LTAxLDExOjAwLDE2OjAwCjQsMzUwLEJ1bmRsZSwyMDE5LTA3LTAxLDk6MDAsMTc6MDAKNCwzMDAsQnVuZGxlLDIwMTktMDctMDEsMTk6MDAsMjA6MzAKMiwxMDAsR0JhbmssMjAxOS0wNy0wMSwxMzowMCwxNjowMAozLDQ1LEZhY2Vib29rLDIwMTktMDctMDIsMTQ6MDAsMTY6MDAKMyw1NzYsRmFjZWJvb2ssMjAxOS0wNy0wMywxNTowMCwxNjowMAo1LDY4LEZhY2Vib29rLDIwMTktMDctMDQsMTY6MDAsMTk6MDAKNSw1NzgsRmFjZWJvb2ssMjAxOS0wNy0wNSwxNzowMCwyMDowMAoxLDM1LEJ1bmRsZSwyMDE5LTA3LTAxLDk6MDAsMTc6MDAKMiwxMDAsR0JhbmssMjAxOS0wNy0wMSwxMTowMCwxNjowMAo0LDM1MCxCdW5kbGUsMjAxOS0wNy0wMSw5OjAwLDE3OjAwCjQsMzAwLEJ1bmRsZSwyMDE5LTA3LTAxLDE5OjAwLDIwOjMwCjIsMTAwLEdCYW5rLDIwMTktMDctMDEsMTM6MDAsMTY6MDAKMyw0NSxGYWNlYm9vaywyMDE5LTA3LTAyLDE0OjAwLDE2OjAwCjMsNTc2LEZhY2Vib29rLDIwMTktMDctMDMsMTU6MDAsMTY6MDAKNSw2OCxGYWNlYm9vaywyMDE5LTA3LTA0LDE2OjAwLDE5OjAwCjUsNTc4LEZhY2Vib29rLDIwMTktMDctMDUsMTc6MDAsMjA6MDAKNSw2OCxGYWNlYm9vaywyMDE5LTA3LTA0LDE2OjAwLDE5OjAwCjUsNTc4LEZhY2Vib29rLDIwMTktMDctMDUsMTc6MDAsMjA6MDAK\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <katalonVersion>7.8.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://csvdemomockappp.bundlewallet.com/invoice/parse</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
