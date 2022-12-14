import sys
inputdata = sys.stdin.readline


def fnSum(A, B, C, D):
    AB = str(A) + str(B)
    CD = str(C) + str(D)
    # print(AB, CD)           # test print
    
    result = int(AB) + int(CD)
    print(result)
    

if __name__ == "__main__":
    A, B, C, D = map(int, inputdata().split())
    
    fnSum(A, B, C, D)
