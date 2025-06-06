//conversion of ith bit to set bit.
//n=27 i=2

class SettingIthbit
{
  public static void main(String args[])
  {
    int n = 27; 
    int i=2;
    int res=(n | (1<<i));
    System.out.println("Result after setting ith bit is "+res);
  }
}

