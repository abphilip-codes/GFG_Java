# https://practice.geeksforgeeks.org/problems/element-appearing-once2552

'''

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