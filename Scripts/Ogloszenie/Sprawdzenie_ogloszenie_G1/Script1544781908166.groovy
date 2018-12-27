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
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_636611-N-2018_G1'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/button_Zmie'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/button_Zmie'))

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Wcz edycj'))

WebUI.delay(2)

'prolog'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__tryb_zamieszczania'), 5)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__ogloszenie_dotyczy'), 5)

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Wcz edycj'))

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__CompanyName'), 'value')

WebUI.verifyMatch(actualValue, 'Firma Publiczna 2', true)

WebUI.delay(3)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__Address'), 'value')

WebUI.verifyMatch(actualValue, 'Kolejowa 66', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__City'), 'value')

WebUI.verifyMatch(actualValue, 'Miasteczko nad Wisłą', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__PostalCode'), 'value')

WebUI.verifyMatch(actualValue, '01-800', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__Country'), 'value')

WebUI.verifyMatch(actualValue, 'Polska', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__Voivodeship'), 'value')

WebUI.verifyMatch(actualValue, 'Kujawsko-Pomorskie', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__PhoneNumber'), 'value')

WebUI.verifyMatch(actualValue, '+48 000 000 000', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Faks_Fax'), 'value')

WebUI.verifyMatch(actualValue, '+48 000 000 001', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_E-mail_Email'), 'value')

WebUI.verifyMatch(actualValue, 'emailtestowejfirmy@testowafirma.pl', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Adres strony internetowe'), 'value')

WebUI.verifyMatch(actualValue, 'www.testowafirma1.pl', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Adres profilu nabywcy (j'), 'value')

WebUI.verifyMatch(actualValue, 'www.testowafirma2.pl', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Adres profilu nabywcy (j_1'), 'value')

WebUI.verifyMatch(actualValue, 'www.testowafirma3.pl', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Adres profilu nabywcy (j_2'), 'value')

WebUI.verifyMatch(actualValue, 'www.testowafirma3.pl', false)

'I.2'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__OthersDescription'), 'value')

WebUI.verifyMatch(actualValue, 'SPZOZ', true)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__FullAccessToDocumentsOf'), 5)

'I.4 (6)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__DescriptionOfRequiredMe'), 5)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__DescriptionOfRequiredMe_9'), 'value')

'I.4 (6)'
WebUI.verifyMatch(actualValue, 'pisemnie', true)

'I.4 (6)'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__AddressOfRequiredMet'), 'value')

WebUI.verifyMatch(actualValue, 'Wojewódzki Szpital Zespolony w Kielcach, Sekretariat głowny, ul. Grunwaldzka 45, 25-736 Kielce', 
    true)

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Wcz edycj'))

WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_orderH'), 2)

'II.3 wszystkie czesci'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__partialOfferDocumentFol'), 2)

'II.8 okres zamowienia'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__MainCPV'), 'value')

WebUI.verifyMatch(actualValue, '33140000-3 - Materiały medyczne', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Warto bez VAT_OrderValue'), 'value')

WebUI.verifyMatch(actualValue, '', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__PeriodOfRealizationOrde'), 'value')

WebUI.verifyMatch(actualValue, '24', false)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(3)

'sekcja 3'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Wcz edycj'))

'III.2 wykluczenia'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_purcha'), 2)

'III.2 (1)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_(podstawa wykluczenia ok'), 2)

'III.2 (2)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_(podstawa wykluczenia ok_1'), 2)

'III.2 (4)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_(podstawa wykluczenia ok_2'), 2)

'III.3 (1)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_Owiadczenie o niepodlega'), 2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Wcz edycj'))

'IV.1.2'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ten'), 2)

'IV.1.3'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_adv'), 2)

'IV.1.4 (1)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_off'), 2)

'IV.1.4 (2)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_off_1'), 2)

'IV.1.5 (1)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_var'), 2)

'IV.1.5 (2)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_var_1'), 2)

'IV.1.5 (3)'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_var_2'), 2)

'IV.1.7'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ord'), 2)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_off_2'), 2)

WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_all'), 2)

'IV.1.8 aukcja'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_isE'), 2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Wcz edycj'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_Akcja_cena'), FailureHandling.STOP_ON_FAILURE)

'IV.2.2 CENA'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Akcja_cena'), 'value')

WebUI.verifyMatch(actualValue, '60', true)

'sposob obliczenia pkt'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/select_cena'), 'value')

WebUI.verifyMatch(actualValue, '474', false)

'GWARANCJA'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_gwarancja'), 'value')

WebUI.verifyMatch(actualValue, '20', false)

'sposob obliczenia pkt'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/select_gwarancja'), 'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(actualValue, '475', false)

'TERMIN'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_termin'), 'value')

WebUI.verifyMatch(actualValue, '10', false)

'sposob obliczenia pkt'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/select_termin'), 'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(actualValue, '468', false)

'PLATNOSC'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_platnosc'), 'value')

WebUI.verifyMatch(actualValue, '10', false)

'sposob obliczenia pkt'
actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/select_platnosc'), 'value', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(actualValue, '473', false)

'IV.2.3'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_applie'), 2)

'IV.5'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_change'), 2)

WebUI.delay(2)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__DescriptionOfAgreeme'), 'value')

'IV.5'
WebUI.verifyMatch(actualValue, '1. Strony dopuszczają możliwość zmian umowy w następującym zakresie: a. zmiany osób odpowiedzialnych za realizację umowy, b. zmiany danych teleadresowych, c. zmiany podwykonawców na zasadach określonych w umowie, d. zmiany przywoływanych w przedmiotowej umowie oraz SIWZ ustaw oraz rozporządzeń (zmiany przepisów bądź wymogów szczególnych dotyczących przedmiotu zamówienia). e. w przypadkach określonych w art. 144 u.p.z.', 
    false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__DeadlineForSubmissionOf'), 'value')

'IV.6.2 DATA'
WebUI.verifyMatch(actualValue, '30-11-2018', false)

WebUI.delay(2)

'IV.6.2  skrocenie terminu'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_abb'), 2)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input__QuantityOfDaysToDeadlin'), 'value')

'IV.6.3'
WebUI.verifyMatch(actualValue, '30', false)

'IV.6.5'
WebUI.verifyElementChecked(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ann_1'), 2)

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Wcz edycj'))

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/textarea_Nazwa_OrderDescriptio'), 'value')

'zalacznik 1 OPIS'
WebUI.verifyMatch(actualValue, 'Pakiet 1 – Wskaźniki typu 4', false)

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/input_Okres w miesicach_Period'), 'value')

'czas trwania'
WebUI.verifyMatch(actualValue, '24', false)

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Wcz edycj'))

actualValue = WebUI.getAttribute(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__OrderDescription'), 'value')

'zalacznik 4 OPIS'
WebUI.verifyMatch(actualValue, 'Pakiet 4 – Naboje EO', false)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/a_Usu_icon-1'))

WebUI.delay(2)

