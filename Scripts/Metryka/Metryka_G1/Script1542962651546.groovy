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

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Metryka/Metryka_G1/span_Nowe postpowanie'))

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Numer()_Number'), '636611-N-2018_07')

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Tytu()_Name'), 'Zakup i sukcesywna dostawa materiałów eksploatacyjnych dla potrzeb centralnej sterylizatorni WSZZ w Kielcach')

WebUI.click(findTestObject('Metryka/Metryka_G1/input_Tryb postpowania_Options'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Metryka/Metryka_G1/select_Usugi'), 0)

'dostawy1'
WebUI.selectOptionByValue(findTestObject('Metryka/Metryka_G1/select_Usugi'), '2', true)

WebUI.delay(2)

WebUI.setText(findTestObject('Metryka/Metryka_G1/textarea_Opis_Description'), 'Szczegółowy opis przedmiotu zamówienia zawierają załączniki do SIWZ')

WebUI.click(findTestObject('Metryka/Metryka_G1/input_Podzia na zadania czciow'))

WebUI.delay(2)

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Akcja_description0'), 'Pakiet 1')

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Akcja_pakiet1'), '1000000')

WebUI.waitForElementPresent(findTestObject('Metryka/Metryka_G1/button_Dodaj'), 3)

WebUI.click(findTestObject('Metryka/Metryka_G1/button_Dodaj'))

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Usu_description1'), 'Pakiet 2')

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Usu_pakiet2'), '2000000')

WebUI.waitForElementPresent(findTestObject('Metryka/Metryka_G1/button_Dodaj2'), 3)

WebUI.click(findTestObject('Metryka/Metryka_G1/button_Dodaj2'))

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Usu_description2'), 'Pakiet 3')

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Usu_pakiet3'), '3000000')

WebUI.waitForElementPresent(findTestObject('Metryka/Metryka_G1/button_Dodaj3'), 3)

WebUI.click(findTestObject('Metryka/Metryka_G1/button_Dodaj3'))

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Usu_description3'), 'Pakiet 4')

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Usu_pakiet4'), '4000000')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Metryka/Metryka_G1/input_Powoanie komisji_Options'), 0)

WebUI.click(findTestObject('Metryka/Metryka_G1/input_Powoanie komisji_Options'))

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Akcja_person0'), 'Tomasz Abacki')

WebUI.selectOptionByValue(findTestObject('Metryka/Metryka_G1/select_Przewodniczcy'), '1', true)

WebUI.click(findTestObject('Metryka/Metryka_G1/button_komisja_Dodaj'))

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Usu_person1'), 'Barbara Kos')

WebUI.selectOptionByValue(findTestObject('Metryka/Metryka_G1/select_Przewodniczcy1'), '2', true)

WebUI.click(findTestObject('Metryka/Metryka_G1/button_komisja_Dodaj1'))

WebUI.setText(findTestObject('Metryka/Metryka_G1/input_Usu_person2'), 'Jan Kowalski')

WebUI.selectOptionByValue(findTestObject('Metryka/Metryka_G1/select_Przewodniczcy2'), '3', true)

WebUI.click(findTestObject('Metryka/Metryka_G1/span_Zapisz postpowanie'))

WebUI.delay(3)

WebUI.click(findTestObject('Metryka/Metryka_G1/a_Usu_icon-1'))

WebUI.delay(2)

