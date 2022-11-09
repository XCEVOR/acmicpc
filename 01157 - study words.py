import sys
inputdata = sys.stdin.readline

def fnCountAlphabet(word_up):
    word_up_ls = list(word_up)
    # print(word_up_ls)           # test print
    
    word_up_ls_set = set(word_up_ls)
    # print(word_up_ls_set)           # test print
    
    count_ls = []
    for ws in word_up_ls_set:
        count_ls.append([ws, word_up_ls.count(ws)])
    # print(count_ls)         # test print
    
    count_ls.sort(key = lambda x: -x[1])
    # print(count_ls)         # test print
    if len(count_ls) == 1:
        return count_ls[0][0]
    elif count_ls[0][1] == count_ls[1][1] and len(count_ls) > 1:
        return "?"
    else:
        return count_ls[0][0]


if __name__ == "__main__":
    word = str(inputdata().strip())
    # print(word)         # test print
    word_up = word.upper()
    # print(word_up)          # test print
    
    result = fnCountAlphabet(word_up)
    print(result)
