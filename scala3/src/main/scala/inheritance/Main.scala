/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop
package inheritance

@main def inheritance(): Unit =
    // We can define a variable as a ``MonsterCard``
    val blueEyes: MonsterCard = MonsterCard("Blue Eyes White Dragon", 8, 3000, 2500)
    // Or we can use the ``Card`` superclass thanks to _subtype polymorphism_
    val darkMagician: Card = MonsterCard("Dark Magician", 7, 2500, 2100)

    // We can access the fields of the ``MonsterCard``
    println(s"${blueEyes.name} has ${blueEyes.attack} attack and ${blueEyes.defense} defense")
    // Since we defined ``darkMagician`` as a ``Card``, we cannot access the fields specific to
    // ``MonsterCard``
    // Uncomment the following to see it doesn't compile
    //    println(
    //      s"${darkMagician.name} has ${darkMagician.attack} attack and ${darkMagician.defense} defense")
    // If we don't explicitly define the type of the variable, Scala will infer if it's a
    // ``MonsterCard`` or a ``Card`` according to how we use it
    val redEyes = MonsterCard("Red-Eyes Black Dragon", 7, 2400, 2000)
    println(s"${redEyes.name} has ${redEyes.attack} attack and ${redEyes.defense} defense")

    /** ****************************************************************************************
     * Another example of polymorphism
     * **************************************************************************************** */

    // We can use a mutable list of ``Card`` instead of a list of ``MonsterCard``.
    // ALWAYS use the type of the class that's higher up in the hierarchy.
    val deck1 = List[Card]() // This makes more sense
    // Instead of:
    val deck2 = List[MonsterCard]() // No
