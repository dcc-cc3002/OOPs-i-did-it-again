package cl.uchile.dcc.oop.composition

class Card(
  val name: String,
  val text: String
) {
  override fun toString() = "Card { name: '$name', text: '$text' }"
}
