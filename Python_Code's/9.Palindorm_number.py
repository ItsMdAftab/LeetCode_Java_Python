class Solution(object):
    def isPalindrome(self, x):
        # Convert the number to a string
        x_str = str(x)
        # Check if the string is equal to its reverse
        return x_str == x_str[::-1]

'''
x=121
z=reversed(str(x))#rembeber reveresed keyword
if x==z: 
        print('true')
else : 
        print('false')
'''

       
            
