import sys
inputdata = sys.stdin.readline  # 입력을 표준 입력에서 읽을 수 있도록 설정

# 출입 기록을 확인하는 함수
def checkAttendanceStatus(n):
    employeeStatus = {}  # 사람의 현재 상태를 저장할 딕셔너리

    for _ in range(n):
        name, action = inputdata().split()  # 이름과 출입 상태를 입력에서 읽음
        if action == "enter":
            employeeStatus[name] = "in"  # "enter"인 경우 출근 상태로 변경
        else:
            employeeStatus[name] = "out"  # "leave"인 경우 퇴근 상태로 변경
    return employeeStatus

# 현재 회사에 있는 사람들을 사전 순으로 역순 정렬하는 함수
def sortReverseOrder(employeeStatus):
    currentEmployees = [name for name, status in employeeStatus.items() if status == "in"]  # 현재 출근한 사람들 필터링
    currentEmployees.sort(reverse=True)  # 사전 순으로 역순 정렬
    
    return currentEmployees

if __name__ == "__main__":
    n = int(inputdata())  # 출입 기록의 수를 읽음

    employeeStatus = checkAttendanceStatus(n)  # 출입 기록을 확인하여 사람의 상태를 저장

    currentEmployees = sortReverseOrder(employeeStatus)  # 현재 회사에 있는 사람들을 정렬

    for name in currentEmployees:  # 사전 순으로 역순된 현재 사람들을 출력
        print(name)
