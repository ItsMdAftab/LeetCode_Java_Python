class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int sumofgas=0; 
        int sumofcost=0; 
        for(int i=0;i<gas.length;i++)
        {
            sumofgas+=gas[i]; 
            sumofcost+=cost[i]; 

        }
        if(sumofgas<sumofcost)
        {
            return -1;
        }
        int currentgas=0; 
        int startindex=0; 
        for(int i = 0; i < gas.length; i++) {
            currentgas += gas[i] - cost[i];

            if(currentgas < 0) {
                startindex = i + 1;
                currentgas = 0;
            }
        }

        return startindex;
        
    }
}