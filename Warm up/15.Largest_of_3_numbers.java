import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc = new Scanner(System.in);
      String val = sc.nextLine();
      String strarr[] = val.split(" ");
      int arr[] = {1,2,3};
      for(int i = 0; i < 3; i++){
        arr[i] = Integer.valueOf(strarr[i]);
      }
      if(arr[0] >= arr[1] && arr[0] >= arr[2])
        System.out.println(arr[0]);
      else if(arr[1] >= arr[2])
        System.out.println(arr[1]);
      else
        System.out.println(arr[2]);
    }
}
