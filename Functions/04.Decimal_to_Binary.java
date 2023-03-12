import java.util.*;
class Result {
  // print the binary equivalent of the given number 'n'
  static void decimalToBinary(int n) {
    // Write your Code here
    ArrayList<Integer> val = new ArrayList<>();
    int k = 0;
    while(n > 0){
      val.add(n % 2);
      n = n / 2;
      k++;
    }
    for(int i = val.size()-1; i >= 0; i--){
      System.out.print(val.get(i) + "");
    }
    //System.out.println();
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      int val = sc.nextInt();
      decimalToBinary(val);
    }
  }
}
