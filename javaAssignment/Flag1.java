public class Flag1 {
    public static void main(String[] args) {
        System.out.println("FOR THE SINGLE LOOP");
        for (int i = 1; i <= 3; i++) {
            System.out.println("* * * * = = = = = = =");

        }
        for (int i = 1; i <= 3; i++) {
            System.out.println("= = = = = = = = = = =");
        }

        // Code for nested loop to print the Nigerian flag pattern
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("FOR THE NEXTED LOOP");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 11; j++) {
                if (j < 4) {
                    System.out.print("* ");// Print '*' for the first 4 columns
                } else if (j < 11) {
                    System.out.print("= ");// Print '=' for the next 4 columns

                } 

            }
                System.out.println();
        }
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 11; j++) {
                System.out.print("= ");

            }

            System.out.println();
        }

    }
}