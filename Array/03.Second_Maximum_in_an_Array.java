import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
    public static void main(String[] args)
    {
        // Write your code here
      int max = Integer.MIN_VALUE;
      int smax = Integer.MIN_VALUE;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }
      for(int i = 0; i < arr.length; i++){
        if(arr[i] > max){
          smax = max;
          max = arr[i];
        }
        else if(arr[i] > smax && arr[i] != max){
          smax = arr[i];
        }
      }
      if(Integer.MIN_VALUE == smax)
        System.out.println("0");
      else
        System.out.println(smax);
    }
}
