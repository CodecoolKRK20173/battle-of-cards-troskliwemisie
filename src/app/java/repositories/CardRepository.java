package app.java.repositories;

import app.java.models.Card;

import java.util.List;

public class CardRepository {
    List<Card> cards;

    public CardRepository(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void display() {
        for(Card card: cards) {
            System.out.println(card.getId());
            System.out.println(card.getFriendless());
            System.out.println(card.getHappiness());
            System.out.println(card.getLoyalty());
        }
    }

}
