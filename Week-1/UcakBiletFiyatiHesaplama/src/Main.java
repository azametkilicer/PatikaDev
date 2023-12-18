import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan gideceği mesafeyi, yaşını ve yolculuk tipini istiyoruz
        System.out.println("Mesafeyi km olarak girin: ");
        int mesafe = scanner.nextInt();
        System.out.println("Yaşınızı girin : ");
        int yas = scanner.nextInt();
        System.out.println("Yolculuk tipini girin\n 1 => Tek Yön\n 2 => Gidiş Dönüş\n ");
        int yolculukTipi = scanner.nextInt();

        //Önce giriş hata durumlarını kontrol ederek adım adım formülle durumlara göre hesaplama yapıyoruz
        if (mesafe <= 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double normalTutar = mesafe * 0.10;
            double yasIndirimi = 0;

            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas > 65) {
                yasIndirimi = normalTutar * 0.30;
            }

            double indirimliTutar = normalTutar - yasIndirimi;
            double toplamTutar = indirimliTutar;

            if (yolculukTipi == 2) {
                toplamTutar = (indirimliTutar - (indirimliTutar * 0.20)) * 2;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }


    }
}

