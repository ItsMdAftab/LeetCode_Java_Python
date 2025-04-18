import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        // HashMap to store the frequency of each number
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int count = 0;
        
        // First pass: count the frequency of each number
        for (int num : nums) {
            hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
        }
        
        // Second pass: check for valid k-diff pairs
        for (int num : hashmap.keySet()) {
            // If k is 0, we want to count only pairs of identical numbers
            if (k == 0) {
                if (hashmap.get(num) > 1) {
                    count++;
                }
            } else {
                // For k > 0, check if the pair (num, num+k) exists
                if (hashmap.containsKey(num + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
