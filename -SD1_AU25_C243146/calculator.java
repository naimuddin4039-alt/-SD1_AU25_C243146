
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
 @SuppressWarnings("resource")  
 Scanner sc = new Scanner(System.in);   
 int a = sc.nextInt();
 //int b = sc.nextInt();
 char c = sc.next().charAt(0);
  int b = sc.nextInt();
  if(c == '+')
  {
    System.out.println("Addition: " + (a+b));
  }
  else if(c == '-')
  {
    System.out.println("Subtraction: " + (a-b));
  }
  else if(c == '*')
  {
    System.out.println("Multiplication: " + (a*b));
  }
  else if(c == '/')
  {
    System.out.println("Division: " + (a/b));
  }
}
}
