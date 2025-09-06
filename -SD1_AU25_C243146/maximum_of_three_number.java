
import java.util.Scanner;

public class maximum_of_three_number {
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a > b && a > c)
        {
            System.out.println("Maximum number is: " +a);
        }
        else if(b > a && b > c)
        {
             System.out.println("Maximum number is: " +b);
        }
        else{
             System.out.println("Maximum number is: " +c);
        }
        input.close();
    }
    
}
