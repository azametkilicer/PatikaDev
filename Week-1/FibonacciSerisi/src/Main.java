import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int count = scanner.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print(firstNumber + " " + secondNumber);

        for (int i = 2; i < count; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(" " + nextNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}
