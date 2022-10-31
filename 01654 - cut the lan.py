import sys
inputdata = sys.stdin.readline

def fnCutTheLan(K, N, lan_ls):
    start = 1
    end = max(lan_ls)
    
    while (start <= end):
        mid = (start + end) // 2
        count = 0
        for i in range(K):
            count += lan_ls[i] // mid
            
        if N <= count:
            start = mid + 1
        else:
            end = mid - 1
            
        print(f'count: {count}   start: {start}   end: {end}')           # test print
    
    return end


if __name__ == "__main__":
    K, N = map(int, inputdata().split())
    lan_ls = []
    for _ in range(K):
        lan_ls.append(int(inputdata().strip()))
    
    result = fnCutTheLan(K, N, lan_ls)
    print(result)



# 4 11
# 802
# 743
# 457
# 539

# count: 5   start: 1   end: 400
# count: 11   start: 201   end: 400
# count: 6   start: 201   end: 299
# count: 8   start: 201   end: 249
# count: 10   start: 201   end: 224
# count: 10   start: 201   end: 211
# count: 10   start: 201   end: 205
# count: 10   start: 201   end: 202
# count: 10   start: 201   end: 200

# 200
