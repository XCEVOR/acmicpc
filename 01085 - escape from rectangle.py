import sys

x, y, w, h = map(int, sys.stdin.readline().split())

distance_diff_all = [x, y, w - x, h - y]

print(min(distance_diff_all))

