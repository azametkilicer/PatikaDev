import java.util.Scanner;

/**
 * Vücut Kitle İndeksi Hesaplama
 * VKI, bir kişinin kilosunun boyunun karesine bölünmesiyle hesaplanır.
 * Bu program, kullanıcının boy ve kilo değerlerini alarak  hesaplar.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boy ve kilo bilgilerini alıyoruz
        System.out.println("Boyunuzu giriniz:");
        double height = scanner.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        double weight = scanner.nextDouble();

        // VKI
        double vki = calVKI(height, weight);
        
        calVKI(weight / (height * height);

        // VKI sonucunu ekrana yazdırıyoruz
        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", vki);
    }

    /**
     * Verilen boy ve kilo değerlerine göre vki hesaplanır
     *
     * @param height Kullanıcının boyu 
     * @param weight Kullanıcının kilosu 
     * @return Hesaplanan VKI değeri.
     */
    public static double calVKI(double height, double weight) {
        return weight / (height * height);
    }
}
