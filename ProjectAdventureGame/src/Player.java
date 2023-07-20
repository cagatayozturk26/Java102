import java.util.Scanner;

public class Player {
        private Inventory inventory = new Inventory(0,0,false,false,false);

    private String playerName;
    private String name;
    private int demage;
    private int health;
    private int money;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void selectCharacter() {
        int chose;
        Fighter[] fighters = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-----------------------------------------");
        for (Fighter fighter : fighters) {
            System.out.println(fighter.getID() + " Karakter: " + fighter.getFighterName() + "\tHasar : " + fighter.getDemage() + "\t\tSağlık : " + fighter.getHealth() + " Para : " + fighter.getMoney());
        }
        Scanner inp = new Scanner(System.in);
        System.out.print("Oynamak istediğin karakteri seç: ");
        chose = inp.nextInt();
        switch (chose) {
            case 1 -> {
                initCharacter(new Samurai());
                System.out.println("Samuray başarılı bir şekilde seçildi. Hazırsan macera başlıyor!!!");
            }
            case 2 -> {
                initCharacter(new Archer());
                System.out.println("Okçu başarılı bir şekilde seçildi. Hazırsan macera başlıyor!!!");
            }
            case 3 -> {
                initCharacter(new Knight());
                System.out.println("Şovalye başarılı bir şekilde seçildi. Hazırsan macera başlıyor!!!");
            }
            default -> System.out.println("Hatalı giriş yaptınız!!!");
        }
    }

    public void initCharacter(Fighter fighter) {
        this.name = fighter.getFighterName();
        this.demage = fighter.getDemage();
        this.health = fighter.getHealth();
        this.money = fighter.getMoney();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
