package messages.JsonMessage

case class Seller(
    taxNumber: String,
    branchNumber: String,
    nameEn: String,
    nameTh: String,
    email: String,
    telephone: String,
    fax: String,
    address: Address)
