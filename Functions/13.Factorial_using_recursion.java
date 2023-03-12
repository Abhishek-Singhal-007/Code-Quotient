class Result{
  /*
   * Complete the function 'factorial' given below
   * @params
   *  n -> an integer whose factorial is to be calculated
   * @return
   *  The factorial of integer n
   */
  static int factorial(int n) {
    // Write your code here
    if(n == 0)
      return 1;
    else{
      return (n * (factorial(n - 1)));
    }
  }
}
