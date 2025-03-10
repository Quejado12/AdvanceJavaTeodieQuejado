public class Teodie {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int sum1 = findMatrixSum(matrix1);
        System.out.println("Sum of all elements in matrix1: " + sum1);

        int sum2 = findMatrixSum(matrix2);
        System.out.println("Sum of all elements in matrix2: " + sum2);

        int[][] additionResult = addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition Result:");
        printMatrix(additionResult);

        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matrix Multiplication Result:");
        printMatrix(multiplicationResult);

        boolean isSymmetric = checkSymmetry(matrix1);
        System.out.println("Matrix1 is symmetric: " + isSymmetric);

        int[][] transpose = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix1:");
        printMatrix(transpose);
    }

    public static int findMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                sum += val;
            }
        }
        return sum;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int common = matrix2.length;

        // Check for matrix multiplication compatibility
        if (matrix1[0].length != common) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }

        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static boolean checkSymmetry(int[][] matrix) {
        int rows = matrix.length;
        // Check if the matrix is square
        if (rows != matrix[0].length) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
