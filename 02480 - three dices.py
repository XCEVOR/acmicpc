a, b, c = map(int, input().split())
dice = [a, b, c]

if max(dice) == min(dice):
    print(10000 + max(dice) * 1000)
elif a == b or b == c or c == a:
    if a == b:
        print(1000 + a * 100)
    elif b == c:
        print(1000 + b * 100)
    elif c == a:
        print(1000 + c * 100)
else:
    print(max(dice) * 100)