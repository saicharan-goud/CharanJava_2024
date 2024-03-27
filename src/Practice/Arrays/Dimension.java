package Practice.Arrays;

public class Dimension {
    public static void main(String[] args) {
        // Define the size of the multiplication table
        int rows = 10;
        int cols = 10;

        // Create a 2D array to store the multiplication table
        int[][] multiplicationTable = new int[rows][cols];

        // Initialize the multiplication table
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]); // Print with formatting
            }
            System.out.println(); // Move to the next row
        }
    }
}

