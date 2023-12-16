import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Kullanıcı Adı veya Şifreniz yanlış!");

            // Kullanıcıya şifresini sıfırlayıp sıfırlamayacağını soralım
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = inp.nextLine();

            if (cevap.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = inp.nextLine();

                // Yeni şifrenin eski şifre ile aynı olup olmadığını kontrol ediyoruz
                if (newPassword.equals("java101")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }
    }
}
