class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        int l =0; 
        int r = nums.length-1;
        int mid=-1; 
        while(l<=r)
        {
            mid=(l+r)/2; 
            if(mid%2==0)
            {
                if(mid+1<nums.length&&nums[mid+1]==nums[mid])
                {
                    l=mid+1; 
                }
                else
                {
                    r=mid-1; 
                }

            }
            else
            {
                if(mid-1>=0&&nums[mid-1]==nums[mid])
                {
                    l=mid+1; 
                }
                else
                
                {
                    r=mid-1; 
                }
            }

        }
        return nums[mid]; 
        
    }
}