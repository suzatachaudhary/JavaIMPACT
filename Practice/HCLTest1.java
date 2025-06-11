// input="aabbcddef"
//output=first non repetitive character

import java.util.Scanner;
class HCLTest1
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int left=0;
    int count=0;
    while(left<s.length())
    {
      char ch=s.charAt(left);
      s.substring(left+1);
      if(!s.contains(ch))
      { 
        count++;
        System.out.println(ch);
        break;
      }
    }
    if(count==0)
    {
      System.out.println(-1);
    }
    left++;
  }
}
