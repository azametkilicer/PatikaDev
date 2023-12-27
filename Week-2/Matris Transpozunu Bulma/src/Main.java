public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int row = matrix.length;
        int column = matrix[0].length;

        // Transpoze matrisini oluştur
        int[][] transpose = new int[column][row];

        // Matrisin transpozesini hesapla
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Transpoze matrisi yazdır
        System.out.println("Matris : ");
        printMatrix(matrix);

        System.out.println("Transpoze : ");
        printMatrix(transpose);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + "    ");
            }
            System.out.println();
        }
    }
}
