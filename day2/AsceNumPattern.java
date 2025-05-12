import java.util.Scanner;
class AsceNumPattern{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        for(int k=i;k<=i;k++)
        {
          System.out.print(k+" ");
        }
      }
      System.out.println();

    }
    
  }
}