import sys
inputdata = sys.stdin.readline


def fnInsert(heap_ls, x):
    heap_ls.append(x)
    
    node = len(heap_ls) - 1
    while node > 1:
        if heap_ls[node] > heap_ls[node // 2]:
            temp = heap_ls[node]
            heap_ls[node] = heap_ls[node // 2]
            heap_ls[node // 2] = temp
            node = node // 2
        else:
            break

def fnRemove(heap_ls):
    max_x = heap_ls[1]
    temp = heap_ls.pop()
    
    parent = 1
    child = 2
    
    while child <= len(heap_ls) - 1:
        if child < len(heap_ls) - 1 and heap_ls[child] < heap_ls[child + 1]:
            child += 1
        if heap_ls[child] <= temp:
            break
        heap_ls[parent] = heap_ls[child]
        parent = child
        child *= 2
        
    if len(heap_ls) != 1:
        heap_ls[parent] = temp
    return max_x


if __name__ == "__main__":
    N = int(inputdata().strip())
    heap_ls = [0]
    for _ in range(N):
        x = int(inputdata().strip())
        
        if x == 0:
            if len(heap_ls) == 1:
                print(0)
            else:
                print(fnRemove(heap_ls))
        else:
            fnInsert(heap_ls, x)
