import java.util.Arrays;

public class AdvancedMatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        return matrix;
    }

    public static void displayIntMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void displayDoubleMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Inverse does not exist (determinant is zero).");
            return;
        }
        for (double[] row : matrix) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.printf("%.2f%s", row[j], j == row.length - 1 ? "" : ", ");
            }
            System.out.println("]");
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    
    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        int det = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
                  m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
                  m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        return det;
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;

        double invDet = 1.0 / det;
        double[][] inverse = new double[2][2];

        inverse[0][0] = m[1][1] * invDet;
        inverse[0][1] = -m[0][1] * invDet;
        inverse[1][0] = -m[1][0] * invDet;
        inverse[1][1] = m[0][0] * invDet;
        
        return inverse;
    }
    
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) return null;

        double invDet = 1.0 / det;
        double[][] inverse = new double[3][3];
        
        inverse[0][0] = (m[1][1] * m[2][2] - m[2][1] * m[1][2]) * invDet;
        inverse[0][1] = (m[0][2] * m[2][1] - m[0][1] * m[2][2]) * invDet;
        inverse[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) * invDet;
        inverse[1][0] = (m[1][2] * m[2][0] - m[1][0] * m[2][2]) * invDet;
        inverse[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) * invDet;
        inverse[1][2] = (m[1][0] * m[0][2] - m[0][0] * m[1][2]) * invDet;
        inverse[2][0] = (m[1][0] * m[2][1] - m[2][0] * m[1][1]) * invDet;
        inverse[2][1] = (m[2][0] * m[0][1] - m[0][0] * m[2][1]) * invDet;
        inverse[2][2] = (m[0][0] * m[1][1] - m[1][0] * m[0][1]) * invDet;
        
        return inverse;
    }

    public static void main(String[] args) {
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("Original 2x2 Matrix:");
        displayIntMatrix(matrix2x2);
        System.out.println("\nTranspose:");
        displayIntMatrix(transpose(matrix2x2));
        System.out.println("\nDeterminant: " + determinant2x2(matrix2x2));
        System.out.println("\nInverse:");
        displayDoubleMatrix(inverse2x2(matrix2x2));
        
        System.out.println("\n-------------------------------------\n");
        
        int[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("Original 3x3 Matrix:");
        displayIntMatrix(matrix3x3);
        System.out.println("\nTranspose:");
        displayIntMatrix(transpose(matrix3x3));
        System.out.println("\nDeterminant: " + determinant3x3(matrix3x3));
        System.out.println("\nInverse:");
        displayDoubleMatrix(inverse3x3(matrix3x3));
    }
}