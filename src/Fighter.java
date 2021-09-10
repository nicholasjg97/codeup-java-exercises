public class Fighter {
    // instance variables
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private int hitPoints;

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    private int maxDamage;

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    // methods
    public void printStats() {
        System.out.println(name + " has " + hitPoints + " hit points and can do " + maxDamage + " damage.");
    }

    public void battleRoar() {
        System.out.println("I am " + name + ", prepare to be defeated");
    }

    // you call a static method with a class name (e.g., D20.roll20())
    // but you call non-static method using
    public double attackRoll() {
        return D20.roll20();
    }

    // default constructor
    public Fighter() {
    }

    public Fighter(String name, int hitPoints, int maxDamage) {
        System.out.println("A new fighter has emerged");
        this.name = name;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
        this.printStats();
    }

}
