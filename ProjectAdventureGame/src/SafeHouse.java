public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli eve ulaştın.\nCanın yenilendi! Yeni maceraya hazırsın.");
        return true;
    }
}
