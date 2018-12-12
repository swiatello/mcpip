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

WebUI.click(findTestObject('Protokol_otwarcia_G1/span_636611-N-2018_G1'))

WebUI.waitForElementClickable(findTestObject('Protokol_otwarcia_G1/a_Protok otwarcia'), 3)

WebUI.delay(5)

WebUI.click(findTestObject('Protokol_otwarcia_G1/a_Protok otwarcia'))

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Pobierz oferty'), 0)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Protokol_otwarcia_G1/button_Pobierz oferty'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Pobierz oferty'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

'D1'
WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 1')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '1107000')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 2')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '2952000')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 3')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '3567000')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 4')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '492012.3')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_2'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_2'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_2'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 1')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '1119300')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_2'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_2'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_2'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 2')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '2964300')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_2'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_2'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_2'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 3')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '3075000')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_2'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_2'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_2'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 4')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '5043000')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_3'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_3'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_3'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 1')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '1131600')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_3'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_3'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_3'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 2')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '2607600')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_3'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_3'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_3'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 3')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '4182000')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_3'), 0)

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Protokol_otwarcia_G1/button_3'), 3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_3'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/label_Pakiet()'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.click(findTestObject('Protokol_otwarcia_G1/select_pakiet'))

WebUI.sendKeys(findTestObject('Protokol_otwarcia_G1/select_pakiet'), 'Pakiet 4')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_cena'), '6642000')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Gwarancja_form-control n'), '36')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Termin wykonania_form-co'), '30')

WebUI.setText(findTestObject('Protokol_otwarcia_G1/input_Warunki patnoci_form-con'), '14')

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Protokol_otwarcia_G1/button_Zapisz'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Protokol_otwarcia_G1/button_Zamknij protok otwarcia'))

WebUI.delay(2)

WebUI.click(findTestObject('Protokol_otwarcia_G1/a_Usu_icon-1'))

WebUI.delay(2)

