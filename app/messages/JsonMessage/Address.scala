package messages.JsonMessage

case class Address(
    lineOne: String,
    lineTwo: String,
    cityName: String,
    citySubDivisionName: String,
    postCode: String,
    countrySubDivision: String,
    countryName: String)
