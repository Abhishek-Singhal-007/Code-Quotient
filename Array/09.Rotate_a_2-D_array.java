import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class Main
{
  
  public static void rotate(int[][] arr, int n){
    int[][] copy = new int[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        copy[j][n-i-1] = arr[i][j];
      }
    }
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        arr[i][j] = copy[i][j];
      }
    }
  }
  
  public static void main(String[] args)
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t > 0){
      int n = sc.nextInt();
      int[][] arr = new int[n][n];
      for(int i = 0; i < n; i++){
      	for(int j = 0; j < n; j++){
        	arr[i][j] = sc.nextInt();
      	}
      }
      rotate(arr, n);
      for(int i = 0; i < n; i++){
      	for(int j = 0; j < n; j++){
          if(j == n-1){
            System.out.print(arr[i][j]);
          }
          else{
            System.out.print(arr[i][j] + " ");
          }
        }
        System.out.println();
      }
      t--;
      System.out.println();
    }
  }
}
