import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int toplam = 0;
        int geciciSayi = number;

        while (geciciSayi > 0) {
            toplam += geciciSayi % 10; // Son basamağı al ve toplama ekle
            geciciSayi /= 10; // Sayıyı 10'a bölerek bir sonraki basamağa geç
        }

        System.out.println(number + " sayısının basamaklarının toplamı: " + toplam);
    }
}
