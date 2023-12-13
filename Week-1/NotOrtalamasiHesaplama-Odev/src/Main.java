import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan veri alacağımız scanner sınıfını oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan not bilgilerini istiyoruz
        System.out.print("Matematik notunuzu giriniz: ");
        int matematik = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        int turkce = scanner.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        int tarih = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        int muzik = scanner.nextInt();

        //notların ortalamasını hesaplıyoruz
        float average = (float) ((matematik + fizik + kimya + turkce + tarih + muzik) / 6.0);
        System.out.println("Ortalamanız: " + average);

        // Koşullu ifadeler ile sınıf geçme durumunu çıktı olarak gösteriyoruz
        String result = average > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);
    }
}
