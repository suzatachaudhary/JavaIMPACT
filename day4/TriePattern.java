class TriePattern{
  public static void main(String args[])
  {
    int n =10;
    for(int i=1;i<=n;i++)
    {
      if(i%2==0)
      {
        System.out.println();
      }
      else
      {
        for(int j=1;j<=i;j++)
      {
        System.out.print(j);
      }
      }
     
    }
  }
}
/*
for(int i=1;i<=n;i++)
{
for(int j=1;j<=(2*i-1);j++)
{

}}
*/