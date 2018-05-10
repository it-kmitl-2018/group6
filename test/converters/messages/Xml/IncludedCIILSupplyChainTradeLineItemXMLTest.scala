package converters.messages.Xml

import mocks.data.{MockFormTestData, MockFormToXmlTestData, MockXmlTestData}
import org.scalatest.FunSuite

class IncludedCIILSupplyChainTradeLineItemXMLTest extends FunSuite {
  private val taxInvoiceTestData = MockFormTestData.getMockTaxInvoice
  private val formDataToincludedCIILSupplyChainTradeLineItemXml =
    MockFormToXmlTestData.getMockIncludedSupplyChainTradeLineItemXML
  private val includedCIILSupplyChainTradeLineItemTestData =
    MockXmlTestData.getMockIncludedSupplyChainTradeLineItemXML

  test("IncludedCIILSupplyChainTradeLineItemXML should get data from TaxInvoiceForm correctly") {
    assert(includedCIILSupplyChainTradeLineItemTestData === formDataToincludedCIILSupplyChainTradeLineItemXml)
  }
}
