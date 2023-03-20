class Result {
  static void partitionArray(int[] arr, int x)
  {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      while (arr[i] <= x && i < j)
        i++;
      while (arr[j] > x && i < j)
        j--;
      if (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
  }
}
