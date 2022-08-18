/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.composition;

public class Card {
  String name;
  String text;
  int attack;

  public Card(String name, String text,
              int attack) {
    this.name = name;
    this.text = text;
    this.attack = attack;
  }
}
