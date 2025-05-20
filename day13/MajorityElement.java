//[2,2,1,2,1] ---> [2(ele>n/2)]
//majority element is if a element repeated more than n/2 times in the array.
//voting algorith
import java.util.Scanner;
class MajorityElement
{
  public static void main(String[] args) 
  {
     Scanner in=new Scanner(System.in);
     int size=in.nextInt();
    
     int[] arr=new int[size];
     int major=size/2;
 
     for(int i=0;i<size;i++)
     {
       arr[i]=in.nextInt();
     }

     int target=arr[0];
     int count =1;
     for(int i=0;i<size;i++)
     {
      if(count==0)
      {
        target=arr[i];
      }
      else if(arr[i]==target)
       {
         count++;
       }
      else
       {
        count--;
       }
    }

    if(count==0)
    {
     System.out.println("No Majority element");
    }
    else
    { 
      count = 0;
      for(int i=0;i<size;i++)
      {
        if(arr[i]==target)
        {
          count++;
        }
      }

      if(count > major)
      {
        System.out.println("Majority element is : "+target);
      }
      else
      {
        System.out.println("No Majority element");
      }
    }
  }
}