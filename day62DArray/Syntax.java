import java.util.Scanner;
class Syntax{
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);

    //for printing arrays values.
    int[][] arr=new int[3][2];

    for(int i=0; i< arr.length; i++)
    {
      for(int j=0; j<arr[i].length; j++)
      {
        arr[i][j] =in.nextInt();
      }
    }

    for(int i=0;i<arr.length;i++)
    {
      for(int j=0;j<arr[i].length;j++)
      {
        System.out.println(arr[i][j]);
      }
    }

    //for printing for only rows wise
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(Arrays.toString(arr[i]));
    }
}
}