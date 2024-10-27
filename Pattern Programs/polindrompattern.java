public class polindrompattern {
    public static void main(String[] args) {
        int n = 5;
        // first half
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            // number of first half
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            // second half numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
