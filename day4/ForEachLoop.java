// Example for For each Loop

class ForEachLoop{
  public static void main(String args[])
  {
    int[] arr = {1, 2, 3, 4, 5};
    for(int i:arr){
      int res=(i%2==0) ? i : 0 ;
      System.out.println(res);
    }
  }
}