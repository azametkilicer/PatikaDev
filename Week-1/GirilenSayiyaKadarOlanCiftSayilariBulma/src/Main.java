import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //Kullanıcıdan sayı alıyoruz
        System.out.print("Bir sayı giriniz: ");
        int limit = scanner.nextInt();


        int sum = 0;
        int count = 0;

        //while döngümüzü oluşturuyoruz ve koşulumuzu döngünün içine alıyoruz
        int i = 1;
        while (i <= limit) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
            i++;
        }

        // koşumuzdaki topladığımız sum ve count değerlerinini birbirine böldüğümüzde ortalamyı buluyoruz sonucuda average değerine atıyoruz
        double average;
        if (count > 0) {
            average = (double) sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı.");
        }
    }
}
