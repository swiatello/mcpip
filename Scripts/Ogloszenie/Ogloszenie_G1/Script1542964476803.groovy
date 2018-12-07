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

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_636611-N-2018_09'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/button_Przygotuj ogoszenie'), 0)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Ogloszenie/Ogloszenie_G1/button_Przygotuj ogoszenie'), 5)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/button_Przygotuj ogoszenie'))

WebUI.delay(5)

'prolog'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__tryb_zamieszczania'))

WebUI.delay(1)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__ogloszenie_dotyczy'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_coF'), 0)

WebUI.delay(2)

'z srodkow UE'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_coF'))

WebUI.delay(1)

'zaklady pracy chronionej'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_onl'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(4)

'sekcja 1'
WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_Podmiot prawa publiczneg'), 0)

WebUI.delay(3)

'I.2 rodzaj zamawiajacego'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_Podmiot prawa publiczneg'))

'I.2'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__OthersDescription'), 'SPZOZ')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input__FullAccessToDocumentsOf'), 0)

WebUI.delay(3)

'I.4'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__FullAccessToDocumentsOf'))

'I.4'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__FullAccessToDocumentsOf_18'), 'bip.wszzkielce.pl')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input__SpecificationURLEnabled'), 0)

WebUI.delay(3)

'I.4 (2)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__SpecificationURLEnabled'))

'I.4 (2)'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__SpecificationURL'), 'bip.wszzkielce.pl')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input__DescriptionOfRequiredMe'), 0)

WebUI.delay(3)

'I.4 (6)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__DescriptionOfRequiredMe'))

'I.4 (6)'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__DescriptionOfRequiredMe_9'), 'pisemnie')

'I.4 (6)'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__AddressOfRequiredMet'), 'Wojewódzki Szpital Zespolony w Kielcach, Sekretariat głowny, ul. Grunwaldzka 45, 25-736 Kielce')

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(4)

'II.3 wszystkie czesci'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__partialOfferDocumentFol'))

'II.4 opis przedmiotu zamowienia'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__OrderShortDescriptio'), 'Przedmiotem zamówienia jest zakup i sukcesywna dostawa materiałow eksplotacyjnych dla potrzeb Centralnej Sterylizatorni WSZZ w Kielcach. Szczegółowe opisy dostępne w załącznikach do SIWZ oraz samym SIWZ')

WebUI.delay(2)

'II.5'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/button_Przegldaj kody'))

WebUI.delay(3)

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Szukaj_SearchKey'), '33140000-3')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/button_Szukaj'))

WebUI.delay(8)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/a_33140000-3 - Materiay medycz'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/button_Tak'))

WebUI.delay(5)

'II.7'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_add'))

'II.8 okres zamowienia'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__PeriodOfRealizationOrde'), '24')

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/textarea_II.9) Informacje doda'), 0)

WebUI.delay(2)

'II.9 informacje dodatkowe'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea_II.9) Informacje doda'), 'Dostawy sukcesywne wg bieżących potrzeb zamawiającego do magazynu medycznego przez okres 24 miesięcy od dnia 15.02.2019 r.')

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

'sekcja 3'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/textarea_Okrelenie warunkw_Con'), 0)

WebUI.delay(3)

'III.1.3 zdolnosc techniczna lub zawodowa'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea_Okrelenie warunkw_Con'), 'O udzielenie zamówienia mogą ubiegac  się wykonawcy, wobec których brak jest podstaw do wykluczenia z postępowania na podstawie art. 24 ust.1, art. 24 ust.5 pkt. 1-2 i 4 oraz spełniają okreslone warunki.')

'III.1.3 imiona i nazwiska'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_pur'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_purcha'), 0)

WebUI.delay(3)

'III.2 wykluczenia'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_purcha'))

'III.2 (1)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_(podstawa wykluczenia ok'))

'III.2 (2)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_(podstawa wykluczenia ok_1'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_(podstawa wykluczenia ok_2'), 0)

WebUI.delay(3)

'III.2 (4)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_(podstawa wykluczenia ok_2'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_Owiadczenie o niepodlega'), 0)

WebUI.delay(3)

'III.3 (1)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_Owiadczenie o niepodlega'))

'III.4'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__DocumentListOfArt25U'), '1. aktualny odpis z właściwego rejestru lub centralnej ewidencji i informacji o działalności gospodarczej, jeżeli odrębne przepisy wymagają wpisu do rejestru lub ewidencji')

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__DocumentListOfFulfil'), 0)

WebUI.delay(3)

'III.5.1'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__DocumentListOfFulfil'), '1. zrealizowali nalezycie w okresie ostatnich 3 lat przed upływem terminu składania ofert, co najmniej jedną dostawę, której przedmiotem był asortyment o charakterze tożsamym lub zbliżonym z przedmiotem zamówienia.\n2.zakresu dostępnych wykonawcy zasobów innego podmiotu')

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__DocumentListOfArt25U_142'), 0)

WebUI.delay(3)

'III.6'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__DocumentListOfArt25U_142'), '1. dokumenty potwierdzające iż oferowane dostawy odpowiadają wymaganiom określonym przez zamawiającego w opisie przedmiotu zamówienia.')

'III.7'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__OtherDocumentList'), '1. wypełniony i podpisany formularz ofertowy\n2. wypełniony i podpisany formularz asortymentowo-cenowy')

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ten'), 0)

WebUI.delay(2)

'IV.1.2'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ten'))

'IV.1.3'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_adv'))

'IV.1.4 (1)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_off'))

'IV.1.4 (2)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_off_1'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_var'), 0)

WebUI.delay(2)

'IV.1.5 (1)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_var'))

'IV.1.5 (2)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_var_1'))

'IV.1.5 (3)'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_var_2'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ord'), 0)

WebUI.delay(3)

'IV.1.7'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ord'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_off_2'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_all'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_isE'), 0)

WebUI.delay(3)

'IV.1.8 aukcja'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_isE'))

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_Akcja_cena'), 0)

WebUI.delay(2)

'IV.2.2 CENA'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Akcja_cena'), '60')

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input_Akcja_cena'), Keys.chord(Keys.TAB))

'sposob obliczenia pkt'
WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/select_cena'), 'mal')

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/select_cena'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/button_Usu'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input_kryteria_checklist'), Keys.chord(Keys.TAB))

'GWARANCJA'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_gwarancja'), '20')

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_gwarancja'), Keys.chord(Keys.TAB))

'sposob obliczenia pkt'
WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/select_gwarancja'), 'GW24p', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/select_gwarancja'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/button_Usu'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input_kryteria_checklist_3'), Keys.chord(Keys.TAB))

'TERMIN'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_termin'), '10')

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_termin'), Keys.chord(Keys.TAB))

'sposob obliczenia pkt'
WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/select_termin'), 'std', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/select_termin'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/button_Usu'), Keys.chord(Keys.TAB))

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input_kryteria_checklist_4'), Keys.chord(Keys.TAB))

'PLATNOSC'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_platnosc'), '10')

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input_Usu_platnosc'), Keys.chord(Keys.TAB))

'sposob obliczenia pkt'
WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/select_platnosc'), 'ros', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_applie'), 0)

WebUI.delay(2)

'IV.2.3'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_applie'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_change'), 0)

WebUI.delay(3)

'IV.5'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__agreementSection_change'))

WebUI.delay(2)

'IV.5'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__DescriptionOfAgreeme'), '1. Strony dopuszczają możliwość zmian umowy w następującym zakresie: a. zmiany osób odpowiedzialnych za realizację umowy, b. zmiany danych teleadresowych, c. zmiany podwykonawców na zasadach określonych w umowie, d. zmiany przywoływanych w przedmiotowej umowie oraz SIWZ ustaw oraz rozporządzeń (zmiany przepisów bądź wymogów szczególnych dotyczących przedmiotu zamówienia). e. w przypadkach określonych w art. 144 u.p.z.')

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input__DeadlineForSubmissionOf'), 0)

WebUI.delay(2)

'IV.6.2'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input__DeadlineForSubmissionOf'))

'IV.6.2 DATA'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__DeadlineForSubmissionOf'), '30-11-2018')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input__DeadlineForSubmissionOf'), Keys.chord(Keys.ESCAPE))

'GODZINY'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__godzina'), '10')

WebUI.sendKeys(findTestObject('Ogloszenie/Ogloszenie_G1/input__godzina'), Keys.chord(Keys.TAB))

'MINUTY'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__minuty'), '30')

WebUI.delay(2)

'IV.6.2  skrocenie terminu'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_abb'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input__QuantityOfDaysToDeadlin'), 0)

WebUI.delay(2)

'IV.6.3'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input__QuantityOfDaysToDeadlin'), '30')

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ann - Copy'), 0)

WebUI.delay(2)

'IV.6.4'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ann - Copy'))

'IV.6.5'
WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/input_tak_agreementSection_ann_1'))

'IV.6.6'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_IV.6.6) Informacje dodat'), 'Załacznik I - informacje dotyczące ofert częsciowych')

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(4)

'zalacznik 1 OPIS'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea_Nazwa_OrderDescriptio'), 'Pakiet 1 – Wskaźniki typu 4')

'czas trwania'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Okres w miesicach_Period'), '24')

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

'zalacznik 2 OPIS'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__OrderDescription'), 'Pakiet nr 3 – Wskaźniki emulacyjne')

'czas trwania'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Okres w miesicach_Period'), '24')

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

'zalacznik 3 OPIS'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__OrderDescription'), 'Pakiet 2 – Wskaźniki typu 5')

'czas trwania'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Okres w miesicach_Period'), '24')

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

'zalacznik 4 OPIS'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/textarea__OrderDescription'), 'Pakiet 4 – Naboje EO')

'czas trwania'
WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_G1/input_Okres w miesicach_Period'), '24')

WebUI.delay(2)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Zapisz'))

WebUI.delay(4)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/span_Przejd dalej'))

WebUI.delay(3)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_G1/a_Usu_icon-1'))

WebUI.delay(2)

