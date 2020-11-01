import java.util.Scanner;

public class FormatSpecifiers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    float b;
    char c;

    a = sc.nextInt();
    b = sc.nextFloat();
    c = sc.next().charAt(0);

    //System.out.printf("a + "$" + b + "$" + c");
    System.out.printf("%d$%.2f$%c", a, b, c);
  }
}