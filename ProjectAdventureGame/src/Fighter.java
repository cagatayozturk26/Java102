import java.util.Arrays;
import java.util.Scanner;

public abstract class Fighter {
    private String fighterName;

    private int ID;
    private int demage;
    private int health;
    private int money;

    public Fighter(int ID, String fighterName, int demage, int health, int money) {
        this.ID = ID;
        this.fighterName = fighterName;
        this.demage = demage;
        this.health = health;
        this.money = money;
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

    public String getFighterName() {
        return fighterName;
    }

    public void setFighterName(String fighterName) {
        this.fighterName = fighterName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
