import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://haboom.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Exchange2/Page_Haboom - Trusted Online Casino and Spo_832508/a_Exchange'))

List<WebElement> games = DriverFactory.getWebDriver().findElements(By.xpath('//div[@class=\'card-content\']'))

println('No of games under sports highlight section - ' + games.size())

List<WebElement> selectgame = DriverFactory.getWebDriver().findElements(By.xpath('//div[@class=\'card-content\']//following::tbody/tr/td[1]'))

for (int i = 0; i < selectgame.size(); i++) {
    WebElement currentElement = selectgame.get(i)

    currentElement.click() //WebDriver driver = DriverFactory.getWebDriver()
}

WebUI.closeBrowser()

WebUI.closeBrowser()

