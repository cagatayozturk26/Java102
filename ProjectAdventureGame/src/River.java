public class River extends BattleLocation {
    public River(Player player) {
        super(player, "Gizemli Nehir", new Bear(),"Su");
    }
    @Override
    public void award (){
        this.getPlayer().getInventory().waterChance();
    }
}