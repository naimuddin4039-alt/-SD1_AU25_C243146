import java.util.*;

public class AvarageOfArray {
    public static void main(String[] args) {
          @SuppressWarnings("resource")
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
     int[] a = new int[n];
      int sum = 0;
       for(int i = 0; i < n; i++)
       {
           a[i] = input.nextInt();
       }

 for(int i = 0; i < n; i++)
       {
           sum+=a[i];
       }
        double avg = (double) sum / n;
    System.out.println("Average "+ avg);
    input.close();
    }
}
