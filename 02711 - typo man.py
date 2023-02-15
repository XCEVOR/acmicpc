import sys
inputdata = sys.stdin.readline


def fnDeleteTypo(position, text):
    resultText = ""
    i = 1
    for t in text:
        if i != int(position):
            resultText += t
        i += 1
    
    print(resultText)


if __name__ == "__main__":
    tCase = int(inputdata().strip())
    
    for _ in range (tCase):
        position, text = map(str, inputdata().split())
        
        fnDeleteTypo(position, text)
