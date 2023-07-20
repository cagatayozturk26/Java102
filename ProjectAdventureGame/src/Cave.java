public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Mistik Mağara", new Vampire(),"Yemek");
    }
    @Override
    public void award (){
        this.getPlayer().getInventory().foodChance();
    }
}
