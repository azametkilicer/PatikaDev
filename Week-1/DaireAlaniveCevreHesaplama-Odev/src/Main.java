import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        // Dairenin yarıçapını kullanıcıdan alıyoruz
        System.out.print("Dairenin yarıçapını giriniz: ");
        double yaricap = scanner.nextDouble();

        // Dairenin alanını ve çevresini hesaplıyoruz
        double alan = PI * yaricap * yaricap;
        double cevre = 2 * PI * yaricap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);


        System.out.print("Merkez açısının ölçüsünü giriniz (derece): ");
        double angle = scanner.nextDouble();

        // Formülümüzle hesaplayarak çıktıyı veriyoruz
        double dilimAlan = (PI * yaricap * yaricap * angle) / 360;
        System.out.println("Daire diliminin Alanı: " + dilimAlan);
    }
}
