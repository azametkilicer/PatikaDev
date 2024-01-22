import java.util.Random;

public class MineSweeper {
    private String[][] mineMap;
    private String[][] displayMap;
    private int rows;
    private int cols;
    private boolean gameOver;
    private int safeSpaces;


    public void showMines() {
        System.out.println("Mayınların Konumu:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineMap[i][j].equals("*")) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println("===========================");
    }

    public MineSweeper(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mineMap = new String[rows][cols];
        displayMap = new String[rows][cols];
        this.gameOver = false;
        this.safeSpaces = rows * cols;
        initializeMaps();
        placeMines();

        // Toplam hücre sayısından mayın sayısını çıkar
        //Oyunun kazanmak için kontrol
        this.safeSpaces = (rows * cols) - (rows * cols) / 4;

    }


    private void initializeMaps() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mineMap[i][j] = "-";
                displayMap[i][j] = "-";
            }
        }
    }



    private void placeMines() {
        int mineCount = (rows * cols) / 4;
        Random random = new Random();
        int placedMines = 0;

        while (placedMines < mineCount) {
            int randomRow = random.nextInt(rows);
            int randomCol = random.nextInt(cols);

            if (!mineMap[randomRow][randomCol].equals("*")) {
                mineMap[randomRow][randomCol] = "*";
                placedMines++;
                safeSpaces--;
            }
        }
    }


    public void displayBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(displayMap[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void checkCell(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols || displayMap[row][col].equals("0") || displayMap[row][col].equals("*")) {
            return;
        }

        if (mineMap[row][col].equals("*")) {
            gameOver = true;
            System.out.println("Mayına bastınız! Oyun Bitti.");
            return;
        }

        int mineCount = countMines(row, col);
        displayMap[row][col] = String.valueOf(mineCount);
        safeSpaces--;

        if (mineCount == 0) {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) continue;
                    checkCell(row + i, col + j);
                }
            }
        }
    }


    private int countMines(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;
                if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols) continue;
                if (mineMap[newRow][newCol].equals("*")) {
                    count++;
                }
            }
        }
        return count;
    }


    public boolean checkWin() {
        return safeSpaces == 0;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    // col,row kontrolü (unutmuşuz Xd)
    public boolean isValidCoordinate(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public boolean isCellOpen(int row, int col) {
        return !displayMap[row][col].equals("-");
    }
}
