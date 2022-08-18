/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.dcc.uchile.oop
package composition

class Card(val name: String, val text: String) {
  override def toString = s"Card { name: '$name', text: '$text' }"
}

