import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      char val = sc.next().charAt(0);
      int val1 = val;
      if(val1 > 96 && val1 < 123)
        System.out.println("lower");
      else if(val1 > 64 && val1 < 91)
        System.out.println("UPPER");
    }
}
