import java.util.Scanner;
public class Array1d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("INDEX "+ (i+1) + " = ");
            array[i] = scan.nextInt();
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}