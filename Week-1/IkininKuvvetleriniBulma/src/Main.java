import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sınır Sayısını Giriniz : ");
        n = scanner.nextInt();

        for (int i = 1; i <= n ; i*=2) {
            System.out.println(i);

        }
    }
}
