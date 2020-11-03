import java.util.Scanner;

public class V_Pattern {
  public static void main(String[] args) {
    String str = "  ";

    for(int i=1; i<=5; i++) {
      for(int j=1; j<=i; j++) {
        System.out.print(j);
      }

      for(int l=1; l<=(5-i); l++)
        System.out.print("  ");

      for(int k=i; k>=1; k--)
        System.out.print(k);

      System.out.println();
    }
  }
}
