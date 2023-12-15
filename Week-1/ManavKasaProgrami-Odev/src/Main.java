import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sabit fiyat listesi
        final double armutFiyat = 2.14;
        final double elmaFiyat = 3.67;
        final double domatesFiyat = 1.11;
        final double muzFiyat = 0.95;
        final double patlicanFiyat = 5.00;

        // Kullanıcıya kaç kilo ürün aldığını soruyoruz
        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = scanner.nextDouble();

        // Toplam tutarı hesaplama
        double toplamTutar =

                (armutKilo * armutFiyat)
                        +
                (elmaKilo * elmaFiyat)
                        +
                (domatesKilo * domatesFiyat)
                        +
                (muzKilo * muzFiyat)
                        +
                (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
