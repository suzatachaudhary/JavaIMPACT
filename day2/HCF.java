class HCF
{
  public static void main(String[] args) 
  {
    int num1 = 18;
    int num2=12;

    if (num1>num2)
    {
      int rem1=num1%num2;
      int rem=num2%rem1;
      if (rem==0)
      {
        System.out.println(rem1);
      } 
    }
    else
    {
      int rem1=num2%num1;
      int rem=num1%rem1;
      if (rem==0)
      {
        System.out.println(rem1);
      } 
    }
  }
}

//using recursion
class Demo{
  int hcf(int a, int b){
    if(b==0){
      return a;
    }
    else{
      return hcf(b,a%b)
    }
  }
}

class HCF{
  public static void main(String[] args){
    Demo obj = new Demo();
    int res=obj.hcf(18,12);
    System.out.println(res);

  }
}