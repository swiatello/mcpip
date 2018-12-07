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

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/a_Wstpna weryfikacja'))

WebUI.scrollToElement(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_NIE_btn btn-primary'), 0)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_NIE_btn btn-primary'))

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/input_Zoono owiad. z Art 25 us'))

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/input_Wezw. z Art. 26 ust. 2f_'))

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/input_Wezwaniawyjanienia_IsCom'))

WebUI.setText(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/textarea_Powd_ReasonComplete'), 'wykonawca nie złożył wymaganych dokumenów')

WebUI.scrollToElement(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/input_Wykluczony_IsExcluded'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/input_Wykluczony_IsExcluded'))

WebUI.setText(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/textarea_Uzasadnienie merytory'), 'niedostarczenie w terminie wymaganych dokumentów')

WebUI.setText(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/textarea_Uzasadnienie prawne_L'), 'art. 24 ustawy Pzp')

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Zamknij weryfikacj dost'))

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/a_Analiza ofert'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_NIE_btn btn-primary_1'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_NIE_btn btn-primary_1'))

WebUI.scrollToElement(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/input_Odrzucenie_IsExcluded2'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/input_Odrzucenie_IsExcluded2'))

WebUI.setText(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/textarea_Uzasadnienie merytory'), 'rażąco niska cena')

WebUI.setText(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/textarea_Uzasadnienie prawne_L'), 'art. 89 ust.1 pkt 4 ustawy Pzp')

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Zapisz'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Zamknij analize ofert'), 0)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Zamknij analize ofert'))

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/a_Ranking ofert'))

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Zamknij ranking ofert'))

WebUI.delay(3)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/a_Analiza budetu'))

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Uniewanij cz'))

WebUI.delay(1)

WebUI.setText(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/textarea_Uzasadnienie merytory'), 'przekroczenie budżetu')

WebUI.setText(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/textarea_Uzasadnienie prawne_L'), 'art. 93 ust.1 pkt 4 ustawy Pzp')

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Ok'))

WebUI.delay(3)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/button_Zamknij analize budetu'))

WebUI.delay(2)

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/a_Ostateczna weryfikacja'))

WebUI.click(findTestObject('Wstepna_ostat_weryfikacja/weryfikacja/a_Usu_icon-1'))

WebUI.delay(2)

