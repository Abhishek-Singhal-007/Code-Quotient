class Result
{
  static int gcd(int i, int j)
  {
    if(j == 0)
      return i;
    else
      return gcd(j,i%j);
  }
}
