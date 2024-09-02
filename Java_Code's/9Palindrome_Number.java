class Solution {
    public boolean isPalindrome(int x) {
        String k = Integer.toString(x);
        StringBuilder sb=new StringBuilder(k);

        String j=sb.reverse().toString();
        if (k.equals(j))
        {
            return true;
        }
        else 
        {
            return false ;
        }
        
    }
}