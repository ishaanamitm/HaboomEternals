import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//WebUI.openBrowser('')

//WebUI.navigateToUrl('https://haboom.com/')

//WebUI.maximizeWindow()

//WebUI.setText(findTestObject('Object Repository/Login/Page_Haboom - Trusted Online Casino and Spo_832508/input_Help_username'), 
//    'MartinGarrix')

//WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Haboom - Trusted Online Casino and Spo_832508/input_Help_password'), 
//    'cvW8qx4B2o1WegCEDy41Xg==')

//WebUI.click(findTestObject('Object Repository/Casino/Page_Haboom - Trusted Online Casino and Spo_832508/input_Help_submitLogForm'))

WebUI.click(findTestObject('Object Repository/Casino/Page_Haboom - Trusted Online Casino and Spo_832508 (1)/a_Casino'))


List<WebElement> provider= DriverFactory.getWebDriver().findElements(By.xpath("//input[@name='provider_list']"))

println(provider.size())

for (int i = 0; i < provider.size(); i++) {
	if (i != 0) { 
		
		WebElement currentElement = provider.get(i)
		currentElement.click()
		
		String selectprovider =  WebUI.getWindowTitle()
		println(selectprovider)
		
		WebUI.click(findTestObject('Object Repository/Casino/Page_Haboom - Best Online Casino Games for _42066a/section_Winmatch EZ Dealer Roulette        _87cd10'))
		
		
		WebUI.switchToWindowIndex(1)
		WebUI.delay(10)
		String gamewindow =  WebUI.getWindowTitle()
		//WebUI.delay(10)
		println(gamewindow)
		WebUI.takeFullPageScreenshot()
		WebUI.closeWindowIndex(1)
		
		WebUI.switchToWindowTitle(selectprovider)
		
		
		
		
		
		//WebUI.delay(10)
		//WebUI.takeFullPageScreenshot()

		
		
	}


}

