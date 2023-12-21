import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int k = 1;

        while(k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0){
                ebob = k;
            }
            k++;
        }

        int ekok = (n1 * n2) / ebob;

        System.out.println("EBOB = " + ebob);
        System.out.println("EKOK = " + ekok);
    }
}
