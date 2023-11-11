import sys
inputdata = sys.stdin.readline


def getMaxPeopleWithCupholders(N, seats):
    cupholders = '*'
    couple = False
    
    for seat in seats:
        if seat == 'S':
            cupholders += 'S*'
        elif seat == 'L':
            if couple == True:
                cupholders += 'LL*'
                couple = False
            elif couple == False:
                couple = True
    
    # print(seats)  # TEST PRINT
    # print(cupholders)  # TEST PRINT
    
    return min(N, cupholders.count('*'))

if __name__ == "__main__":
    N = int(inputdata())
    seats = inputdata()
    
    result = getMaxPeopleWithCupholders(N, seats)
    
    print(result)
