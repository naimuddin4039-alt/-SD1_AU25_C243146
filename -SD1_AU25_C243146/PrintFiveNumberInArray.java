import java.util.Scanner;

public class PrintFiveNumberInArray {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
     int[] a = new int[n];
       for(int i = 0; i < 5; i++)
       {
           a[i] = input.nextInt();
       }
       for (int i = 0; i < n; i++) {
           System.out.print(" " + a[i]);
       }
    }
}
