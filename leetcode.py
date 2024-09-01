"""class Solution(object):
    def minBitFlips(self, start, goal):
        n=start^goal
        c=0
        while n!=0:
            n=n&n-1
            c+=1
        return c
start=10
goal=7
n=start^goal
c=0
while n!=0:
    
    n=n&n-1
    print('n',n)
    c+=1
    print(c)

print(Solution().minBitFlips(start,goal))
"""
'''
mat=[[1,2,3],[4,5,6],[7,8,9]]
sum=0
for i in range(len(mat[0])):
    sum+=mat[i][i]
    
k=len(mat[0])
for j in range(len(mat[0])):
    k-=1
    if j!=k:
        sum+=mat[j][k]
print(sum)
'''
'''
x=121
z=reversed(str(x))#reversed 
if x==z: 
        print('true')
else : 
        print('false')
'''
'''
class Solution(object):
    def longestCommonPrefix(self, strs):
    
        k=sorted(strs)
        start=k[0]
        print('star',start)
        last=k[-1]
        print(last)
        ans=''
        for i in range(len(start)):
            print(start[i])
            print('n',last[i])
            if start[i]==last[i]:
                ans+=start[i]
                print('ans',ans)    
            else: 
                break
        return ans
strs=["dog","racecar","car"]
print(Solution().longestCommonPrefix(strs))
'''
'''
nums = [2, 7, 11, 15]
target = 9
print(len(nums))
for i in range(len(nums)):
    for j in range(i+1,len(nums)):
        k=nums[i]+nums[j]
        if k==target:
            l=[i,j]
            print(l)
'''
'''
list1 = [1,2,4]
list2 = [1,3,4]
k=[*list1,*list2]
print(sorted(k))
'''
'''

nums = [1,1,2]
unique_set = set(nums)
unique_list = sorted(unique_set)
print(len(unique_list))
print(unique_list
))
'''
'''
class Solution:
    def removeDuplicates(self, nums): 
        j = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[j] = nums[i]
                j += 1
        return j,nums
nums = [0,0,1,1,1,2,2,3,3,4]
print(Solution().removeDuplicates(nums))

nums = [3,2,2,3]
val=3
k=[]
for i in range(len(nums)):
    if nums[i]!=val:
        k.append(nums[i])
print(len(k))
print(k)
'''
'''
class Solution(object):
    def removeElement(self, nums, val):
        k=0
        for i in range(len(nums)):
            if nums[i]!=val:
                nums[k]=nums[i]
                k+=1
        return k,nums
nums = [3,2,2,3]
val = 3
print(Solution().removeElement(nums,val))
'''
#FIND THE INDEX OF FIRST OCCURRIN'
'''
haystack = "sadbutsad"
needle = "sad"
index=haystack.index('sad')
print(index)
'''
#Code:
'''
class Solution(object):
    def strStr(self, haystack, needle):
        if needle in haystack : 
            index=haystack.index(needle)
            return index
        else: 
            return -1
'''
#SEARCH INSERT POSITION
#code: 
'''
class Solution(object):
    def searchInsert(self, nums, target):
        for i in range(len(nums)):
            if nums[i] >= target:
                return i
        return len(nums)
'''
#   LENGTH OF LAST WORD:
#CODE:
'''
s = "Hello World"
k=list(s.split())
print(len(k[-1]))
'''
#PLUS ONE:
'''
digits = [1,2,3]
print(type(digits))
k=str(digits)
print(type(k))
f=''.join(k)
print(f)
l=str(int(f)+1)
j=list(','.join(l))
print(j)
''''''
dig=[]
k=''
for i in range(len(digits)):
    k+=str(digits[i])
j=str(int(k)+1)
for i in range(len(j)):
    k=int(j[i])
    dig.append(k)
print(dig)
'''
#REMOVE DUPLICATES FORM SORTED LIST:
#code:
'''
head = [1,1,2]
k=set(head)
j=list(k)
print(j)
'''
#121 BEST TIME TO BUY AND SELL STOCK :
prices = [7,6,4,3,1]

buy=min(prices)
if buy!=prices[-1]:
    datebuy=prices.index(buy)
    orgi=datebuy
    while datebuy!=-1:
        prices.pop(datebuy)
        datebuy-=1
    sell=max(prices)
    datesell=prices.index(sell)
    profit=sell-buy
    print(profit)
else:
    print(0)

