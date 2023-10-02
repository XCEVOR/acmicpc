import sys
# Define inputdata
inputdata = sys.stdin.readline


# Define a function to calculate the result of (n * m) - 1
def calcFunc(n, m):
    calcResult = (n * m) - 1
    return calcResult

if __name__ == "__main__":
    # Read two integers n and m from input using sys.stdin.readline()
    n, m = map(int, inputdata().split())
    
    # Call the calcFunc function with n and m as arguments
    result = calcFunc(n, m)
    
    # Print the calculated result
    print(result)
