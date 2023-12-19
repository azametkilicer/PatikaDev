import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan Doğum yılını istiyoruz
        System.out.println("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        // Aldığımız değeri kalanlı bölüyoruz
        int zodyak = dogumYili % 12;

        // zodyak burcumuzu atayacağımız değişkenimizi tanımlıyoruz
        String burc = "";

        // zodyak burcumuzu bulmak için bölünen değeri case lerimizde arıyoruz
        switch (zodyak) {
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = "Köpek";
                break;
            case 3:
                burc = "Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                burc = "Senin Burcun yok ama üzülme maymun'da olabilirdin :)";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}

