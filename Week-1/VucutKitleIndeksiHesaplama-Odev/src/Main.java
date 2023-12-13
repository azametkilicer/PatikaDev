import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boyunu alıyoruz
        System.out.print("Lütfen boyunuzu giriniz(örn:1.85): ");
        float boy = scanner.nextFloat();

        // Kullanıcıdan kilosunu alyıyoruz
        System.out.print("Lütfen kilonuzu giriniz: ");
        float kilo = scanner.nextFloat();

        // verilen formül ile vki hesaplıyoruz
        float vki = kilo / (boy * boy);

        // VKI hesaplamısını kullanıcıya çıktı olarak veriyoruz
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
