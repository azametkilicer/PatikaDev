import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // kullanıcıdan doğduğu gün ve ayı istiyoruz
        System.out.println("Doğum ayı girin (1-12 aralığında): ");
        int ay = scanner.nextInt();
        System.out.println("Doğum günü girin (1-31 aralığında): ");
        int gun = scanner.nextInt();

        //burc değişkenimizi tanımlıyoruz
        String burc ="";

        // tarih ve gün aralığına göre burç değişkenine değeri tanımlıyoruz.
        switch (ay) {
            case 1: // Ocak
                burc = (gun <= 21) ? "Oğlak" : "Kova";
                break;
            case 2: // Şubat
                burc = (gun <= 19) ? "Kova" : "Balık";
                break;
            case 3: // Mart
                burc = (gun <= 20) ? "Balık" : "Koç";
                break;
            case 4: // Nisan
                burc = (gun <= 20) ? "Koç" : "Boğa";
                break;
            case 5: // Mayıs
                burc = (gun <= 21) ? "Boğa" : "İkizler";
                break;
            case 6: // Haziran
                burc = (gun <= 22) ? "İkizler" : "Yengeç";
                break;
            case 7: // Temmuz
                burc = (gun <= 22) ? "Yengeç" : "Aslan";
                break;
            case 8: // Ağustos
                burc = (gun <= 22) ? "Aslan" : "Başak";
                break;
            case 9: // Eylül
                burc = (gun <= 22) ? "Başak" : "Terazi";
                break;
            case 10: // Ekim
                burc = (gun <= 22) ? "Terazi" : "Akrep";
                break;
            case 11: // Kasım
                burc = (gun <= 21) ? "Akrep" : "Yay";
                break;
            case 12: // Aralık
                burc = (gun <= 21) ? "Yay" : "Oğlak";
                break;
            default:
                burc = "Geçersiz ay";
        }

        //tanıımladığımız burç değişkenini kullanıcıya yazdırıyoruz
        System.out.println("Burcunuz: " + burc);

    }
}
