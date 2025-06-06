class BinaryToInt{
  public static void main(String args[])
  {
    int binary = 11001;
    int place=0;
    int decimal=0;

    while(binary>0)
    {
      int rem=binary%10;
      decimal=decimal + rem*(int)Math.pow(2,place);
      place += 1;
      binary=binary/10;
    }
    System.out.println(decimal);
  }
}