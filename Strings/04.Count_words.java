class Result {
  static int countWords(String str) {
	// Write your code here
    if( str.isEmpty())
      return 0;
    String []strarr = str.split("\\s+");
    return strarr.length;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int ans = countWords(str);
    System.out.println(ans);
  }
}
