import java.util.Scanner;

public class TwoDArray {
    
    public static void main(String[] args) {
        int nums[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        // Loop through each row using enhanced for-loop
        for (int[] row : nums) {
            // Loop through each column in the current row using enhanced for-loop
            for (int j = 0; j < row.length; j++) {
                row[j] = scanner.nextInt();
            }
        }
        
        // Print the 2D array for verification (optional)
        System.out.println("Entered 2D array:");
        for (int[] row : nums) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    } 
}
