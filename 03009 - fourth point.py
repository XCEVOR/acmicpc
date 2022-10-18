import sys
inputdata = sys.stdin.readline

import collections


def fnFourthPoint(xycoordinates_array):
    x_dictionary = dict(collections.Counter(xycoordinates_array[0]))
    y_dictionary = dict(collections.Counter(xycoordinates_array[1]))
    print(f'x_dictionary: {x_dictionary}')           # test print
    print(f'y_dictionary: {y_dictionary}')           # test print
    
    
    reverse_x_dict = dict(map(reversed, x_dictionary.items()))
    reverse_y_dict = dict(map(reversed, y_dictionary.items()))
    print(f'reverse_x_dict: {reverse_x_dict}')           # test print
    print(f'reverse_y_dict: {reverse_y_dict}')           # test print
    
    
    # one_x_key = {x_crd for x_crd in x_dictionary if x_dictionary[x_crd] == 1}         # for 문으로 value = 1 에 대한 key 찾기
    # one_y_key = {y_crd for y_crd in y_dictionary if y_dictionary[y_crd] == 1}         # for 문으로 value = 1 에 대한 key 찾기
    
    print(f'reverse_x_dict[1] key 가 1 인 value: {reverse_x_dict[1]}')            # key 가 1 인 value
    print(f'reverse_y_dict[1] key 가 1 인 value: {reverse_y_dict[1]}')            # key 가 1 인 value
    return reverse_x_dict[1], reverse_y_dict[1]


xycoordinates_array = [[None for coord in range(3)] for xy in range(2)]
for i in range(3):
    xycoordinates_array[0][i], xycoordinates_array[1][i] = map(int, inputdata().split())

print()           # test print
print(f'xycoordinates_array: {xycoordinates_array}')           # test print

result = fnFourthPoint(xycoordinates_array)
print()           # test print
print(*result)



# 30 20
# 10 10
# 10 20

# xycoordinates_array: [[30, 10, 10], [20, 10, 20]]
# x_dictionary: {30: 1, 10: 2}
# y_dictionary: {20: 2, 10: 1}
# reverse_x_dict: {1: 30, 2: 10}
# reverse_y_dict: {2: 20, 1: 10}
# reverse_x_dict[1] key 가 1 인 value: 30
# reverse_y_dict[1] key 가 1 인 value: 10

# 30 10
