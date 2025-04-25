class Solution 
{
    public int longestConsecutive(int[] nums)
    {
                if (nums == null || nums.length == 0) return 0;

        HashSet<Integer> hashmap = new HashSet<>();
        for (int num : nums) {
            hashmap.add(num);
        } 
        int longest=0; 
        for(int num: hashmap)
        {
            if(!hashmap.contains(num-1))
            {
                int current=1;
                int start=num; 
                while(hashmap.contains(start+1))
                {
                    current++;
                    start++; 
                }
                longest=Math.max(current,longest);
            }
          
         }
         return longest; 
    }
}