import java.util.Scanner;

public class EvenAndOddOfArray {
    public static void main(String[] args) {
          @SuppressWarnings("resource")
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
     int[] a = new int[n];
      int sum1 = 0;
      int sum2 = 0;
       for(int i = 0; i < n; i++)
       {
           a[i] = input.nextInt();
       }
         for(int i = 0; i < n; i++)
       {
           if(a[i] % 2 == 0)
           {
            sum1++;
           }
           else if(a[i] % 2 != 0)
           {
            sum2++;
           }
       }
       System.out.println("Even numbers: "+ sum1);
       System.out.println("Odd numbers: "+ sum2);
    }
}
