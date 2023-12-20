import java.util.Scanner;

public class denemechar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        String numberStr = String.valueOf(number);
        int toplam = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            // Her bir basamağı char olarak al
            char basamakChar = numberStr.charAt(i);

            // Char'ı int'e dönüştür ve toplama ekle
            toplam += Character.getNumericValue(basamakChar);
        }

        System.out.println(number + " sayısının basamaklarının toplamı: " + toplam);
    }
}
