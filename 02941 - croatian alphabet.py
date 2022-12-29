import sys
inputdata = sys.stdin.readline


def fnNumberOfCroAlph(word):
    croationalph_ls = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
    for cr in croationalph_ls:
        word = word.replace(cr, '@')
    
    # print(word)         # TEST PRINT
    print(len(word))


if __name__ == "__main__":
    word = str(inputdata().strip())
    
    fnNumberOfCroAlph(word)
