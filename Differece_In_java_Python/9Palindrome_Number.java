9. Palindrome Number//differeces  
//JAVA Code : 
class Solution {
    public boolean isPalindrome(int x) {
        String k = Integer.toString(x);
        StringBuilder sb=new StringBuilder(k);//Usage of StringBuilder sb= new StringBuilder(k)

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
//PYTHON Code: 
class Solution(object):
    def isPalindrome(self, x):
        # Convert the number to a string
        x_str = str(x)
        # Check if the string is equal to its reverse
        return x_str == x_str[::-1]

/*
x=121
z=reversed(str(x))#rembeber reveresed keyword
if x==z: 
        print('true')
else : 
        print('false')
*/

       
            
