package app.java.repositories;

import app.java.models.Card;

import java.util.ArrayList;
import java.util.List;

public class CardRepository {

    List<Card> cards;

    public CardRepository() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void display() {
        for (Card card : cards) {
            System.out.println(card.getId());
            for (String key : card.getStats().keySet()) {
                System.out.println(key + " " + card.getStats().get(key));
            }
        }
    }

//    public void display() {
//        for(Card card: cards) {
//            System.out.println(card.getId());
//            System.out.println(card.getFriendless());
//            System.out.println(card.getHappiness());
//            System.out.println(card.getLoyalty());
//        }
//    }

}
