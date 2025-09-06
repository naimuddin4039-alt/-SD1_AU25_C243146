import java.util.Scanner;

public class FindElementOfArray {
    public static void main(String[] args) {
          @SuppressWarnings("resource")
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
     int[] a = new int[n];
       for(int i = 0; i < n; i++)
       {
           a[i] = input.nextInt();
       }
       int x = input.nextInt();
       int f = 0;
        for(int i = 0; i < n; i++)
       {
           if(a[i] == x)
           {
            f = 1;
            break;
           }
       }
       if(f == 1)
       {
       System.out.println("Found");
       }
       else{
        System.out.println("Not Found");
       }
    }
}
