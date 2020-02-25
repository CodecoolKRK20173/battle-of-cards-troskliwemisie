package app.java.models;

public class Card {
    private String name;
    private int friendless;
    private int happiness;
    private int loyalty;

    public Card(String name, int friendless, int happiness, int loyalty) {
        this.name = name;
        this.friendless = friendless;
        this.happiness = happiness;
        this.loyalty = loyalty;
    }

    public String getName() {
        return name;
    }

    public int getFriendless() {
        return friendless;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getLoyalty() {
        return loyalty;
    }
}
