import java.util.Random;
public class MatrixCalculator {
    public static int[][] createMatrix(int rows, int cols) {
        Random r = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = r.nextInt(10);
        return matrix;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] + b[i][j];
        return result;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                result[i][j] = a[i][j] - b[i][j];
        return result;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = createMatrix(2, 2);
        int[][] mat2 = createMatrix(2, 2);
        int[][] product = multiply(mat1, mat2);

        System.out.println("Matrix A:");
        printMatrix(mat1);
        System.out.println("Matrix B:");
        printMatrix(mat2);
        System.out.println("Sum:");
        printMatrix(add(mat1, mat2));
        System.out.println("Difference:");
        printMatrix(subtract(mat1, mat2));
        System.out.println("Product:");
        printMatrix(product);
    }
}
