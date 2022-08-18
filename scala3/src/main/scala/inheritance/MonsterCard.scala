/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop
package inheritance

class MonsterCard(name: String,
                  val level: Int,
                  val attack: Int,
                  val defense: Int) extends Card(name):
  override def toString = s"$name L$level ($attack/$defense)"
