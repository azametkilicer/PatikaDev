import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan fiyatı alıyoruz
        System.out.print("Fiyatı giriniz: ");
        double Fiyat = scanner.nextDouble();

        // Kdv oranını hesaplıyoruz, eğer fiyat 0-1000tl arasındaysa %18, 1000tl den yüksekse %8 olacak
        double kdvOrani = 0.18 * (Fiyat > 0 && Fiyat <= 1000 ? 1 : 0) + 0.08 * (Fiyat > 1000 ? 1 : 0);

        // Kdv tutarını ve kdv li fiyatı hesaplıyoruz
        double kdvTutari = Fiyat * kdvOrani;
        double kdvliFiyat = Fiyat + kdvTutari;


        // istenilen çıktıları ekrana yazdırıyoruz
        System.out.println("KDV'siz Fiyat = " + Fiyat);
        System.out.println("KDV'li Fiyat = " + kdvliFiyat);
        System.out.println("KDV Tutarı = " + kdvTutari);
    }
}
