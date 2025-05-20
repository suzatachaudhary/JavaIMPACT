class mock
{
  public static void main(String args[])
  {
    int[] arr = {50,300, 100, 400, 80, 70};

    int min_price=arr[0];
    int max=0;
    int arr_ind;
    for (arr_ind = 1; arr_ind < arr.length; arr_ind++) {
      if (min_price > arr[arr_ind]){
        min_price = arr[arr_ind];
      }
      else{
        int profit = arr[arr_ind] - min_price;
        if (max > profit ){
          max = max;
        }else{
          max = profit;
        }
      }
    }
    System.out.println(max);
  
  }
}