import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('login/login'), [('username') : GlobalVariable.gy_username], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('alarm/alarm_icon'))

WebUI.click(findTestObject('alarm/alarm_message'))

WebUI.click(findTestObject('alarm/alarm_record'))

WebUI.click(findTestObject('alarm/start-time'))

WebUI.delay(3)

WebUI.click(findTestObject('alarm/last-month'))

WebUI.delay(2)

WebUI.click(findTestObject('alarm/select_starttime'))

WebUI.click(findTestObject('alarm/end-time'))

WebUI.delay(3)

WebUI.click(findTestObject('alarm/last-month'))

WebUI.delay(2)

WebUI.click(findTestObject('alarm/select_endtime'))

WebUI.delay(5)

WebUI.click(findTestObject('alarm/search_btn'))

WebUI.delay(5)

WebUI.closeBrowser()

