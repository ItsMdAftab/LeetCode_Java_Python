class Solution {
    public boolean isAnagram(String s, String t)
     
     {
        if(s.length()!=t.length())
        {
            return false; 
        }
        HashMap<Character,Integer> hashmap=new HashMap<>(); 
        for(int i=0;i<s.length();i++)
        {
            hashmap.put(s.charAt(i),hashmap.getOrDefault(s.charAt(i),0)+1); 
            hashmap.put(t.charAt(i),hashmap.getOrDefault(t.charAt(i),0)-1);
            
        }
        for(int count: hashmap.values())
        {
            if(count!=0)
            {
                return false; 
            }

        }
        return true; 
        
    }
}