import sys
inputdata = sys.stdin.readline

def fnRemainderDistribution(A, B):
    if B == 1:
        return A % C
    
    remainder = fnRemainderDistribution(A, B // 2)
    # print(f'remainder: {remainder}')            # test print
    
    if B % 2 == 0:
        return remainder * remainder % C
    elif B % 2 == 1:
        return remainder * remainder * A % C


if __name__ == "__main__":
    A, B, C = map(int, inputdata().split())
    
    result = fnRemainderDistribution(A, B)
    print(result)



# 111 123 17

# remainder: 9
# remainder: 15
# remainder: 2
# remainder: 2
# remainder: 4
# remainder: 8
# 15
