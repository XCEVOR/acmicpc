import sys
inputdata = sys.stdin.readline

def fnInputMember(N):
    member_ls = []
    for _ in range(N):
        person = list(map(str, inputdata().split()))
        member_ls.append(person)
    return member_ls

def fnSortByAge(member_ls):
    sorted_ls = sorted(member_ls, key = lambda x: int(x[0]))
    return sorted_ls


if __name__ == "__main__":
    N = int(inputdata().strip())

    member_ls = fnInputMember(N)
    print(member_ls)
    
    sorted_ls = fnSortByAge(member_ls)
    print(sorted_ls)
    
    for srt in sorted_ls:
        print(" ".join(srt))



# 5
# 21 Junkyu
# 21 Dohyun
# 20 Sunyoung
# 100 Acmicpc
# 9 Backjoon

# [['21', 'Junkyu'], ['21', 'Dohyun'], ['20', 'Sunyoung'], ['100', 'Acmicpc'], ['9', 'Backjoon']]
# [['9', 'Backjoon'], ['20', 'Sunyoung'], ['21', 'Junkyu'], ['21', 'Dohyun'], ['100', 'Acmicpc']]

# 9 Backjoon
# 20 Sunyoung
# 21 Junkyu
# 21 Dohyun
# 100 Acmicpc
