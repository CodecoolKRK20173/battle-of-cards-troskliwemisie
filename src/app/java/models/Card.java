package app.java.models;

import java.util.HashMap;
import java.util.Map;

public class Card {
    private String id;
    private int friendless;
    private int happiness;
    private int loyalty;
    private Map<String, Integer> stats;

    public Card(String id, int friendless, int happiness, int loyalty) {
        this.id = id;
        this.friendless = friendless;
        this.happiness = happiness;
        this.loyalty = loyalty;
        this.stats = new HashMap<>();
    }

    public String getId() {
        return id;
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

    public Map<String, Integer> getStats(){
        return stats;
    }

    public void addStats(String stat, Integer id){
        stats.put(stat, id);
    }

}
