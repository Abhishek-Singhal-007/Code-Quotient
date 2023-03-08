import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int res = 0;
      res = (num *(num + 1)) / 2;
      System.out.println(res);
    }
}
