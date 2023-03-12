import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      float amount = sc.nextFloat();
      double dis = 0.0;
      if(amount <= 1000)
        dis = 0;
      else if(amount >= 1001 && amount <= 5000)
        dis = amount * 0.05;
      else if(amount >= 5001 && amount <= 10000)
        dis = amount * 0.1;
      else if(amount > 10000)
        dis = amount * 0.15;
      if(amount > 30000)
        dis += amount * 0.02;
      amount = (float)(amount - dis);
      System.out.printf("%.2f",amount);
    }
}
