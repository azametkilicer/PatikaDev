import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);
        System.out.print("1. sayıyı girin: "); // Kullanıcıdan 1. sayıyı alıyoruz


        int ilkSayi = okuyucu.nextInt();

        System.out.print("2. sayıyı girin: "); // Kullanıcıdan 2. sayıyı alıyoruz


        int ikinciSayi = okuyucu.nextInt();

        // Kullanıcıdan yapacağı işlem için bir operatör girmesini istiyoruz
        System.out.print("Yapacağınız işlemi girin\n" +
                " + Toplama\n " +
                "- Çıkarma\n " +
                "* Çarma\n " +
                "/ bölme\n");

        //Kullanıcıdan istediğimiz operatörü char olarak alıyoruz
        char operator = okuyucu.next().charAt(0);

        int sonuc;

        switch(operator) {
            case '+':
                sonuc = ilkSayi + ikinciSayi;
                break;
            case '-':
                sonuc = ilkSayi - ikinciSayi;
                break;
            case '*':
                sonuc = ilkSayi * ikinciSayi;
                break;
            case '/':
                if (ikinciSayi != 0)
                    sonuc = ilkSayi / ikinciSayi; // Bölme işlemi "bölen sıfır değilse"
                else {
                    System.out.println("Sıfıra bölme yapılamaz."); // Bölen sıfır ise hata mesajı
                    return;
                }
                break;
            default:
                System.out.println("Hata! Geçersiz operatör."); // Yanlış operatör girilmesi durumunda hata mesajı
                return;
        }

        // Sadece sonucu yazdırmak için
        //System.out.println("Sonuç: " + sonuc);


        // Sonucu formatlayarak ekrana yazdırmak için ("printF" olarak yazmamızın sebebi formatlayarak çıktı vermek)
        System.out.printf("%d %c %d = %d", ilkSayi, operator, ikinciSayi, sonuc);

    }
}
