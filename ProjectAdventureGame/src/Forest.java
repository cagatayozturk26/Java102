public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Kuzey Ormanı",new Zombie(),"Odun");
    }
    @Override
    public void award (){
        this.getPlayer().getInventory().firewoodChance();
    }
}
