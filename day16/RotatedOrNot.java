// import java.util.Scanner;
// class RotatedOrNot
// {
//   public static void main(String args[])
//   {
//      Scanner in = new Scanner(System.in);
//      int n = in.nextInt();
//      int[] arr= new int[n];

//      for(int i=0; i<n; i++)
//      {
//       arr[i] = in.nextInt();
//      }
//      System.out.println(RotatedOrNot.isRotated(arr));
//   }

//   public static boolean isRotated(int[] arr)
//   {
//     int left=0;
//     int right=arr.length-1;
//     while(left<=right)
//     {
//       int mid = left+(right-left)/2;
    
//         if(arr[mid]<arr[right]) 
//       {
        
//             right = mid; 
//       }
//       else 
//       {
//             left = mid+1; 
//       }
//     }

//     // int minIndex=left;
//     // left=0;
//     // int count=0;
//     // while(left<minIndex)
//     // {
//     //    if(arr[left]>arr[minIndex])
//     //    {
//     //     count++;
//     //     left++;
//     //    }
//     // }
//     // if(count != minIndex)
//     // {
//     //   return false;
//     // }
//     // return true;/

//     if(left!=0)
   

//   }
// }
import java.util.Scanner;

class RotatedOrNot {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(isRotated(arr));
    }

    public static boolean isRotated(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) { // Check inversion
                count++;
            }
        }

        return count <= 1; // If there's at most one inversion, it's rotated
    }
}