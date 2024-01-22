public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {

        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Safe House'tasın");
        System.out.println("Canın yenilendi !");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
