/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.dcc.uchile.oop
package composition

object Main {
  def main(args: Array[String]): Unit = {
    val player = new Player()
    val mildTurkey = new Card("Mild Turkey", "The taste of victory will bowl you over.")
    val dragoonsOfDraconia = new Card(
      "Dragoons of Draconia", "Armed with muskets and iron spears, these mounted land " +
        "troops of the Draconia Empire are feared by the Reptier Kingdom and other bordering " +
        "nations."
    )
    player.deck += mildTurkey
    player.deck += dragoonsOfDraconia
    for (card <- player.deck) {
      println(s"${card.name} - ${card.text}")
    }
  }
}