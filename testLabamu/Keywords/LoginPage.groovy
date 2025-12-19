import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class LoginPage {
	def navigateToEmailLogin() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/LoginPage/link_LoginEmail'), 10)
		WebUI.click(findTestObject('Object Repository/LoginPage/link_LoginEmail'))
	}

	def enterEmail(String email) {
		WebUI.setText(findTestObject('Object Repository/LoginPage/input_Email'), email)
	}

	def clickTerms() {
		WebUI.check(findTestObject('Object Repository/LoginPage/checkbox_Terms'))
	}

	def isMasukEnabled() {
		return WebUI.verifyElementClickable(findTestObject('Object Repository/LoginPage/button_Masuk'))
	}
	
	def submitLogin() {
		if (this.isMasukEnabled()) {
			WebUI.click(findTestObject('Object Repository/LoginPage/button_Masuk'))
		} else {
			throw new Exception("Gagal Klik Masuk")
		}
	}
}
