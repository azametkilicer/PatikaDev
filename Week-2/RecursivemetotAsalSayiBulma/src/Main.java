import java.util.Scanner;

public class Main {

    // Recursive metot ile asal sayı kontrolü
    static boolean isPrime(int number, int i) {
        // 2'den küçük sayılar asal değildir
        if (number < 2) {
            return false;
        }
        // i sayısı number'a eşit veya büyükse true döndür
        if (i >= number) {
            return true;
        }
        // Eğer number, i'ye tam bölünüyorsa false döndür
        if (number % i == 0) {
            return false;
        }
        // Diğer durumda, bir sonraki sayı ile kontrol et
        return isPrime(number, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanıcıdan bir sayı al
        System.out.print("Sayı Giriniz: ");
        int number = scan.nextInt();

        // Asallık kontrolünü yap ve sonucu yazdır
        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }
}
