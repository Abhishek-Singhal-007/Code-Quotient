class Result {
  static int countVowelSubstr(String str) {
    // Write your code here
    int count = 0;
    int n = str.length();
    for(int i = 0; i < n; i++)
      if(isVovel(str.charAt(i)))
        count = (count + (n - i)) % 10007;
    return count;
  }
  static boolean isVovel(char c){
    return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
           c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
  }
}
