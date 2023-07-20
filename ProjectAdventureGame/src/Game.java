import java.util.Scanner;

public class Game {
    public static Player player = new Player("new");

    public void start() {
        System.out.print("Oyuncu ismi giriniz: ");
        Scanner inp = new Scanner(System.in);
        String playerName = inp.nextLine();

        player.setPlayerName(playerName);

        System.out.println(player.getPlayerName() + " Macera oyununa hoşgeldin!");
        player.selectCharacter();
        play(player);
    }

    public void play(Player player) {
        boolean checkLocation = true;
        while (checkLocation) {
            if (player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater()) {
                System.out.println("TEBRİKLER BÜTÜN EŞYALARI TOPLAYARAK OYUNU BAŞARI İLE TAMAMLADIN");
                break;
            }
            Location location = null;
            int selectLocation;
            Location[] locations = {new SafeHouse(player), new Toolstore(player), new Forest(player), new Cave(player), new River(player)};
            for (int i = 0; i < locations.length; i++) {
                System.out.println((i + 1) + " " + locations[i].getName());
            }
            System.out.print("Gitmek istediğin lokasyonu seç: ");
            Scanner inp = new Scanner(System.in);
            selectLocation = inp.nextInt();
            switch (selectLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new Toolstore(player);
                    break;
                case 3:
                    location = new Forest(player);
                    break;
                case 4:
                    location = new Cave(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Hatalı giriş yapıldı!!!");
            }
            checkLocation = location.onLocation();
        }

    }
}

