import sys
inputdata = sys.stdin.readline
from collections import deque
 
 
def fnIsGroupWord(word):
    for i in range(len(word) - 1):
        w = word.popleft()
        
        if w != word[0] and w in word:
            return 0
        
    return 1
 
 
if __name__ == "__main__":
    n = int(inputdata().strip())
    count = 0
    for _ in range(n):
        word = deque(map(str, inputdata().strip()))
        
        count += fnIsGroupWord(word)
    
    print(count)
