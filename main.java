import java.util.*;

public class MatrixSort {

    public static void main(String[] args) {
        int[][] matrix = {{4, 2, 9}, {8, 1, 5}, {3, 7, 6}};

        // Sort in ascending row order
        long startTime = System.nanoTime();
        Arrays.sort(matrix, Comparator.comparingInt(a -> a[0]));
        long endTime = System.nanoTime();
        System.out.println("Sorted in ascending row order:");
        printMatrix(matrix);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");

        // Sort in descending row order
        startTime = System.nanoTime();
        Arrays.sort(matrix, Comparator.comparingInt((int[] a) -> a[0]).reversed());
        endTime = System.nanoTime();
        System.out.println("Sorted in descending row order:");
        printMatrix(matrix);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        
        // Sort in reverse row order
        startTime = System.nanoTime();
        Collections.reverse(Arrays.asList(matrix));
        endTime = System.nanoTime();
        System.out.println("Sorted in reverse row order:");
        printMatrix(matrix);
        System.out.println("Time taken: " + (endTime - startTime) + " nanoseconds");
        
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
