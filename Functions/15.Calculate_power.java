class Result
{
  static int power(int num, int pow){
    // Write your code here
    if(pow < 0)
      return -1;
    return (int)(Math.pow(num, pow));
  }
}
