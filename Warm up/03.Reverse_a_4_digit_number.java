import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int pal = 0;
      int i = 4;
      while(i > 0){
        pal *= 10;
        pal += num % 10;
        num /= 10;
        i--;
      }
      System.out.println(pal);
    }
}
