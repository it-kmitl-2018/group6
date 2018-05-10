package converters

import mocks.data.{JsonConverterTestData, MockData}
import org.scalatest.FunSuite
import utilities.Json

class TaxInvoiceJsonConverterTest extends FunSuite {
  private val taxInvoiceConverter = new TaxInvoiceJsonConverter
  private val tradeAgreement = MockData.getMockTradeAgreement
  private val taxInvoice = Json.toJson(JsonConverterTestData.getMockTaxInvoice)

  test("TaxInvoiceJsonConverter should return taxInvoice Json") {
    assert(taxInvoiceConverter.convertTradeAgreementToJson(tradeAgreement) === taxInvoice)
  }
}
