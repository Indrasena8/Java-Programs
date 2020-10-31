import java.util.Scanner;

public class Calculator {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a;
    int b;

    System.out.println("Enter the values of a and b: ");
    a = sc.nextInt();
    b = sc.nextInt();
    System.out.println((a+b)+ "\n" + (a-b)+ "\n" + (a*b));
  }
}