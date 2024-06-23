 /*   0 
   0 1 
  0 1 0 
 0 1 0 1 
0 1 0 1 0 */

public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print((k % 2) + " ");
            }
            System.out.println();
        }
    }
}