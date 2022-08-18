/*
 * "oops-i-did-it-again" (c) by Ignacio Slater M.
 * "oops-i-did-it-again" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */
package cl.uchile.dcc.oop.encapsulation;

import cl.uchile.dcc.oop.composition.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
  final Deck deck = new Deck(new ArrayList<>(
      List.of(new Card("Card 1", "Card 1 text.", 1000), new Card("Card 2", "Card 2 text.", 2000))));

  public void shuffleDeck() {
    deck.shuffle();
  }
}
