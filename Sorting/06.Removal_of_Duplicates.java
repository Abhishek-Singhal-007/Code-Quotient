// Return the new size of array, after removing the duplicates
static int removeDuplicates(int arr[], int N) {
  // Write your code here
  int []uniarr = new int[N];
  int prev = arr[0];
  uniarr[0] = prev;
  int index = 1;
  for(int i = 1; i < N; i++){
    int cur = arr[i];
    if(cur != prev){
      uniarr[index] = cur;
      index++;
    }
    prev = cur;
  }
  for(int i = 0; i < uniarr.length; i++){
    arr[i] = uniarr[i];
  }
  return index;
}
