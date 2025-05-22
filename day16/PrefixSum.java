//prefix sum of range 3 i.e last 3 element and 1st 3 element.
class PrefixSum
{
  public static void main(String[] args)
  {
    int[] arr={2,3,5,7,9};
    int[] prefix=new int[arr.length];
    prefix[0]=arr[0];

    for(int i=1;i<arr.length;i++)
    {
      prefix[i]=prefix[i-1]+arr[i];
    }
  //   
  //now prefix sum wii lbe[2,5,10,17,26]
  //for prefix sum of [2,4]--[2,3,5,7,9]-->5+7+9=21 so from above prefix sum 26-5=21 i.e
  // 26 is prefix[4=right]-prefix[left+1] if left is 0 then prefix[right] only.

  

  }
  
}