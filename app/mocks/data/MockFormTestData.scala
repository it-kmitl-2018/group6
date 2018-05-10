package mocks.data

import models.CommercialTransaction.AddressForm
import models.ExchangedDocument.TaxInvoiceHeaderForm
import models.TaxInvoiceForm
import models.TradeAgreement.{DealerForm, ReferenceDocumentForm, TradeAgreementForm}
import models.TradeItem.ItemForm
import models.TradeParty.{DeliveryDetailForm, PaymentDetailForm, ReceiverForm, SenderForm}

object MockFormTestData {
  private val orderReference = ReferenceDocumentForm("id1", 1234567890, "CODE1")
  private val additionalReference = ReferenceDocumentForm("id1", 1234567890, "CODE2")
  private val deliveryTypeCode = "D123"
  private val address = AddressForm("123", "building", "lane", "village", "456",
    "sukhumvit", "district", "asjdh", "thailand", "bangkok", "789")
  private val dealer = DealerForm("dealerId", "globalId", "name", "taxPayerId", "uri", "email", address)
  private val tradeAgreement = TradeAgreementForm(dealer, dealer, deliveryTypeCode, orderReference, additionalReference)
  private val taxInvoiceHeader = TaxInvoiceHeaderForm("headerid", "name", "380", 1546246809, "abcd", "942", 1546246809, "hello")
  private val sender = SenderForm("1234", "4321", "sendername", 1546246809)
  private val paymentDetail = PaymentDetailForm("THB", "FEET", 7, 1000.25f, isCharged = true, 2, "ABC", "hello", 1, 2000.20f, 20, 30, 2000, 5000)
  private val receiver = ReceiverForm("id1", "id2", "hello", "aaaa", "abcd", "0818645549", address)
  private val deliveryDetail = DeliveryDetailForm(sender, receiver, paymentDetail)
  private val item1 = ItemForm("id", 5, 10, "yes", 7, 1000, 2000, 3000, "123", "hello")
  private val item2 = ItemForm("id2", 51, 120, "yes", 1, 1000, 2000, 3000, "12345", "habello")
  private val items = List[ItemForm](item1, item2)
  private val taxInvoice = TaxInvoiceForm("ER3-2558", taxInvoiceHeader, tradeAgreement, deliveryDetail, items)

  def getMockTaxInvoice: TaxInvoiceForm = taxInvoice
}
