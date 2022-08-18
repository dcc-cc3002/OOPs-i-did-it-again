/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.inheritance;

public class MonsterCard extends Card {
  private int level;
  private int attack;
  private int defense;

  public MonsterCard(String name, int level, int attack, int defense) {
    super(name);  // We always need to call the superclass constructor first
    this.level = level;
    this.attack = attack;
    this.defense = defense;
  }

  // region : Getters and Setters
  public int getLevel() {
    return level;
  }

  public int getAttack() {
    return attack;
  }

  public int getDefense() {
    return defense;
  }

  public void setAttack(int attack) {
    this.attack = Math.max(0, attack);
  }

  public void setDefense(int defense) {
    this.defense = Math.max(0, defense);
  }

  public void setLevel(int level) {
    if (level < 0 || level > 12) {
      System.out.println("Level must be between 0 and 12");
    } else {
      this.level = level;
    }
  }
  // endregion
}
