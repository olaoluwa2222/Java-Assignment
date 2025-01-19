
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                    System.out.print("index "+ (i+1) +"," + (j+1)+ " = ");
                array[i][j] = scan.nextInt();
            }
        }
          for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println(); 
        }
    }
}