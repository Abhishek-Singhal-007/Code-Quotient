import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      String val = sc.nextLine();
      String[] va = val.split(" ");
      double res = 0;
      double []arr = new double[va.length];
      for(int i = 0; i < va.length; i = i+2)
        arr[i] = Double.valueOf(va[i]);
      switch(va[1]){
        case "+":
          res = arr[0] + arr[2];
          break;
        case "-":
          res = arr[0] - arr[2];
          break;
        case "*":
          res = arr[0] * arr[2];
          break;
        case "/":
          res = arr[0] / arr[2];
          break;
        case "%":
          res = arr[0] % arr[2];
          break;
        default:
          break;
      }
      System.out.printf("%.2f",res);
    }
}
