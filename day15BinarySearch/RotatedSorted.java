// arr={9,10,3,4,5,6,7,8}
//target=10.
//Array sorted in rotated .

class RotatedSorted {
    public static int search(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;

        
       while(left<=right)
       {
        int mid=left+(right-left)/2;
        
        if(nums[mid]==target)
        {
            return mid;
        }
        if(nums[mid]<nums[left])
        {
           if(nums[right]>= target && target>nums[mid])
           {
            left=mid+1;
           }
           else
           {
             right=mid-1;
           }
        }
        if(nums[mid]>=nums[left])
        {
            if(nums[left]<=target && target<nums[mid])
            {
                right=mid-1;
               
            }
            else
            {
                 left=mid+1;
            }
         }

       }
       return -1;
    }
    public static void main(String args[])
    {
      int[] nums={4,5,6,7,0,1,2};
      int target=6;
      System.out.println(search(nums, target));
    }
}




class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Found target
            }

            // Check which half is sorted
            if (nums[left] <= nums[mid]) { // Left half is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // Search in left half
                } else {
                    left = mid + 1; // Search in right half
                }
            } else { // Right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // Search in right half
                } else {
                    right = mid - 1; // Search in left half
                }
            }
        }

        return -1; // Target not found
    }
}