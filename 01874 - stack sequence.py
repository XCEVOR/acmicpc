import sys
inputdata = sys.stdin.readline

def fnCreatingSequenceWithAscendingStack(given_sequence):
    stacking_box = []
    pushpop = []
    stack_count = 1
    for seq in given_sequence:
        # print(f'seq: {seq}')          # test print
        
        while stack_count <= seq:
            # print(f'stack_count: {stack_count}')            # test print
            
            stacking_box.append(stack_count)
            # print(f'pushed_stacking_box: {stacking_box}')         # test print
            pushpop.append("+")
            stack_count += 1
            
        if seq == stacking_box[-1]:
            stacking_box.pop()
            # print(f'popped_stacking_box: {stacking_box}')         # test print
            pushpop.append("-")
        else:
            return "N"
            
    # print(f'pushpop: {pushpop}')          # test print
    return pushpop


if __name__ == "__main__":
    n = int(inputdata().strip())
    given_sequence = []
    for _ in range(n):
        given_sequence.append(int(inputdata().strip()))
    
    # print(given_sequence)           # test print
    
    result = fnCreatingSequenceWithAscendingStack(given_sequence)
    for r in result:
        if r == "N":
            print("NO")
        else:
            print(r)
