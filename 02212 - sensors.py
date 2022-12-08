import sys
inputdata = sys.stdin.readline


def fnMinimumDistance(N, K):
    dist_ls = []
    
    sensor_ls.sort()
    # print(sensor_ls)            # test print
    
    for i in range(0, N - 1):
        dist_ls.append(sensor_ls[i+1] - sensor_ls[i])
    
    # print(dist_ls)          # test print
    dist_ls.sort()
    # print(dist_ls)          # test print
    
    # print(dist_ls[:N-K])            # test print
    
    print(sum(dist_ls[:N-K]))


if __name__ == "__main__":
    N = int(inputdata().strip())
    K = int(inputdata().strip())
    sensor_ls = list(map(int, inputdata().split()))
    
    fnMinimumDistance(N, K)
