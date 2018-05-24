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

WebUI.click(findTestObject('device_type/set image'))

WebUI.click(findTestObject('device_type/set order'))

WebUI.click(findTestObject('device_type/device_type'))

WebUI.setText(findTestObject('device_type/device_type_search'), 'test051812')

WebUI.click(findTestObject('device_type/click_search'))

WebUI.check(findTestObject('device_type/check_devicetype', [('index') : 2]))

WebUI.click(findTestObject('device_type/bianji'))

WebUI.setText(findTestObject('device_type/update-devicetype_name'), '测试0521')

WebUI.setText(findTestObject('device_type/update-devicetype_no'), '0521')

WebUI.click(findTestObject('device_type/update_queren'))

WebUI.closeBrowser()

