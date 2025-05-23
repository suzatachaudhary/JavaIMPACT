// //Max product of sub array

// observation:
// -in a given sub array if we have even negtaive values. product will be positive.
// -if we have odd negative values product will be negative.
// -if we find 0 the product will be 0 then restart product to 1.
// -initialize two variables prefix and suffix variable.
// -calculate prefix product and suffix product. get max of max of prefix and suffix.

// prefix=1
// suffix=1
// for(0,n-1)
//   if prefix==0 
//    prefix=1;
//   if(suffix==0)
//     suffix=1

// prefix= prefix*arr[i]
// // suffix=suffix*arr[n-i-1];
// max=max(prefix, suffix);

class MaxProduct{
  public static void main(String args[])
  {
    // int[] arr={ 2, 3, -2, 2};
    int[] arr={5, 3, 2,-1, 0, 5, 7, 8, 0, -1, 2};
    int n=arr.length;
    int prefix=1;
    int suffix=1;
    int MaxProduct=Integer.MIN_VALUE;

    for(int i=0;i<n;i++)
    {
      if(prefix==0) prefix=1;
      if(suffix==0) suffix=1;

      prefix *= arr[i];
      suffix *= arr[n-i-1];
      MaxProduct=Math.max(MaxProduct, Math.max(prefix, suffix));
      
    }
    System.out.println(MaxProduct);
  }
}