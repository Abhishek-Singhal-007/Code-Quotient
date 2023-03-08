class Result {
  static void printSpiral(int a[][], int r, int c) {
	// Write your code here
    int top = 0, bot = r-1, left = 0, rig = c-1;
    while(top <= bot && left <= rig){
      for(int i = left; i <= rig; i++)
        System.out.println(a[top][i]);
      top++;
      for(int i = top; i <= bot; i++)
        System.out.println(a[i][rig]);
      rig--;
      if(top <= bot){
        for(int i = rig; i >= left; i--)
          System.out.println(a[bot][i]);
        bot--;
      }
      if(left <= rig){
        for(int i = bot; i >= top; i--)
          System.out.println(a[i][left]);
        left++;
      }
    }
  }
}
