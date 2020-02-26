package app.java;

import app.java.repositories.CardDAO;

public class Main {

    public static void main(String[] args) {

        CardDAO cardParser = new CardDAO();
        cardParser.collectAnswers();
        cardParser.getCardRepository().display();

    }
}