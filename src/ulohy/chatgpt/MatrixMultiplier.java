package ulohy.chatgpt;

public class MatrixMultiplier {
    public static void main(String[] args) {
        int rows = 2;
        int columns = 5;
        int[][] matrix = new int[rows][columns];

        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = value;
                value *= 2;
            }
        }

        // Výpis matice
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
