//Longest Substring


import java.util.Set;
import java.util.HashSet;

class Leetcode3
{
  public static void main(String[] args)
  {
    int L=0;
    int R=0;
    int maxLen=0;
    String s="abcabcbb";
    int n=s.length();
    Set<Character> set=new HashSet<>();

    while(R<n)
    {
      if(!set.contains(s.charAt(R)))
      {
        set.add(s.charAt(R));
        maxLen=Math.max(maxLen,R-L+1);
        R++;
      }
      else if(set.contains(s.charAt(R)))
      {
        set.remove(s.charAt(L));
        L++;
      }
    }
    System.out.println(maxLen);
  }
}