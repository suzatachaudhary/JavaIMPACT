import java.util.Arrays;
class SmallestCommonElement{
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums1.length;i++)
       {
        for(int j=0;j<nums2.length;j++)
        {
            if(nums1[i]==nums2[j])
            {
                min=Math.min(min,nums1[i]);
            }
        }
       }
       return min;
    }
}