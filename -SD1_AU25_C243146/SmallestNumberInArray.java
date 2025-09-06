import java.util.Scanner;

public class SmallestNumberInArray {
    public static void main(String[] args) {
          @SuppressWarnings("resource")
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
     int[] a = new int[n];
       for(int i = 0; i < n; i++)
       {
           a[i] = input.nextInt();
       }
       int small = a[0];
       for (int i = 1; i < n; i++) {
           if(a[i] < small)
           {
            small = a[i];
           }
       }
       System.out.println("Smallest number: "+ small);
    }
}
