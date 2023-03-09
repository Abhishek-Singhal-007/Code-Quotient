import java.util.Scanner;
// Other imports go here, Do NOT change the class name
class Main
{
  
  public static void rotate(int[][] mat){
    int n = mat.length;
    for(int i = 0; i < n; i++){
      for(int j = i; j < n; j++){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
      }
    }
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n/2; j++){
        int temp = mat[i][j];
        mat[i][j] = mat[i][n - j -1];
        mat[i][n - j - 1] = temp;
      }
    }
  }
  
  public static void main(String[] args)
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 0; i < t; i++){
      int n = sc.nextInt();
      int[][] mat = new int[n][n];
      for(int k = 0; k < n; k++)
        for(int j = 0; j < n; j++)
          mat[k][j] = sc.nextInt();
      rotate(mat);
      for(int []row : mat){
        for(int num : row)
          System.out.print(num + " ");
        System.out.println();
      }
      System.out.println();
    }
  }
}
