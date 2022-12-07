import sys
inputdata = sys.stdin.readline


def fnIsPossible(S, T):             # 역으로 T 에서 S 로 가능한지를 찾는다.
    while True:
        if T == S:                  # 매번 T 와 S 를 비교.
            print(1)
            break
        elif len(T) < len(S):       # 위의 조건을 만족하지 못한 상태에서 T 의 길이가 더 작아지면 불가능.
            print(0)
            break
        elif T[-1] == 'A':          # 맨 뒷 문자가 A 이면 A 제거.
            T = T[:-1]
        elif T[-1] == 'B':          # 맨 뒷 문자가 B 이면 B 제거 후 뒤집음.
            T = T[:-1]
            T = T[::-1]


if __name__ == "__main__":
    S = str(inputdata().strip())
    T = str(inputdata().strip())
    
    fnIsPossible(S, T)
