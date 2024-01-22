import java.util.Random;

public class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = randomObstacleNumber();
        System.out.println("Şuan buradasın: " + this.getName());
        System.out.println("Orada " + obsNumber + " " + this.getObstacle().getName() + "Burada");
        System.out.println("Saldırmak için S bas veya R ile kaç ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S") && combat(obsNumber)) {
            if (combat(obsNumber)) {
                System.out.println("Tüm düşmanları öldürdün " + this.getName());
                return true;
            }

        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldün!");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
        for (int i = 1; i < obsNumber; i++) {
            playerStats();
            obstacleStats(i);

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println("Attack için A bas yada R ile kaç");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("A")) {

                    double condition = Math.random() * 100;
                    if (condition > 50) {
                        System.out.println("Saldırdın ");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();

                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println();
                            System.out.println("Düşman saldırdı ");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmour().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }

                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        } else {
                            return false;
                        }
                    } else {
                        System.out.println("Düşman saldırdı ");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmour().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();

                        if (this.getPlayer().getHealth() > 0) {
                            System.out.println();
                            System.out.println("Saldırdın ");
                            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }
                    }
                    if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                        System.out.println("Düşmanı öldürdün!");
                        if (getObstacle().getName().equals("Snake")) {
                            earnItem();
                        } else {
                            System.out.println("Kazandın " + this.getObstacle().getAward() + " coins");
                            this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                            System.out.println("Mevcut para: " + this.getPlayer().getMoney());

                        }

                    }

                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void afterHit() {
        System.out.println("Canın: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + "'Can: " + this.getObstacle().getHealth());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("Oyuncu İstatikleri");
        System.out.println("############################################");
        System.out.println("Can: " + this.getPlayer().getHealth());
        System.out.println("Silah: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar: " + this.getPlayer().getTotalDamage());
        System.out.println("Zırh: " + this.getPlayer().getInventory().getArmour().getName());
        System.out.println("Blok: " + this.getPlayer().getInventory().getArmour().getBlock());
        System.out.println("Para: " + this.getPlayer().getMoney());
    }

    public void obstacleStats(int i) {
        System.out.println(i + "." + this.getObstacle().getName() + " İstatistik");
        System.out.println("############################################");
        System.out.println("Can: " + this.getObstacle().getHealth());
        System.out.println("Hasar: " + this.getObstacle().getDamage());
        System.out.println("Ödül: " + this.getObstacle().getAward());
    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public void earnItem() {
        Random random = new Random();
        int randomItem = random.nextInt(1, 101);
        if (randomItem <= 15) {
            Random r1 = new Random();
            int randomItem1 = random.nextInt(1, 101);
            if (randomItem1 <= 20) {
                System.out.println("Tüfek kazandın !");
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(3));
            } else if (randomItem1 > 20 && randomItem1 <= 50) {
                System.out.println("Kılıç kazandın !");
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(2));

            } else {
                System.out.println("Tabanca Kazandın");
                getPlayer().getInventory().setWeapon(Weapon.getWeaponObjByID(1));
            }


        } else if (randomItem > 15 && randomItem <= 30) {
            Random r2 = new Random();
            int randomItem2 = random.nextInt(1, 101);
            if (randomItem2 <= 20) {
                System.out.println("Ağır zırh kazandın");
                getPlayer().getInventory().setArmour(Armour.getArmourObjByID(3));
            } else if (randomItem2 > 20 && randomItem2 <= 50) {
                System.out.println("Orta zırh kazandın");
                getPlayer().getInventory().setArmour(Armour.getArmourObjByID(2));

            } else {
                System.out.println("Hafif zırh kazandın");
                getPlayer().getInventory().setArmour(Armour.getArmourObjByID(1));

            }
        } else if (randomItem > 30 && randomItem <= 55) {
            Random r2 = new Random();
            int randomItem2 = random.nextInt(1, 101);
            if (randomItem2 <= 20) {
                System.out.println("18 coins kazandın");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
            } else if (randomItem2 > 20 && randomItem2 <= 50) {
                System.out.println("5 coins kazandın");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
            } else {
                System.out.println("1 coins kazandın");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
            }
            System.out.println("Mevcut paran: " + this.getPlayer().getMoney());
        } else
            System.out.println("Hiç birşey kazanmadın");


    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
