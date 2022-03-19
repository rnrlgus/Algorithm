from itertools import combinations

def solution(n, A):
    cnt = 0
    combination = list(combinations(A, 3))
    for i in combination:
        tmp = list(i)
        tmp.sort()
        #print(tmp)
        if tmp[0] < tmp[1] and tmp[1] < tmp[2]: # 1번조건
            if (tmp[1] - tmp[0]) <= (tmp[2] - tmp[1]) and (tmp[2] - tmp[1]) <= 2 * (tmp[1] - tmp[0]): # 2번조건
                cnt += 1
    
    return cnt


# main
n = int(input())
A = []
for i in range(n):
    A.append(int(input()))
    
print(solution(n ,A))