import java.util.Scanner;

public class FactorialOfaNumber {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int fact = 1;
       for(int i = 1; i <= n; i++)
       {
        fact*=i;
       }
       System.out.println("Factorial is :" + fact);

    }
}
