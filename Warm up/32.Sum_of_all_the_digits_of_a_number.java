// Do NOT change the class name
class Main
{
  public static int sum(int num){
    int ans = 0;
    while(num > 0){
      ans += num % 10;
      num = num / 10;
    }
    return ans;
  }
  
  public static void main(String[] args)
  {
    // Write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    for(int i = 0; i < n; i++)
      System.out.println(sum(arr[i]));
  }
}
