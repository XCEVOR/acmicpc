import sys
inputdata = sys.stdin.readline
import statistics

def fnAverageMedian(num_ls):
    num_ls.sort()
    # print(num_ls)           # test print
    
    ave = statistics.mean(num_ls)
    print(ave)
    
    med = num_ls[2]
    print(med)


if __name__ == "__main__":
    num_ls = []
    for _ in range(5):
        num_ls.append(int(inputdata().strip()))
    
    # print(num_ls)           # test print
    
    fnAverageMedian(num_ls)
