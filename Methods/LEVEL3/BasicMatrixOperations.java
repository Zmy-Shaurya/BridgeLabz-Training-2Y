import java.util.Arrays;

public class BasicMatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); // Random int from 0-9
            }
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("Invalid matrix (operation not possible).");
            return;
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] addMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return null;
        }
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    public static int[][] subtractMatrices(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) {
            return null;
        }
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
    
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        if (a[0].length != b.length) {
            return null;
        }
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrixA = createRandomMatrix(2, 3);
        int[][] matrixB = createRandomMatrix(3, 2);
        int[][] matrixC = createRandomMatrix(2, 3);

        System.out.println("Matrix A (2x3):");
        displayMatrix(matrixA);
        
        System.out.println("\nMatrix B (3x2):");
        displayMatrix(matrixB);

        System.out.println("\nMatrix C (2x3):");
        displayMatrix(matrixC);

        System.out.println("\nResult of A + C:");
        displayMatrix(addMatrices(matrixA, matrixC));
        
        System.out.println("\nResult of A - C:");
        displayMatrix(subtractMatrices(matrixA, matrixC));
        
        System.out.println("\nResult of A * B:");
        displayMatrix(multiplyMatrices(matrixA, matrixB));
    }
}