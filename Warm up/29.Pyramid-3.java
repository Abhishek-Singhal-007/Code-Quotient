import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i = 1; i <= n; i++){
        for(int j = n; j > i; j--){
          System.out.print("*");
        }
        for(int j = 1; j <= i; j++){
          System.out.print(j);
        }
        System.out.println();
      }
    }
}
