import java.util.Scanner;

public class Toolstore extends NormalLocation {
    public Toolstore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        int select;
        System.out.println("Mağazaya hoşgeldin.");
        Scanner input = new Scanner(System.in);
        System.out.print("Silah için 1'i, Zırh için 2'yi seçiniz! ");
        select = input.nextInt();
        if (select == 1) buyWeapon();
        else if (select == 2) buyArmor();
        else System.out.println("Tekrar bekleriz.");
        return true;
    }

    public void buyArmor() {
        int select;
        Armors[] armors = {new LightArmor(), new MediumArmor(), new HeavyArmor()};
        for (Armors armor : armors) {
            System.out.println(armor.getID() + " - " + armor.getName() + "\t\tKoruma: " + armor.getBarrier() + "\tFiyat: " + armor.getPrice());
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Almak istediğin zırhı seç: ");
        select = input.nextInt();
        for (int i = 0; i < armors.length; i++) {
            if (select < 1 || select > armors.length) {
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyin");
                break;
            }
            if (i + 1 == select) {
                if (this.getPlayer().getMoney() >= armors[i].getPrice()) {
                    this.getPlayer().getInventory().buyArmor(armors[i]);
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - armors[i].getPrice());
                } else
                    System.out.println("Bu alışverişi yapmak için yeterli para yok. Canavarları öldürerek para kazanabilirsin.\nAncak bunu yaparken hayatta kalman gerekir evlat. Başarılar!");
            }
        }
    }

    public void buyWeapon() {
        int select;
        Weapons[] weapons = {new Gun(), new Sword(), new Rifle()};
        for (Weapons weapon : weapons) {
            System.out.println(weapon.getID() + " - " + weapon.getName() + "\t\tHasar: " + weapon.getDemage() + "\tFiyat: " + weapon.getPrice());
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Almak istediğin silahı seç: ");
        select = input.nextInt();
        for (int i = 0; i < weapons.length; i++) {
            if (select < 1 || select > weapons.length) {
                System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyin");
                break;
            }
            if (i + 1 == select) {
                if (this.getPlayer().getMoney() > weapons[i].getPrice()) {
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - weapons[i].getPrice());
                    this.getPlayer().getInventory().buyWeapon(weapons[i]);
                } else
                    System.out.println("Bu alışverişi yapmak için yeterli para yok. Canavarları öldürerek para kazanabilirsin.\nAncak bunu yaparken hayatta kalman gerekir evlat. Başarılar!");

            }
        }
    }
}

