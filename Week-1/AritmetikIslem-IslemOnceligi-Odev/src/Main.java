import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            // Scanner nesnesi oluşturarak kullanıcıdan giriş alıyoruz
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan a, b ve c sayılarını alıyoruz
            System.out.println(" 1. sayıyı giriniz:");
            int a = scanner.nextInt();
            System.out.println("2. sayıyı giriniz:");
            int b = scanner.nextInt();
            System.out.println("3. sayıyı giriniz:");
            int c = scanner.nextInt();

            // Hesaplama yapılıyor: a + b * c - b
            int sonuc = a + b * c - b;

            // Sonucu ekrana yazdırıyoruz
            System.out.println("Sonuç: " + sonuc);
        }


}