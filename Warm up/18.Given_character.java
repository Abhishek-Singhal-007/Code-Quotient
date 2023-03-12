import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      char val = sc.next().charAt(0);
      if(val=='a' || val=='e' || val=='i' || val=='o' || val=='u' || val=='A' || val=='E' || val=='I' || val=='O' || val=='U')
        System.out.println("vowel");
      else
        System.out.println("consonant");
    }
}
