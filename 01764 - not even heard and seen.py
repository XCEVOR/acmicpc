import sys

# sys.stdin.readline을 사용하여 한 번에 여러 줄을 읽고 대용량 입력을 빠르게 처리
inputdata = sys.stdin.readline


# 입력 데이터를 받아서 딕셔너리로 저장하는 함수
def recordInputData(number):
    tempGroupDict = {}
    for _ in range(number):
        name = inputdata().strip()
        tempGroupDict[name] = True
    return tempGroupDict

# 중복된 이름을 찾는 함수
def findDuplicateNames(notEvenHeard, notEvenSeen):
    duplicateNames = [name for name in notEvenHeard if name in notEvenSeen]
    duplicateNames.sort()
    return duplicateNames

if __name__ == "__main__":
    # 첫번째 그룹과 두번째 그룹의 사람 수 입력
    N, M = map(int, inputdata().split())
    
    # 두 그룹의 이름을 저장할 딕셔너리 초기화
    notEvenHeard = {}
    notEvenSeen = {}
    
    # 첫번째 그룹의 이름 입력 및 저장
    notEvenHeard = recordInputData(N)
    
    # 두번째 그룹의 이름 입력 및 저장
    notEvenSeen = recordInputData(M)
    
    # 중복된 이름 찾기
    duplicateNames = findDuplicateNames(notEvenHeard, notEvenSeen)
    
    # 중복된 이름 개수와 명단 출력
    print(len(duplicateNames))
    for name in duplicateNames:
        print(name)
