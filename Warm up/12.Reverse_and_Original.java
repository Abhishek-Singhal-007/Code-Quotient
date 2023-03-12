import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int copy = num;
      int pal = 0;
      int i = 4;
      while(i > 0){
        pal *= 10;
        pal += num % 10;
        num = num / 10;
        i--;
      }
      if(pal == copy)
        System.out.println("Equal");
      else
        System.out.println("Not Equal");
    }
}
