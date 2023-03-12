import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int ans = 0;
      char symbol = sc.next().charAt(0);
      if(symbol == '+')
        ans = a + b;
      else if(symbol == '-')
        ans = a - b;
      else if(symbol == '%')
        ans = a % b;
      else if(symbol == '/')
        ans = a / b;
      else if(symbol == '*')
        ans = a * b;
      else
        System.out.println("Enter valid arithmetic operator");
      if(ans != 0)
      	System.out.println(ans);
    }
}
