import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi km cinsinden giriniz: ");
        double mesafe = scanner.nextDouble();

        // Sabit değerler
        double KmUcret = 2.20; // KM başına ücret
        double minUcret = 20.0; // Minimum ödenecek tutar
        double aclUcret = 10.0; // Taksimetre açılış ücreti

        // Toplam ücretin hesaplanması
        double totalUcret = aclUcret + (mesafe * KmUcret);


        // Eğer hesaplanan ücret minimum tutardan düşükse, minimum ücret alınır
        totalUcret = totalUcret < minUcret ? minUcret : totalUcret;

        System.out.println("Toplam Taksimetre Ücreti: " + totalUcret + " TL");
    }
}
