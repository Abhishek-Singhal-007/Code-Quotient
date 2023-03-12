import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
  	public static int count(int n){
      int count = 0;
      while(n > 0){
        n = n / 10;
        count++;
      }
      return count;
    }
  	public static boolean isArm(int num){
      int copy = num;
      int count = count(num);
      int sum = 0;
      while(num > 0){
        int val = num % 10;
        num = num / 10;
        sum += Math.pow(val, count);
      }
      if(sum == copy)
        return true;
      return false;
    }
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(isArm(n))
        System.out.println("yes");
      else
        System.out.println("no");
    }
}
