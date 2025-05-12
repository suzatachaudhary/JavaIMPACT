import java.util.Scanner;
class NthTable
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N=sc.nextInt();

    for(int i=1;i<=10;i++)
    {
      int table = i * N ;
      System.out.println(N+"*"+i+"="+table);
    }
  }
}