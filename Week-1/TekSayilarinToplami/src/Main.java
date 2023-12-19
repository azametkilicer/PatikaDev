import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int n;

        do {
            System.out.println("Sayi Giriniz");
            n = scanner.nextInt();
            if(n % 2 == 1){
                total += n;
            }
        } while(n > 0);

        System.out.println("Toplam :" + total);

    }
}
