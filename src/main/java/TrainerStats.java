//Composite" design pattern, it allows to treat individual objects and compositions of objects uniformly.

import java.util.ArrayList;

public class TrainerStats {
    private int health;
    private int defense;
    private int level;
    private ArrayList<CodeAMonStats> listOfMonsters;
    private String type;


    public TrainerStats() {
    }

    public TrainerStats(int health, int defense, int level, String type) {
        this.health = health;
        this.defense = defense;
        this.level = level;
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<CodeAMonStats> getListOfMonsters() {
        return listOfMonsters;
    }

    public void setListOfMonsters(ArrayList<CodeAMonStats> listOfMonsters) {
        this.listOfMonsters = listOfMonsters;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void decreaseHealth(int dmg) {
        this.health = getHealth() - dmg;
    }
}
