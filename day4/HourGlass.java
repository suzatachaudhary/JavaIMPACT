//Hour glass
/*
* * * * *
 *     *
  *   *
   * *
    *
   * *
  *   *
 *     *
* * * * *     */

import java.util.Scanner;
class HourGlass{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=n;i>=1;i--)
    {
      for(int j=1;j<=n-i;j++)
      {
        System.out.print(" ");
      }
      for(int j=1;j<=(i*2)-1;j++)
      { 
        if(i==n || j==1 || j==(i*2)-1)
        {
          System.out.print("* ");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
