import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0;
      for(int i = 1; i < n; i++)
        if(n % i == 0)
          sum += i;
      if(sum == n)
        System.out.println("yes");
      else
        System.out.println("no");
    }
}
