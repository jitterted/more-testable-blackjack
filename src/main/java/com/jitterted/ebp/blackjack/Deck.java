package com.jitterted.ebp.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private final List<Card> cards = new ArrayList<>();

  public Deck() {
    var suits = List.of("♠", "♦", "♥", "♣"); // TODO: SHOTGUN SURGERY? (was changed here, but not in card coloring code in the Card display method)
    for (String suit : suits) {
      for (Rank cardRank : Rank.values()) {
        cards.add(new Card(suit, cardRank));
      }
    }
    Collections.shuffle(cards);
  }

  public int size() {
    return cards.size();
  }

  public Card draw() {
    return cards.remove(0);
  }
}
