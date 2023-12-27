import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            array[i] = scanner.nextInt();
        }
        //https://medium.com/@mrtyvz.ma/selection-sort-java-276e7cdb26f6
        // Seçmeli Sıralama (Selection Sort) algoritması ile dizi sıralama
        for (int i = 0; i < n - 1; i++) {
            // En küçük elemanın indeksini bul
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Bulunan en küçük elemanı, sıralı bölümün sonuna yerleştir
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        // Sıralı diziyi yazdır
        System.out.print("Sıralama : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
