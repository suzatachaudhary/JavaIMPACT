//sum of digit until it is equal to single digit
/* step 1 reverse the number  .2 sum the digit 3. again sum 
//steps to reverse a number.
int n=123;
int rev=0;
while(n!=0){
  int rem =n%10;
  rev=rev*10+rem;
  n=n/10;
}
*/

import java.util.Scanner;
class SumOfDigit{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int Sum = 0;
    while(n>9)
    {
      int sum=0;
      while(n!=0)
      {
        int rem=n%10;
        Sum=Sum+rem;
        n=n/10;
      }
      n=Sum;
    }
    System.out.println(n);
    
  }
}