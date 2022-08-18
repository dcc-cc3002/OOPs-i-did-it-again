/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.transparency;

import cl.uchile.dcc.oop.composition.Card;

import java.util.ArrayList;

public class Deck {
  private final ArrayList<Card> cards;

  public Deck(ArrayList<Card> cards) {
    this.cards = cards;
  }

  public ArrayList<Card> getCards() {
    return new ArrayList<>(cards);
  }
}

