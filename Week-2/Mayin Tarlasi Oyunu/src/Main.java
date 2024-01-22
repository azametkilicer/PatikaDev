import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan oyun alanının boyutlarını al
        System.out.print("Satır sayısını girin: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun sayısını girin: ");
        int cols = scanner.nextInt();

        // MineSweeper nesnesi oluştur
        MineSweeper mineSweeper = new MineSweeper(rows, cols);

        mineSweeper.showMines();

        // Oyunun ana döngüsü
        while (!mineSweeper.isGameOver()) {
            mineSweeper.displayBoard();

            // Kullanıcıdan koordinatları al
            int row, col;
            boolean validInput;
            do {
                System.out.print("Bir satır seçin (1, 2, ...): ");
                row = scanner.nextInt() - 1;
                System.out.print("Bir sütun seçin (1, 2, ...): ");
                col = scanner.nextInt() - 1;

                validInput = mineSweeper.isValidCoordinate(row, col) && !mineSweeper.isCellOpen(row, col);
                if (!validInput) {
                    System.out.println("Geçersiz ya da zaten açılmış bir hücre. Lütfen başka bir hücre seçin.");
                }
            } while (!validInput);

            mineSweeper.checkCell(row, col);

            if (mineSweeper.checkWin()) {
                System.out.println("Tebrikler, tüm güvenli alanları açtınız!");
                mineSweeper.displayBoard();
                break;
            }
        }

        // Mayınların yerleştirildiği yerleri göster

    }
}

// MineSweeper sınıfı burada olacak
