class Result {
  int rotationCount(int arr[], int size) {
    // Write your code here
    int count = 0;
    int min = arr[0];
    for(int i = 1; i < size; i++){
      if(arr[i] < min){
        count = i;
        break;
      }
    }
    return(count);
  }
}
