import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen mevcut sıcaklık değerini giriniz: ");
        int sicaklik = scanner.nextInt(); // Kullanıcıdan sıcaklık değerini istiyoruz

        /* sıcaklık değerine göre önermeler yapıyoruz, sıcaklık 5-15 derece arasında
        sinemayi önereceğimiz için ilk kontrol ettiğim sıcaklığın 15 dereceden küçük olması
         */
        if (sicaklik < 15) {
            if (sicaklik < 5) {
                System.out.println("Kayak yapmalısın.");
            } else {
                System.out.println("Sinema'ya gitmelisin.");
            }
        } else {
            if (sicaklik < 25) {
                System.out.println("Pikniğe gitmelisin.");
            } else {
                System.out.println("Yüzme'ye gitmelisin.");
            }
        }


    }
}
