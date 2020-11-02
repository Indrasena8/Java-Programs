import java.util.Scanner;

public class ReverseOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y=0;

    while(X != 0) {
      Y = (Y * 10) + (X % 10);
      X /= 10;
    }
    System.out.println(Y);
  }
}
