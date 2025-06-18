import java.util.Random;
public class MatrixOperations {
    public static int[][] createMatrix(int rows, int cols) {
        Random r = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = r.nextInt(10);
        return mat;
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] trans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                trans[j][i] = matrix[i][j];
        return trans;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = {
            {(double)m[1][1] / det, (double)-m[0][1] / det},
            {(double)-m[1][0] / det, (double)m[0][0] / det}
        };
        return inv;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] mat = createMatrix(2, 2);
        System.out.println("Original:");
        printMatrix(mat);
        System.out.println("Transpose:");
        printMatrix(transpose(mat));
        System.out.println("Determinant: " + determinant2x2(mat));
        double[][] inv = inverse2x2(mat);
        if (inv != null) {
            System.out.println("Inverse:");
            for (double[] row : inv) {
                for (double v : row) System.out.print(v + " ");
                System.out.println();
            }
        } else {
            System.out.println("No inverse (det=0)");
        }
    }
}
