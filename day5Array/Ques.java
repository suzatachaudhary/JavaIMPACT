//[1,0,1,0,1,0] move all zeros to right side[1,1,1,0,0,0]

class Ques{
  public static void main(String args[])
  {
    int[] arr={1,0,1,0,1,0};
    for(int i=0;i<arr.length-1;i++)
    {
      if(arr[i]==0 && arr[i+1]==1)
      {
        arr[i]=1;
        arr[i+1]=0;
      }
    }
    for(int i=0;i<arr.length-1;i++)
    {
      if(arr[i]==0 && arr[i+1]==1)
      {
        arr[i]=1;
        arr[i+1]=0;
      }
    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]);
    }
  }
}

