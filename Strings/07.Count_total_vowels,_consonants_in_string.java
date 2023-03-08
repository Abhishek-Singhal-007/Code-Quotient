import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int vovel = 0;
      int con = 0;
      for(int i = 0; i < str.length(); i++){
        char c = str.charAt(i);
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
          vovel++;
        else
          con++;
      }
      System.out.println(vovel + " " + con);
    }
}
