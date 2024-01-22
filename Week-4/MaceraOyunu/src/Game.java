import java.util.Scanner;

public class Game {
    private Player player;
    private Location location;
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Macera Oyununa Hoşgeldiniz!");
        System.out.print("Lütfen bir isim giriniz: ");
        String playerName = input.nextLine();
        player = new Player(playerName);
        System.out.println("Sayın " + player.getName() + ", bu karanlık ve sisli adaya hoşgeldiniz! Burada olan her şey gerçek!");
        System.out.print("Lütfen bir karakter seçiniz: ");
        System.out.println("#################################################");

        player.selectChar();

        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("################ Locations ################");
            System.out.println();
            System.out.println("1- Safe House     ### Burada savaş yok, güvendesiniz ###");
            System.out.println("2- Tool Store     ### Silah ve kalkan alabilirsiniz, ama paranız varsa Xd ###");
            System.out.println("3- Cave           ### Burada zombiler sizi yemezse yiyecek kazanacaksınız ###");
            System.out.println("4- Forest         ### Vampiri öldürürseniz, size odun vereceğim ###");
            System.out.println("5- River          ### Ayıyı öldür ve suyu al ###");
            System.out.println("6- Mine           ### Yılanlarla dolu madeni geçmeyi başarırsan silah, kalkan ve para'ya sahip olacaksın ###");
            System.out.println("0- Çıkış");
            System.out.print("Gitmek istediğiniz alanı seçiniz: ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir alan giriniz: ");
            }

            if (location == null) {
                System.out.println("Oyun bitti, görüşmek üzere!");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("GAME OVER!");
                break;
            }
        }
    }
}
