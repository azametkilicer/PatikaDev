import java.util.Scanner;

public class Main {

    // Recursive metot ile üslü sayı hesaplama
    static int power(int base, int exponent) {
        // Üs 0 ise sonuç 1'dir
        if (exponent == 0) {
            return 1;
        }
        // Üs 1'den büyükse tabanı çarparak recursive çağrı yap
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanıcıdan taban ve üs değerlerini al
        System.out.print("Taban değeri giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = scan.nextInt();

        // Sonucu hesapla ve yazdır
        int result = power(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
