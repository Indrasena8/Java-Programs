import java.util.Scanner;

public class RotationOfArray {

  static void reverse(int arr[], int start, int end) {
    while(start<end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // n = number of array elements
    int n = sc.nextInt();
    // k = number of positions by which array should be rotated
    int k = sc.nextInt();
    int[] arr = new int[n];
    for(int j=0; j<n; j++)
      arr[j] = sc.nextInt();
      
    k %= n;
    reverse(arr, 0, arr.length-1);
    reverse(arr, 0, k-1);
    reverse(arr, k, arr.length-1);

    for(int  j=0; j<n; j++)
      System.out.print(arr[j] + " ");
  }
}