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

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/a_Ogoszenia'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/button_Przygotuj ogoszenie'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_orderNoticePlacementType'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_orderNoticeGoalRadioSect'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_agreementSection_coFinan'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_ProjectName'), 'Projekt numer 1')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_agreementSection_onlyFor'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_SpecialGroupPercent'), '40')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Zapisz'))

WebUI.waitForElementPresent(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Przejd dalej'), 10)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Przejd dalej'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_FullAccessToDocumentsOfP'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_FullAccessToDocumentsOfP_1'), 'www.gddkia.gov.pl')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_SpecificationURLEnabled'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_SpecificationURL'), 'www.gddkia.gov.pl')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Zapisz'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Przejd dalej'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_II.3)-oferty-wszystkich'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_QuantityOfSharedParts'), '3')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_MaxQuantityOfPartsForOne'), '3')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_OrderShortDescription'), 'Opis zamówienia')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_MainCPV'), '12345678-1')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_AdditionalCPVCodesExists'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_normal ng-pristine ng-un'), '1234')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_normal ng-untouched ng-n'), '12345678-2')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/button_Dodaj kolejny kod'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_normal ng-pristine ng-un_1'), '12345678-3')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_normal ng-untouched ng-v'), '12345678-3')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_OrderValueNet'), '300000')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_agreementSection_additio'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_PeriodOfRealizationOrder'), '12')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Zapisz'))

WebUI.waitForElementPresent(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Przejd dalej'), 10)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Przejd dalej'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_agreementSection_purchas'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_ExcludedByArt24Ust5pkt1P'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_excludedByArt24Ust5pkt4P'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_excludedByArt24Ust5pkt5P'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/textarea_DocumentListOfArt25Us'), 'Oswiadczenie III.4)')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/textarea_DocumentListOfFulfilC'), 'Oświadczenie III.5)')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/textarea_DocumentListOfArt25Us_1'), 'Oświadczenie III.6)')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/textarea_OtherDocumentList'), 'Oświadczenie III.7)')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Zapisz'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Przejd dalej'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.2)agreementSection_tenderG-nie'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.3)agreementSection_advance-nie'))

WebUI.waitForElementPresent(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.4)agreementSection_offersI-nie'), 10)

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.4)agreementSection_offersI-nie'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.4)agreementSection_offersI2-nie'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.5)agreementSection_variant-nie'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.5)agreementSection_variant2-nie'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.5)agreementSection_variant3-nie'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_IV.1.8)agreementSection_isElect-nie'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Zapisz'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Przejd dalej'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_normal ng-pristine ng-un_2'), 'CENA')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/td'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_normal ng-pristine ng-un_3'), '60')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/button_Dodaj kolejny'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_normal ng-pristine ng-un_4'), 'GWARANCJA')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_normal ng-pristine ng-un_5'), '40')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_agreementSection_changes'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/textarea_DescriptionOfAgreemen'), 'Zakres zmian')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_DeadlineForSubmissionOffday'), '31-08-2019')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_DeadlineForSubmissionOff'), '11:11')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_QuantityOfDaysToDeadline'), '40')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_agreementSection_annulme'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/input_agreementSection_annulme_1'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Zapisz'))

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/span_Przejd do wypeniania zacz'))

WebUI.scrollToElement(findTestObject('Ogloszenie/Ogloszenie_1_2/td_Dodatkowy kod CPV'), 1)

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_zalacznik-dodatkowyCPV'), '12341234-1')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/button_Dodaj kod CPV'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_zalacznik-dodatkowyCPV2'), '12341234-2')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_OrderValueNet'), '100000')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_Currency'), 'PLN')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_PeriodOfRealizationOrder'), '10')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/button_Zapisz zacznik dla czci'))

WebUI.waitForElementPresent(findTestObject('Ogloszenie/Ogloszenie_1_2/label_GWNY KOD CPV'), 10)

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_zalacznik2-dodatkowyCPV'), '12345678-5')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/button_Dodaj kod CPV'))

WebUI.setText(findTestObject('null'), '56785678-1')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/div_Zacznik 2 z 3'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_OrderValueNet'), '50000')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_Currency'), 'PLN')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_PeriodOfRealizationOrder'), '12')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/button_Zapisz zacznik dla czci'))

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_OrderValueNet'), '30000')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_Currency'), 'PLN')

WebUI.setText(findTestObject('Ogloszenie/Ogloszenie_1_2/input_PeriodOfRealizationOrder'), '12')

WebUI.click(findTestObject('Ogloszenie/Ogloszenie_1_2/button_Zapisz zacznik dla czci'))

WebUI.closeBrowser()

