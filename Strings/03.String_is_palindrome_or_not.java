class Result{
  // Return true if the string is palindrome, else return false
  static boolean isPalindrome(String str) {
    // Write your code here
    String rev = "";
    for(int i = str.length()-1; i >= 0; i--){
      rev += str.charAt(i);
    }
    if(str.equals(rev))
      return true;
    return false;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean ans[] = new boolean[n];
    String []str = new String[n];
    for(int i = 0; i < n; i++){
      str[i] = sc.nextLine();
      ans[i] = isPalindrome(str[i]);
    }
    for(int i = 0; i < n; i++){
      if(ans[i])
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}
