/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.transparency

import cl.uchile.dcc.oop.composition.Card


class Deck(
  private val _cards: MutableList<Card>
) {
  val cards
    get() = _cards.toList()
}