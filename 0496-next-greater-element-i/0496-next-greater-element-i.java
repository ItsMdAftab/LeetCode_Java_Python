class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            hashmap.put(nums2[i],i); 
        }
        int[] nums3=new int[nums1.length]; 
        for(int i=0;i<nums1.length;i++)
        {
            if(hashmap.containsKey(nums1[i]))
            {
                int val=hashmap.get(nums1[i]); 
                if(nums1.length>val&&nums1[i]<nums2[val+1])
                {
                    nums3[i]=nums2[val+1]; 

                }
                else
                {
                    nums3[i]=-1;

                }


            }
            else
            {
                 nums3[i]=-1;
            }

        }
        return nums3; 
    }
}