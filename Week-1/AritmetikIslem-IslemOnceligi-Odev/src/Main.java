import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            // Scanner nesnesi oluşturarak kullanıcıdan giriş alıyoruz
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan a, b ve c sayılarını alıyoruz
            System.out.println("Lütfen a sayısını giriniz:");
            int a = scanner.nextInt();
            System.out.println("Lütfen b sayısını giriniz:");
            int b = scanner.nextInt();
            System.out.println("Lütfen c sayısını giriniz:");
            int c = scanner.nextInt();

            // Hesaplama yapılıyor: a + b * c - b
            int sonuc = a + b * c - b;

            // Sonucu ekrana yazdırıyoruz
            System.out.println("Sonuç: " + sonuc);
        }


}