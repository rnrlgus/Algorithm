
# O(n)
def isRainbow(PP):
    checkColor = [0 for _ in range(k)]
    
    for i in PP:
        checkColor[i-1] = 1
    if 0 not in checkColor:
        return True
    return False

def solution():
    global first,last
    global result
    # 만족하는 result 나올 때까지
    for i in dots:
        result.append(i)
        last += 1
        if isRainbow(result):
            break
    #print("prev result: ", result)
    # 앞에서부터 필요없으면 지우기
    
    while isRainbow(result[1:]):
        first += 1
        result = result[1:]
    #print("next result: ",result)
    

#main
n, k = map(int, input().split())
dots = []
for i in range(n):
    dots.append(int(input()))

PP = [] # P prime
colors = []
for i in range(k):
    colors.append(i+1)

#checkColor = [0 for _ in range(k)]

result = []
first , last = 0,-1 # P 프라임의 시작, 끝 인덱스

solution()

left = []
for i in range(first):
    left.append(dots[i])
for i in range(last+1, n):
    left.append(dots[i])

#print("left: ",left)
#print(first, last) 
if isRainbow(left):
    print(len(result))
    #print("final: ",len(result))
else:
    print(0)
    #print("fianl: ",0)

# print("n, k: ",n, k)
# print("dots: ",dots)
# print("colors: ",colors)
# print("checkColor: ",checkColor)
# print("result: ", result)