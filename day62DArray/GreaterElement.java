//print greater element if not print  -1.
//[7,8,3,6,1]--[8,-1,6,-1,-1]

class GreaterElement{
  public static void main(String args[])
  {
    int[] arr={7,8,3,6,1};
    

    for(int i=0;i<arr.length-1;i++)
    {
      boolean found =false;
      for(int j=i+1;j<arr.length-1;j++)
      {
        if(arr[j]>arr[i])
        { 
          System.out.print(arr[j]+" ");
          found=true;
          break;
        }
      }
      if (!found)
        {
        System.out.print(-1+" ");
        }
    }
    System.out.print(-1+" ");
  }
}