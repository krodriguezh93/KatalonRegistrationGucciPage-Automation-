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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.gucci.com/us/en/')

WebUI.maximizeWindow()

if (WebUI.waitForElementPresent(findTestObject('Object Repository/Overlay Windows'), GlobalVariable.timeOut)) {
	WebUI.click(findTestObject('Object Repository/Overlay Windows'))
}
else {
	println('no se encontro el objeto Overlay')
}

if (WebUI.waitForElementPresent(findTestObject('Object Repository/btn_Sign in Home Page'), GlobalVariable.timeOut)) {
	WebUI.click(findTestObject('Object Repository/btn_Sign in Home Page'))
}
else {
	println('No se encontro el objeto Sign in')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/input_Email Address'), GlobalVariable.timeOut)) {
	WebUI.setText(findTestObject('Object Repository/input_Email Address'), findTestData("RegistrationGucci Data").getValue(1, 1))
} else {
	println('No se encontro el objeto EmailAddress')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/btn_Continue'), GlobalVariable.timeOut)) {
	WebUI.click(findTestObject('Object Repository/btn_Continue'))
} else {
	println('No se encontro el objeto Continue')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/input_Password'), GlobalVariable.timeOut)) {
	WebUI.setText(findTestObject('Object Repository/input_Password'), findTestData("RegistrationGucci Data").getValue(2, 1))
} else {
	println('No se encontro el objeto Password')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/click_Title'), GlobalVariable.timeOut)) {
	WebUI.click(findTestObject('Object Repository/click_Title'))
} else {
	println('No se encontro el objeto title')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/click_TitleOption'), GlobalVariable.timeOut)) {
	WebUI.click(findTestObject('Object Repository/click_TitleOption'))
} else {
	println('No se encontro el objeto title option')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/input_FirstName'), GlobalVariable.timeOut)) {
	WebUI.setText(findTestObject('Object Repository/input_FirstName'), findTestData("RegistrationGucci Data").getValue(3, 1))
} else {
	println('No se encontro el objeto FirstName')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/input_LastName'), GlobalVariable.timeOut)) {
	WebUI.setText(findTestObject('Object Repository/input_LastName'), findTestData("RegistrationGucci Data").getValue(4, 1))
} else {
	println('No se encontro el objeto LastName')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/input_Month'), GlobalVariable.timeOut)) {
	WebUI.setText(findTestObject('Object Repository/input_Month'), findTestData("RegistrationGucci Data").getValue(5, 1))
} else {
	println('No se encontro el objeto Month')
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/input_Day'), GlobalVariable.timeOut)) {
	WebUI.setText(findTestObject('Object Repository/input_Day'), findTestData("RegistrationGucci Data").getValue(6, 1))
} else {
	println("No se encontro el objeto Day")
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/input_Year'), GlobalVariable.timeOut)) {
	WebUI.setText(findTestObject('Object Repository/input_Year'), findTestData("RegistrationGucci Data").getValue(7, 1))
} else {
	println("No se encontro el objeto Year")
}
if (WebUI.waitForElementPresent(findTestObject('Object Repository/btn_Submit'), GlobalVariable.timeOut)) {
	WebUI.click(findTestObject('Object Repository/btn_Submit'))
} else {
	println("No se encontro el objeto Submit")
}

WebUI.takeScreenshot()
WebUI.takeScreenshot('C:/Users/Karina/Documents/Documentos/Katalon/Imagenes')










