import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
  	public static boolean isSquare(int num, int sq){
      if(num >= 0){
        return ((sq * sq) == num);
      }
      return(false);
    }
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int sqrt = (int)Math.sqrt(num);
      if(isSquare(num, sqrt))
        System.out.println("yes");
      else
        System.out.println("no");
    }
}
