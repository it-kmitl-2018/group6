package mocks.data

import converters.messages.Xml.IncludedSupplyChainTradeLineItem.AssociatedDocumentLineDocument.AssociatedCIILDocumentLineDocumentXML
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.IncludedCIILSupplyChainTradeLineItemXML
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedSupplyChainTradeAgreement.{AppliedCITradeAllowanceChargeXML, GrossPriceProductCITradePriceXML, SpecifiedCIILSupplyChainTradeAgreementXML}
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedSupplyChainTradeDelivery.SpecifiedCIILSupplyChainTradeDeliveryXML
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedSupplyChainTradeSettlement.{ApplicableCITradeTaxXML, SpecifiedCIILSupplyChainTradeSettlementXML, SpecifiedCIILTradeSettlementMonetarySummationXML, SpecifiedCITradeAllowanceChargeXML}
import converters.messages.Xml.IncludedSupplyChainTradeLineItem.SpecifiedTradeProduct.{IncludedCINoteXML, IndividualCITradeProductInstanceXML, OriginCITradeCountryXML, SpecifiedCITradeProductXML}

object MockFormToXmlTestData{
  private val taxInvoiceTestData = MockFormTestData.getMockTaxInvoice
  private val item = taxInvoiceTestData.items.head
  private val associatedCIILDocumentLineDocument = AssociatedCIILDocumentLineDocumentXML(item.lineId)
  private val appliedCITradeAllowanceCharge = AppliedCITradeAllowanceChargeXML(chargeIndicator = false, 0, "")
  private val grossPriceProductCITradePrice = GrossPriceProductCITradePriceXML(item.itemAmountPerUnit, appliedCITradeAllowanceCharge)
  private val specifiedCIILSupplyChainTradeAgreement = SpecifiedCIILSupplyChainTradeAgreementXML(grossPriceProductCITradePrice)
  private val specifiedCIILSupplyChainTradeDelivery = SpecifiedCIILSupplyChainTradeDeliveryXML(item.itemQuantity, 0)
  private val applicableCITradeTax = ApplicableCITradeTaxXML(item.taxTypeCode, item.taxRate, 0)
  private val specifiedCITradeAllowanceCharge = SpecifiedCITradeAllowanceChargeXML(chargeIndicator = false, 0, "")
  private val specifiedCIILTradeSettlementMonetarySummation = SpecifiedCIILTradeSettlementMonetarySummationXML(
    item.totalTaxAmount, item.totalBasisAmount, item.grandTotalAmount)
  private val specifiedCIILSupplyChainTradeSettlement = SpecifiedCIILSupplyChainTradeSettlementXML(
    applicableCITradeTax, specifiedCITradeAllowanceCharge, specifiedCIILTradeSettlementMonetarySummation)
  private val individualCITradeProductInstance = IndividualCITradeProductInstanceXML("", 0)
  private val originCITradeCountry = OriginCITradeCountryXML("")
  private val includedCINote = IncludedCINoteXML("", "")
  private val specifiedCITradeProduct = SpecifiedCITradeProductXML(item.itemId, "", item.itemName, individualCITradeProductInstance, originCITradeCountry, includedCINote)
  private val includedCIILSupplyChainTradeLineItem = IncludedCIILSupplyChainTradeLineItemXML(
    associatedCIILDocumentLineDocument, specifiedCIILSupplyChainTradeAgreement, specifiedCIILSupplyChainTradeDelivery,
    specifiedCIILSupplyChainTradeSettlement, specifiedCITradeProduct
  )

  def getMockIncludedSupplyChainTradeLineItemXML: IncludedCIILSupplyChainTradeLineItemXML = includedCIILSupplyChainTradeLineItem
}
