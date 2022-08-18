/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.dcc.uchile.oop
package encapsulation

import composition.Card

import scala.util.Random

class Deck(private var _cards: List[Card]) {
  // Getter
  def cards: List[Card] = _cards

  // Setter
  def cards_=(cards: List[Card]): Unit = {
    _cards = cards
  }

  def shuffle(): Unit = {
    cards = Random.shuffle(cards)
  }
}
