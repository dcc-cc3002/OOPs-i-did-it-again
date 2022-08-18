/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain {
  public static void main(String[] args) {
    // We can define a variable as a ``MonsterCard``
    MonsterCard blueEyes = new MonsterCard("Blue Eyes White Dragon", 8, 3000, 2500);
    // Or we can use the ``Card`` superclass thanks to _subtype polymorphism_
    Card darkMagician = new MonsterCard("Dark Magician", 7, 2500, 2100);

    // We can access the fields of the ``MonsterCard``
    System.out.printf("%s has %d attack and %d defense", blueEyes.getName(), blueEyes.getAttack(),
                      blueEyes.getDefense());
    // Since we defined ``darkMagician`` as a ``Card``, we cannot access the fields specific to
    // ``MonsterCard``
    // Uncomment the following to see it doesn't compile
//    System.out.printf("%s has %d attack and %d defense", darkMagician.getName(), darkMagician.getAttack(),
//                      darkMagician.getDefense());
    
//    /******************************************************************************************
//     * Another example of polymorphism
//     ******************************************************************************************/

    // We can use a mutable list of ``Card`` instead of a list of ``MonsterCard``.
    // ALWAYS use the type of the class that's higher up in the hierarchy.
    List<Card> deck = new ArrayList<>();  // This makes more sense
    // Instead of:
    List<MonsterCard> deck2 = new ArrayList<>(); // No
  }
}
