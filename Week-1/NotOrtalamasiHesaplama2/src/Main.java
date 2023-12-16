import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int matematik, fizik, kimya, turkce, tarih, muzik;
        int toplamNot = 0, gecerliNotSayisi = 0;

        //if kullanarak girdiği notların istediğimiz aralıkta olup olmadığını kontrol ediyoruz
        // geçerliyse ortalama yapacağımız değişkenlere ekliyoruz.
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = scanner.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            toplamNot += matematik;
            gecerliNotSayisi++;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplamNot += fizik;
            gecerliNotSayisi++;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplamNot += kimya;
            gecerliNotSayisi++;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplamNot += turkce;
            gecerliNotSayisi++;
        }

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();
        if (tarih >= 0 && tarih <= 100) {
            toplamNot += tarih;
            gecerliNotSayisi++;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplamNot += muzik;
            gecerliNotSayisi++;
        }

        // Eğer hiç geçerli not yoksa, ortalama hesaplaması yapma
        if (gecerliNotSayisi == 0) {
            System.out.println("Geçerli bir not girilmedi.");
            return;
        }

        // ortalamasını hesaplıyoruz
        float average = (float) toplamNot / gecerliNotSayisi;

        System.out.println("Ortalamanız: " + average);

        if (average >= 55) {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }

    }
}
