/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop
package delegation

import composition.Card
import encapsulation.Deck

class Player {
  val deck = new Deck(List(
    new Card(
      "Blazing Inpachi",
      "A wicked wooden spirit now burning in flames. Its fire attack is powerful, but it will " +
        "soon be nothing but ashes."
    ), new Card(
      "Gemini Elf",
      "Elf twins that alternate their attacks."
    )))

  def shuffleDeck(): Unit = deck.shuffle()
}
