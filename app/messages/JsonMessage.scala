package messages

import messages.JsonMessage.{Buyer, Seller}

case class JsonMessage(seller: Seller, buyer: Buyer)
