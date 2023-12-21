import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE; // En küçük değeri atayarak başlayın
        int min = Integer.MAX_VALUE; // En büyük değeri atayarak başlayın

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int number = input.nextInt();

            if (number > max) {
                max = number; // En büyük sayıyı güncelle
            }

            if (number < min) {
                min = number; // En küçük sayıyı güncelle
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
