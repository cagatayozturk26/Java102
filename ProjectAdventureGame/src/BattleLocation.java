public abstract class BattleLocation extends Location {
    private Creature creature;
    private String award;

    public BattleLocation(Player player, String name, Creature creature, String award) {
        super(player, name);
        this.creature = creature;
        this.award = award;
    }

    public abstract void award();

    @Override
    public boolean onLocation() {
        int creatureNumber;
        int tempPlayerHealth = getPlayer().getHealth();
        int killCount = 1;
        System.out.println("Tehlikeli yaratıkların kol gezdiği" + this.getName() + "'na giriş yaptın.");
        creatureNumber = numberOfCreatures();
        System.out.println("Karşına " + creatureNumber + " tane " + this.creature.getName() + " çıktı.");
        for (int i = 0; i < creatureNumber; i++) {
            int tempCreatureHealth = creature.getHealth();
            int count = 1;
            System.out.println(killCount + ". " + this.creature.getName() + " ile savaş başladı!");
            System.out.println("------------------------------------");
            while (tempPlayerHealth > 0 && tempCreatureHealth > 0) {
                System.out.println(count + ". tur:");
                tempCreatureHealth -= getPlayer().getDemage() + getPlayer().getInventory().getWeaponDemage();
                tempPlayerHealth -= this.creature.getDemage() - getPlayer().getInventory().getArmorDefence();
                if (tempPlayerHealth <= 0) {
                    tempPlayerHealth = 0;
                }
                if (tempCreatureHealth <= 0) {
                    tempCreatureHealth = 0;
                    System.out.println(killCount + ". " + this.creature.getName() + " öldürüldü!!!");
                }
                System.out.println("Kalan canlar:\n" + getPlayer().getName() + ": " + tempPlayerHealth + "\n" + this.creature.getName() + ":" + tempCreatureHealth);
                count++;
                if (tempPlayerHealth == 0) break;
            }
            if (tempPlayerHealth == 0) {
                break;
            }
            killCount++;
        }
        if (tempPlayerHealth == 0) {
            System.out.println("Savaşçı maalesef hayatta kalmayı başaramadı!!!");
            return false;
        } else {
            getPlayer().setMoney(getPlayer().getMoney() + creatureNumber * creature.getMoney());
            System.out.println(creatureNumber * creature.getMoney() + " kadar para kazanıldı.\nToplam para: " + getPlayer().getMoney());
            if (luckAlgorithm(17) && tempPlayerHealth > 0) {
                System.out.println("Tebrikler " + this.award + " eşyasını düşürdün");
                award();
            }
        }
        return true;
    }

    public int numberOfCreatures() {
        int random = (int) (Math.random() * 2 + 2);
        return random;
    }

    public boolean luckAlgorithm(int luck) {
        double random = Math.random() * 100;
        if (random < luck)
            return true;
        return false;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public void isAlive() {

    }
}
