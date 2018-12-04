import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/span_636611-N-2018_04'))

WebUI.waitForElementClickable(findTestObject('Protokol_otwarcia_Dostawcy/a_Protok otwarcia'), 3)

WebUI.delay(5)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/a_Protok otwarcia'))

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Pobierz oferty'), 0)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Protokol_otwarcia_Dostawcy/button_Pobierz oferty'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Pobierz oferty'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 1')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '1000000')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 2')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '2456312')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '24')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 3')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '4561236')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '45')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '45')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '11')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 4')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '5000000')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '12')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_2'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_2'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_2'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 1')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '1256789')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '24')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '30')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_2'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_2'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_2'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 2')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '2503693')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '14')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '14')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_2'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_2'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_2'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 3')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '4561231')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '12')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_2'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_2'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_2'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 4')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '5789632')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '24')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '24')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_3'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_3'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_3'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 1')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '1234567')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_3'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_3'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_3'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 2')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '2223222')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_3'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_3'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_3'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 3')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '3500000')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '24')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '30')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_3'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_Dostawcy/button_3'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_3'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_Dostawcy/select_pakiet'), 'Pakiet 4')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_cena'), '4999999')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Gwarancja_form-control n'), '12')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Termin wykonania_form-co'), '18')

WebUI.setText(findTestObject('Protokol_otwarcia_Dostawcy/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/button_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_Dostawcy/a_Ogoszenia'))

WebUI.delay(3)

WebUI.closeBrowser()

