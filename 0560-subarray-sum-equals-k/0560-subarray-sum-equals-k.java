class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap= new HashMap<>(); 
        int sum=0; 
        hashmap.put(0,1);
        int count=0; 
        for(int num: nums)
        {
            sum+=num; 
            if(hashmap.containsKey(sum-k))
            {
                count+=hashmap.get(sum-k); 

            }
            hashmap.put(sum, hashmap.getOrDefault(sum,0)+1); 
        }
        return count; 
        
    }
}