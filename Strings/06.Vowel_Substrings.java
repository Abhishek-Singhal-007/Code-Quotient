class Result {
  static int countVowelSubstr(String str) {
    // Write your code here
    int sum = 0;
    for(int i = 0; i < str.length(); i++){
      if("aeiouAEIOU".indexOf(str.charAt(i)) != -1)
        sum += str.substring(i).length();
    }
    return(sum % 10007);
  }
}
