import java.util.Scanner;

public class Main {

    // Toplama işlemi fonksiyonu Kullanıcı 0 girene kadar sayıları toplar.
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            // Eğer kullanıcı 0 girerse döngü sonlanır.
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    // Çıkarma işlemi fonksiyonu İlk sayıdan başlayarak girilen sayıları çıkarır.
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            // İlk sayıyı sonuca ekle, sonrasında çıkarma işlemi yap
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    // Çarpma işlemi fonksiyonu 1 veya 0 girilene kadar sayıları çarpar.
    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            // 1 girildiğinde döngüyü sonlandırır
            if (number == 1)
                break;

            // 0 girildiğinde sonucu sıfırlar ve döngüyü sonlandırır
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    // Bölme işlemi fonksiyonu Girilen sayıları sırayla böler
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            // Bölen sıfır olamaz, hata mesajı verir ve döngüyü sürdürür
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }

            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    // Üslü sayı hesaplama fonksiyonu Tabanı üssü kadar çarpar.
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        // Üssü kadar tabanı kendisiyle çarpar
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    // Faktöriyel hesaplama fonksiyonu 1'den n'e kadar olan sayıları çarpar.
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        // 1'den n'e kadar olan sayıları çarp.
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    // Mod alma fonksiyonu
    static void modulus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bölünen sayıyı giriniz: ");
        int dividend = scan.nextInt();
        System.out.print("Bölen sayıyı giriniz: ");
        int divisor = scan.nextInt();
        int result = dividend % divisor;
        System.out.println("Sonuç: " + result);
    }

    // Dikdörtgen alan ve çevre hesaplama fonksiyonu
    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        int shortEdge = scan.nextInt();
        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        int longEdge = scan.nextInt();
        // Alanı ve çevreyi hesaplar
        int area = shortEdge * longEdge;
        int perimeter = 2 * (shortEdge + longEdge);
        System.out.println("Alan: " + area);
        System.out.println("Çevre: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        // Kullanıcının seçim yapmasını sağlayan döngü
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            // Seçilen işleme göre ilgili fonksiyonu çağırıra
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    modulus();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
