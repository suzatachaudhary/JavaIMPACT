import java.util.Scanner;
class ReverseNum{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int Num=sc.nextInt();
    int reverse=0;
    while(Num>0)
    {
      int rem=Num%10;
      reverse = reverse*10 + rem;
      Num /= 10; 
    }
    System.out.println("Reverse of the number is: "+reverse);
  }
}