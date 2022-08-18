/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.dcc.uchile.oop
package delegation

object Main {
  def main(args: Array[String]): Unit = {
    val player = new Player()
    println(player.deck.cards)
    player.shuffleDeck()
    println(player.deck.cards)
  }
}
