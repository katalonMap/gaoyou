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

WebUI.callTestCase(findTestCase('login/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('device/set image'))

WebUI.delay(3)

WebUI.click(findTestObject('device/set order'))

WebUI.click(findTestObject('device/device'))

WebUI.delay(3)

WebUI.click(findTestObject('device/new'))

WebUI.setText(findTestObject('device/device_name'), 'test0517')

WebUI.setText(findTestObject('device/device_no'), '123456')

WebUI.click(findTestObject('device/devicetype'))

WebUI.delay(3)

WebUI.click(findTestObject('device/select_devicetype'))

WebUI.delay(1)

WebUI.click(findTestObject('device/device_area'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('device/shouji_open'))

WebUI.click(findTestObject('device/selectarea'))

WebUI.delay(3)

WebUI.click(findTestObject('device/new_queren'))

WebUI.closeBrowser()

