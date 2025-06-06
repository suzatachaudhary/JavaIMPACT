//it won't be possible. 

class SettingIthbitRight
{
  public static void main(String args[])
  {
    int n = 21; 
    int i=1;
    int res=(n | (1>>i));
    System.out.println("Result after setting ith bit is "+res);
  }
}
