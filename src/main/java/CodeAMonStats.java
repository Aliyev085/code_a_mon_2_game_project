//POJO (Plain Old Java Object) design pattern.
// This code is an example of the Bean or POJO (Plain Old Java Object) design pattern.
// It consists of private fields, public getters and setters, and a default constructor.
// This pattern is used to create a simple Java object with private properties that can be accessed and modified through public methods.
// It provides a basic structure for storing and manipulating data,
// and is commonly used in applications that work with data from databases or other external sources.

public class CodeAMonStats {
    private int health;
    private int defense;
    private int level;
    private int points;
    private String type;

    public CodeAMonStats() {
    }

    public CodeAMonStats(int health, int defense, int level, int points, String type) {
        this.health = health;
        this.defense = defense;
        this.level = level;
        this.points = points;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
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
