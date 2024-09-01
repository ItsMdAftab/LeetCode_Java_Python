class Solution:
    def twoSum(self, nums, target) :
        for i in range(len(nums)):
            for j in range(i+1,len(nums))://we use len(nums)
                k=nums[i]+nums[j]
                if k==target:
                    j=[i,j]//imp we can print list direclty because list is dynalmically typed
                    return j
		return [0]

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i =0 ; i<nums.length;i++)
        {
            for (int j = i +1;j<nums.length;j++)
            {
                if (nums[i]+nums[j]==target)//we use nums.lenght;
                {
                    return new int[]{i,j};//we have to declare the array first 
                }
            }
        }
        return new int[0];

        
    }
}