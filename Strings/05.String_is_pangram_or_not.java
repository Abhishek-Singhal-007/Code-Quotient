class Result {
  /*     
   * Complete the 'isPangrams' function below.
   * @params
   *   str -> a string that is to be tested for pangram
   *
   * @return
   *   boolean value, based on the fact, whether 
   *   the given string is a pangram or not.
   */
  public static boolean isPangram(String str) {
    // Write your code here
    boolean []mark = new boolean[26];
    int index = 0;
    for(int i = 0; i < str.length(); i++){
    if('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
      index = str.charAt(i) - 'A';
    else if('a' <= str.charAt(i) && str.charAt(i) <= 'z')
      index = str.charAt(i) - 'a';
    else
      continue;
    mark[index] = true;
    }
    for(int i = 0; i < 26; i++){
      if(mark[i] == false){
        return false;
      }
    }
    return true;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean []ans = new boolean[n];
    for(int i = 0; i < n; i++){
      String str = sc.nextLine();
      ans[i] = isPangram(str);
    }
    for(int i = 0; i < n; i++){
      if(ans[i])
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}
