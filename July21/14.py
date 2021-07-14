# https://practice.geeksforgeeks.org/problems/element-appearing-once2552

'''
Given a sorted array A[] of N positive integers having all the numbers occurring 
exactly twice, except for one number which will occur only once. Find the number 
occurring only once.

Example 1:

    Input:
    N = 5
    A = {1, 1, 2, 5, 5}

    Output: 2

    Explanation: 
    Since 2 occurs once, while other numbers occur 
    twice, 2 is the answer.

Example 2:

    Input:
    N = 7
    A = {2, 2, 5, 5, 20, 30, 30}

    Output: 20

    Explanation:
    Since 20 occurs once, while other numbers occur 
    twice, 20 is the answer.

Your Task:
You don't need to read input or print anything. Your task is to complete the 
function search() which takes two arguments(array A and integer N) and returns 
the number occurring only once.

Expected Time Complexity: O(Log(N))
Expected Auxiliary Space: O(1)

Constraints:
0 < N <= 10^6
0 <= A[i] <= 10^9
'''

class Solution:
    def search(self, A, N):
        # your code here
        return abs(sum(sorted(A)[0:N:2])-sum(sorted(A)[1:N:2]))

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
	t = int (input ())
	for tc in range (t):
		n = int (input ())
		arr = list(map(int, input().split()))
		ob = Solution()
		print(ob.search(arr, n)) 
# } Driver Code Ends