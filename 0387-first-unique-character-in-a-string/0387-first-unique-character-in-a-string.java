class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hashmap=new HashMap<>(); 
        for(int i=0;i<s.length();i++)
        {
            int val=hashmap.getOrDefault(s.charAt(i),0);
            hashmap.put(s.charAt(i),++val);
        }
        int result=-1; 
        for(int i=0;i<s.length();i++)
        {
            if(hashmap.get(s.charAt(i))==1)
            {
                result=i; 
                break; 
            }
        }
        return result; 

        
    }
}