
from itertools import combinations
def find(lst, n):
    print('YES' if [1 for r in range(1, len(lst) + 1) 
                      for subset in combinations(lst, r) 
                      if sum(subset) ==   n] else 'NO')
find([-1, 2, 4, 121], 5)