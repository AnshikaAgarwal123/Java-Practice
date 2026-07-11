public class SimpleMatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int totalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                totalSum += matrix[i][j]; // Accumulate the sum
            }
        }

        System.out.println("The total sum of all elements in the matrix is: " + totalSum);
    }
}