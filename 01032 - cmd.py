import sys
inputdata = sys.stdin.readline


def fnFindCommand():
    character_ls = list(zip(*file_ls))
    # print(character_ls) ## TEST PRINT
    
    command_str = ""
    for ch in character_ls:
        if len(set(ch)) == 1:
            command_str += ch[0]
        else:
            command_str += "?"
    
    return command_str


if __name__ == "__main__":
    files = int(inputdata().strip())
    file_ls = [list(map(str, inputdata().strip())) for _ in range (files)]
    # print(file_ls) ## TEST PRINT
    
    result = fnFindCommand()
    print(result)
