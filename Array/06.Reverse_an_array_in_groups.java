class Result {
  static int[] reverseSubarray(int arr[], int n, int k) {
    // Write your code here
    for(int i = 0; i < n; i += k){
      int l = i;
      int r = Math.min(i + k - 1, n - 1);
      while(l < r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
      }
    }
    return arr;
  }
}
