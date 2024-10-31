 class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<2){
            return ;
        }
        int L=0;
        int R=1; 
        while(R<nums.length){
            if(nums[L]!=0){
                L++; 
                R++;
            }
            else if (nums[R]==0){
                R++;
            }
            else{
                int temp=nums[R];
                nums[R]=nums[L];
                nums[L]=temp;
            }
        }
        
    }
