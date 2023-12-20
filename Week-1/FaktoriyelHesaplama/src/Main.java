import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        int n = scanner.nextInt();

        System.out.print("r değerini giriniz: ");
        int r = scanner.nextInt();

        int nFaktoriyel = faktoriyel(n);
        int rFaktoriyel = faktoriyel(r);
        int nMinusRFaktoriyel = faktoriyel(n - r);

        int kombinasyon = nFaktoriyel / (rFaktoriyel * nMinusRFaktoriyel);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }

    // Faktöriyel hesaplayan metod
    public static int faktoriyel(int sayi) {
        int sonuc = 1;
        int i = 1;
        while (i <= sayi) {
            sonuc *= i;
            i++;
        }
        return sonuc;
    }
}
