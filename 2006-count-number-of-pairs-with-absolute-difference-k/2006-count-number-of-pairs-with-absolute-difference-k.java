class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap=new HashMap<>(); 
        for(int num: nums)
        {
            int val=hashmap.getOrDefault(num,0); 
            hashmap.put(num,++val); 
        }
        int count=0; 
        for(int num: nums)
        {
            if(hashmap.containsKey(num-k))
            {
                count+=hashmap.get(num-k); 
            }
        }
        return count; 
        
    }
}