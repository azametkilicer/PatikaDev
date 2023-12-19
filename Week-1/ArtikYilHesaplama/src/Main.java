import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Kullanıcıdan sorgulamak istediği yılı istiyoruz
        System.out.print("Yıl Girin: ");
        int year = scanner.nextInt();

        // artık yıl için bir boolean oluşturuyoruz
        boolean artikYil = false;


        if (year % 4 == 0) {

            if (year % 100 == 0) {
                artikYil = year % 400 == 0;
            } else {
                artikYil = true;
            }
        }


        if (artikYil) {
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
