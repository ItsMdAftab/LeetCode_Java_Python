class Solution:
    def twoSum(self, nums, target) :
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                k=nums[i]+nums[j]
                if k==target:
                    j=[i,j]
                    return j

            
