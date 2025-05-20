class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fo=-1; 
        int lo=-1; 
        int l=0; 
        int r=nums.length-1; 
        while(l<=r)
        {
            int mid=(l+r)/2; 
            if(nums[mid]==target)
            {
                fo=mid; 
                r=mid-1; 
            }
            else if(nums[mid]<target)
            {
                l=mid+1; 
            }
            else
            {
                r=mid-1; 
            }
        }
        l=0; 
        r=nums.length-1; 
        while(l<=r)
        {
            int mid=(l+r)/2; 
            if(nums[mid]==target)
            {
                lo=mid; 
                l=mid+1; 
            }
            else if(nums[mid]<target)
            {
                l=mid+1; 
            }
            else
            {
                r=mid-1; 
            }
        }
        int [] arr=new int[2]; 
        arr[0]=fo; 
        arr[1]=lo; 
        return arr; 
        
    }
}