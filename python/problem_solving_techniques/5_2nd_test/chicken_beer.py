
def solution():
    #if 
    pass


# main
# 후라이드, 양념 하나 먹는데 걸리는 시간 / 정해진 시간
a, b, t = map(int, input().split()) 

aList = [a]
bList = [b]

cnt = 2
while(aList[-1] < t):
    if aList[0]*cnt > t:
        break
    aList.append(aList[0]*cnt)
    cnt+=1
    
cnt = 2
while(bList[-1] < t):
    if bList[0]*cnt > t:
        break
    bList.append(bList[0]*cnt)
    cnt+=1

print(aList)
print(bList)

sumList = []
chickenNum = 0

aaaa, bbbb = 0,0
for i in aList:
    for j in bList:
        sum = i + j
        if i + j <= t:
            sumList.append(sum)
        if i + j == t:
            aaaa, bbbb = i, j
print(sumList)
print(aaaa, bbbb)

if t in sumList:
    print(i+j)
    