//#Ques : take square matrix rotate 90 degrees.
/* 1 2 3      7 4 1
   4 5 6  --> 8 5 2
   7 8 9      9 6 3  first write code to transpose 
*/

class RotateMatrix{
  public static void main(String[] args)
  {
    int[][] arr={
      {1,2,3},
      {4,5,6},
      {7,8,9}
    };

    for(int i=0;i<arr.length;i++)
    {
      for(int j=i;j<arr.length;j++)
      { 
        //Transposing matrix
        //System.out.print(arr[j][i]); //transpose
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
      }
    }
    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length/2;j++)  //arr.length/2 as the swapping has to be done only once for every row as we have 3 colums only.
      {
         int temp=arr[i][j];
         arr[i][j]=arr[i][arr.length-1-j];
         arr[i][arr.length-1-j]=temp;
      }
    }

    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr.length;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}