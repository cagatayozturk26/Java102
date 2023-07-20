public class Inventory {
    private int armorDefence;
    private int weaponDemage;
    private boolean food;
    private boolean water;
    private boolean firewood;

    public Inventory(int armorDefence, int weaponDemage, boolean food, boolean water, boolean firewood) {
        this.armorDefence = armorDefence;
        this.weaponDemage = weaponDemage;
        this.food = food;
        this.water = water;
        this.firewood = firewood;
    }

    public void buyWeapon(Weapons weapon) {
        this.weaponDemage = weapon.getDemage();
    }

    public void buyArmor(Armors armor) {
        this.armorDefence = armor.getBarrier();
    }

    public void foodChance() {
        this.food = true;
    }

    public void waterChance() {
        this.water = true;
    }

    public void firewoodChance() {
        this.firewood = true;
    }

    public int getArmorDefence() {
        return armorDefence;
    }


    public int getWeaponDemage() {
        return weaponDemage;
    }


    public boolean isFood() {
        return food;
    }

    public boolean isWater() {
        return water;
    }


    public boolean isFirewood() {
        return firewood;
    }

}
