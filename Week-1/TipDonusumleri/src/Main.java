import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tam sayı ve ondalıklı sayı alalım
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştürüyoruz
        double tamSayidanOndalikliya = tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştürüyoruz
        int ondalikliSayidanTama = (int) ondalikliSayi;

        // Sonuçlarrr
        System.out.println("Tam sayının ondalıklı sayıya dönüştürülmesi: " + tamSayidanOndalikliya);
        System.out.println("Ondalıklı sayının tam sayıya dönüştürülmesi: " + ondalikliSayidanTama);
    }
}
