// for production level problem use scanner obj as in only.
import java.util.Scanner;
class BasicArray{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int[] arr=new int[5];
    for(int i=0;i<arr.length;i++){
      arr[i]=in.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
}