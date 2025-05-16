class RemoveUsingRecursion   //advantage of string we have lot of inbuilt method.
{ 
  static String skip(String str)
  {
    if(str.isEmpty())
    {
      return " ";
    }
    char ch=str.charAt(0);
    if(ch == 'e')    //str.startsWith("Hello")   //starts from substring(5)  to skip all hello from string.
    {
      return skip(str.substring(1));
    }
    else
    {
      return ch + skip(str.substring(1));
    }
  }
  public static void main(String args[])
  {
      String str="Hello";
      String res=skip(str);
      System.out.println(res);
  }

}