import sys
inputdata = sys.stdin.readline


# 8진수를 2진수로 변환하는 함수 정의
def octal_to_binary(octal_number):
    # 8진수를 10진수로 변환
    decimal_number = int(octal_number, 8)
    
    # 10진수를 2진수로 변환하되, '0b' 접두사를 제외하여 저장
    binary_number = bin(decimal_number)[2:]
    
    # 변환된 2진수 반환
    return binary_number

if __name__ == "__main__":
    # 8진수 입력 받기
    octal_number = inputdata().strip()
    
    # 8진수를 2진수로 변환
    binary_number = octal_to_binary(octal_number)
    
    # 변환된 2진수 출력
    print(binary_number)
