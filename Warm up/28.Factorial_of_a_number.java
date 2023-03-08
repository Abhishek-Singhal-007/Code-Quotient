static long fact(int n) {
  // Write your code here
  long res = 1;
  for(int i = n; i > 0; i--){
    res *= i;
  }
  return res;
}
