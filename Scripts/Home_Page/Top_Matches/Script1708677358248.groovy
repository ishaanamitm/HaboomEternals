import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://haboom.com/')

WebUI.delay(10)

String matchday = WebUI.getText(findTestObject('Object Repository/HomePage/Page_Haboom - Trusted Online Casino and Spo_832508/p_In-Play'))

println(matchday)

