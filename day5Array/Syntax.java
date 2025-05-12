class Syntax{
  public static void main(String[] args)
  {
    int[] arr={1,2,3,4,5}; //both in same line
    //int[] arr;   //declaration 
    //arr={1,2,3,4}//initialization
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
    String a="Suzata";
    System.out.println(str.length(a));

    /*
    to print the output
    1. for(int i=0;i<=n;i++)
    {

    }
    2.for(int i : arr){
    System.out.println()}

    //toString is an inbuilt method to print array values.
    System.out.println(Arrays.toString(arr))
    */
   //internally toString contain for loop and it will print along with open and close square brackets followed by comma.exp:[1,2,3,4,5]
  }
}