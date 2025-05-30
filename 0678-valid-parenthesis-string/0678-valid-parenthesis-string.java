class Solution {
    public boolean checkValidString(String s) {
        int minbal=0; 
        int maxbal=0; 
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                minbal++; 
                maxbal++; 
            }
            else if(ch==')')
            {
                minbal=Math.max(0,minbal-1); 
                maxbal--; 
            }
            else if(ch=='*')
            {
                minbal=Math.max(0,minbal-1); 
                maxbal++;
            }
        }
        if(maxbal<0)
        {
            return false; 
        }
        return minbal==0; 
    }
}