import java.util.Scanner;

public class LowerUpperTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //M = rows, N = columns
    int M = sc.nextInt();
    int N = sc.nextInt();
    int[][] mat = new int[M][N];
    for(int i=0; i<M; i++)
      for(int j=0; j<N; j++)
        mat[i][j] = sc.nextInt();
      
    for(int i=0; i<M; i++) {
      for(int j=0; j<N; j++) {
        if(i<j)
          System.out.print("0 ");
        else
          System.out.print(mat[i][j]+ " ");
      }
      System.out.println();
    }

    for(int i=0; i<M; i++) {
      for(int j=0; j<N; j++) {
        if(i>j)
          System.out.print("0 ");
        else
          System.out.print(mat[i][j]+ " ");
      }
      System.out.println();
    }
  }
}
