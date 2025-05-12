//ternary operator ->Hollow sqaure

class HollowSquare{
  public static void main(String args[])
  {
    int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=n;j++)
      {
        String pattern=(i==1 || j==1 || i==n || j==n) ? "*": " ";
        System.out.print(pattern+" ");
      }
      System.out.println();
    }
  }
}