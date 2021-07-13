# https://practice.geeksforgeeks.org/problems/subarrays-with-sum-k

'''
Given an unsorted array of integers, find the number of continuous subarrays having 
sum exactly equal to a given number k.


Example 1:

    Input:
    N = 5
    Arr = {10 , 2, -2, -20, 10}
    k = -10
    
    Output: 3

    Explaination: 
    Subarrays: arr[0...3], arr[1...4], arr[3..4]
    have sum exactly equal to -10.


Example 2:

    Input:
    N = 6
    Arr = {9, 4, 20, 3, 10, 5}
    k = 33
    
    Output: 2

    Explaination: 
    Subarrays : arr[0...2], arr[2...4] have sum
    exactly equal to 33.


Your Task:
You don't need to read input or print anything. Your task is to complete the function 
findSubArraySum() which takes the array Arr[] and its size N and k as input parameters 
and returns the count of subarrays.

Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 2*10^4
-10^3 ≤ Arr[i] ≤ 10^3
-10^7 ≤ k ≤ 10^7
'''

from collections import defaultdict
class Solution:
    def findSubArraySum(self, Arr, N, k):
        # code here
        ans = allen = 0
        d = defaultdict(lambda:0)
        for z in range(N):
            allen+=Arr[z]
            if(allen==k): ans+=1
            if(allen-k) in d: ans+=d[allen-k]
            d[allen]+=1
        return ans

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range (t):
        N = int(input())
        Arr = input().split()
        for itr in range(N):
            Arr[itr] = int(Arr[itr])
        k = int(input())
        ob = Solution()
        print(ob.findSubArraySum(Arr, N, k))
# } Driver Code Ends