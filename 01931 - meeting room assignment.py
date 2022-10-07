import sys
inputdata = sys.stdin.readline

N = int(inputdata().strip())

timetable = []
for _ in range(N):
    meeting = tuple(map(int, inputdata().split()))
    timetable.append(meeting)

print(f'timetable origin: {timetable}')          #

timetable.sort(key = lambda x : (x[0]))
timetable.sort(key = lambda x : (x[1]))

print(f'timetable sorted: {timetable}')          #

count = 0
meeting_end = 0
for i in range(len(timetable)):
    if timetable[i][0] >= meeting_end:
        count += 1
        meeting_end = timetable[i][1]
        
        print(f'timetable tuple: {timetable[i]}')           #
    
print(count)



# 7
# 3 10
# 2 2
# 1 3
# 2 2
# 9 10
# 4 9
# 2 2

# timetable origin: [(3, 10), (2, 2), (1, 3), (2, 2), (9, 10), (4, 9), (2, 2)]
# timetable sorted: [(2, 2), (2, 2), (2, 2), (1, 3), (4, 9), (3, 10), (9, 10)]
# timetable tuple: (2, 2)
# timetable tuple: (2, 2)
# timetable tuple: (2, 2)
# timetable tuple: (4, 9)
# timetable tuple: (9, 10)
# 5
