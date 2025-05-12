import java.util.Scanner;
class Week{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    if(n==1)
    {
      System.out.println("Monday");
    }
    else if(n==2)
    {
      System.out.println("Tuesday");
    }
    else if(n==3)
    {
      System.out.println("Wednesday");
    }
    else if(n==4)
    {
      System.out.println("Thursday");
    }
    else if(n==5)
    {
      System.out.println("Friday");
    }
    else if(n==6)
    {
      System.out.println("Saturday");
    }
    else if(n==7)
    {
      System.out.println("Sunday");
    }
    else{
      System.out.println("Invalid day");
    }
 }
}

//When we have multiple condition to check then we have to use Switch Case to make it less messy. As we can see here due to multiple condition we have to use multiple if and else i.e if else ladder that too multiple so in this type of condition we use switch case to make it less messy and more readable.//

//even if we reduced the code using switch case instead of if else 