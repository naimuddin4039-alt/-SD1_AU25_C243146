import java.util.Scanner;

public class printOneToN {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       for(int i = 1; i <= n; i++)
       {
        System.err.println(i);
       }
        
    }
    
}
