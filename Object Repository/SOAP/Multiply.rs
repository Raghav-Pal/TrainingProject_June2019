<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Multiply</name>
   <tag></tag>
   <elementGuidId>2af0600a-6c27-4501-b0a2-2c4e33247118</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;Envelope xmlns=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot;>
    &lt;Body>
        &lt;Multiply xmlns=&quot;http://tempuri.org/&quot;>
            &lt;intA>${num1}&lt;/intA>
            &lt;intB>${num2}&lt;/intB>
        &lt;/Multiply>
    &lt;/Body>
&lt;/Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceFunction>Multiply</soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.NUM1</defaultValue>
      <description></description>
      <id>6aca31d9-bef3-4e97-a3fa-2a4af0b67382</id>
      <masked>false</masked>
      <name>num1</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.NUM2</defaultValue>
      <description></description>
      <id>76086a24-a4fe-4414-b371-84297bbd9b88</id>
      <masked>false</masked>
      <name>num2</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyElementText(response, 'MultiplyResponse.MultiplyResult', '20')</verificationScript>
   <wsdlAddress>http://www.dneonline.com/calculator.asmx?WSDL</wsdlAddress>
</WebServiceRequestEntity>
