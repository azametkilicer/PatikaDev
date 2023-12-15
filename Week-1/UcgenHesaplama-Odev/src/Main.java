import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dik kenar uzunluklarını alarak hipotenüsü hesaplıyoruz
        System.out.print("Birinci dik kenar uzunluğunu giriniz: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci dik kenar uzunluğunu giriniz: ");
        double b = scanner.nextDouble();

        double hipotenus = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs: " + hipotenus);

        // Kullanıcıdan üçgenin kenar uzunluklarını alarak alanını hesaplıyoruz
        System.out.print("Üçgenin birinci kenar uzunluğunu giriniz: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu giriniz: ");
        double kenar3 = scanner.nextDouble();

        double u = (kenar1 + kenar2 + kenar3) / 2;
        double alanKaresi = u * (u - kenar1) * (u - kenar2) * (u - kenar3);
        double alan = Math.sqrt(alanKaresi);

        System.out.println("Üçgenin alanı: " + alan);
    }
}
