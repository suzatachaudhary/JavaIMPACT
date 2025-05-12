import java.util.Scanner;
class Factorial
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int N = sc.nextInt();
     int fact=1;
     for(int i=N;i>=1;i--)
     {
      fact=fact*i;
     }
     System.out.println("factorial of "+N+" is "+fact);
  }
}