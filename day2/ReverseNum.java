import java.util.Scanner;
class ReverseNum{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int Num=sc.nextInt();
    int a= Num%10;
    int b= (Num/10)%10;
    int c= (Num/10)/10;
    System.out.print(a);
    System.out.print(b);
    System.out.print(c);
  }
}