import java.util.Scanner;

public class Main {

    static void printPattern(int n) {
        // Sayıyı yazdır
        System.out.print(n + " ");

        // Eğer sayı 0 veya negatifse, artırma işlemine geç
        if (n <= 0) {
            return;
        }

        // Sayıdan 5 çıkar ve recursive çağrı yap
        printPattern(n - 5);

        // Geri dönüş aşamasında sayıyı tekrar yazdır
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanıcıdan bir sayı al
        System.out.print("N Sayısını Giriniz: ");
        int n = scan.nextInt();

        // Recursive metodu çağır
        printPattern(n);
    }
}
