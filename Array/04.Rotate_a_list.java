import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
  
  	public static void rotate(int[] arr, int r){
      int n = arr.length;
      r %= n;
      reverse(arr, 0, r-1);
      reverse(arr, r, n-1);
      reverse(arr, 0, n-1);
    }
  
  	public static void reverse(int[] arr, int s, int e){
      while(s < e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        s++;
        e--;
      }
    }
  
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i = 0; i < t; i++){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int j = 0; j < n; j++){
          arr[j] = sc.nextInt();
        }
        int r = sc.nextInt();
        rotate(arr, r);
        for(int j = 0; j < n-1; j++)
          System.out.print(arr[j] + " ");
        System.out.print(arr[n-1]);
        System.out.println();
      }
    }
}
