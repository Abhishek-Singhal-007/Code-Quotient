import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int year = sc.nextInt();
      boolean flag = false;
      if((year % 400) == 0)
        flag = true;
      else if((year % 100) == 0)
        flag = false;
      else if((year % 4) == 0)
        flag = true;
      else
        flag = false;
      if(flag)
        System.out.println("Leap Year");
      else
        System.out.println("Not a Leap Year");
    }
}
