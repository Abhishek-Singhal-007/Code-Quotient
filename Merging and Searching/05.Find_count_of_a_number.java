import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
  
  	public static void count(int []arr, int k){
      int count = 0;
      for(int i = 0; i < arr.length; i++){
        if(arr[i] == k){
          count++;
        }
      }
      System.out.println(count);
    }
  
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t > 0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++)
          arr[i] = sc.nextInt();
        count(arr , k);
        t--;
      }
    }
}
      
