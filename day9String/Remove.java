class Remove
{
  public static void main(String args[])
  {
    String str="asdfghjkl";


   for(int i=0;i<str.length();i++)
   {
    if(str.charAt(i)=='g')
    {
      str=str.replace("g","");
    }

   }
   System.out.println(str);
  }
}