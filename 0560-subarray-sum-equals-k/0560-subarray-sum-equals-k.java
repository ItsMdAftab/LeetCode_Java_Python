class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<>(16, 0.75f); 
        int sum = 0, count = 0; 
        hashmap.put(0, 1);  // Initialize with sum 0 seen once
        
        for (int num : nums) {
            sum += num;
            count += hashmap.getOrDefault(sum - k, 0); // Combine containsKey and get
            hashmap.put(sum, hashmap.getOrDefault(sum, 0) + 1);
        }
        
        return count; 
    }
}
