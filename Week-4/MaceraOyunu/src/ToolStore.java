public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player, "Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("########### Store'a hoşgeldiniz ###########");

        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("0- Çıkış");
            System.out.print("Seçimin: ");

            int selectCase = input.nextInt();

            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Yanlış seçim tekrar dene: ");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmour();
                    buyArmour();
                    break;
                case 3:
                    System.out.println("Görüşürük!");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("########### Silah ###########");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + "< Fiyat: " + w.getPrice() + ", Hasar: " + w.getDamage() + ">");
        }
        System.out.println("0 - Çıkış");
    }

    public void buyWeapon() {
        System.out.println("Silah seçin: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Yanlış seçim, Tekrar dene: ");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli Paran yok");
                } else {
                    System.out.println("Satın aldığın " + selectedWeapon.getName() + " Silah.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paran: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    public void printArmour() {
        System.out.println("########### Zırhlar ###########");
        for (Armour a : Armour.armours()) {
            System.out.println(a.getId() + "-" + a.getName() + " <Fiyat: " + a.getPrice() + ", Zırh: " + a.getBlock() + ">");
        }
        System.out.println("0 - Çıkış");
    }

    public void buyArmour() {
        System.out.println("Zırh Seç: ");

        int selectArmourID = input.nextInt();
        while (selectArmourID < 0 || selectArmourID > Armour.armours().length) {
            System.out.println("Yanlış Seçim Tekrar dene: ");
            selectArmourID = input.nextInt();
        }

        if (selectArmourID != 0) {
            Armour selectedArmour = Armour.getArmourObjByID(selectArmourID);

            if (selectedArmour != null) {
                if (selectedArmour.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paran yok!");
                } else {
                    System.out.println("Satın aldığınız " + selectedArmour.getName() + " Zırh");
                    int balance = this.getPlayer().getMoney() - selectedArmour.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paran: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmour(selectedArmour);
                }
            }
        }
    }
}
