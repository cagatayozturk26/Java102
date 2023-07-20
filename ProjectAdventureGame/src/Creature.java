public abstract class Creature {
    private int ID;
    private String name;
    private int demage;
    private int health;
    private int money;

    public Creature(int ID, String name, int demage, int health, int money) {
        this.ID = ID;
        this.name = name;
        this.demage = demage;
        this.health = health;
        this.money = money;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDemage() {
        return demage;
    }

    public void setDemage(int demage) {
        this.demage = demage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
