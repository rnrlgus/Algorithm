# 파이썬의 itertools 라이브러리의 permutations 함수를 사용했다.
# 앞의 함수의 시간복잡도는 n!이다.
# 반복문을 사용해 각 순열들 중 조건에 맞는 순열이 있을 때 cnt += 1함으로써 조건에 맞는 조합을 찾았다. O(n)

from itertools import permutations

def checkABC(tmp):
    if tmp[0] < tmp[1] and tmp[1] < tmp[2]: # 1번조건
            if (tmp[1] - tmp[0]) <= (tmp[2] - tmp[1]) and (tmp[2] - tmp[1]) <= 2 * (tmp[1] - tmp[0]): # 2번조건
                return True
    return False

def solution(n,A):
    cnt = 0
    pm = permutations(A, 3)
            
    for i in pm:
        if checkABC(i) == True:
            cnt += 1
    
    return cnt


# main
n = int(input())
A = []
for i in range(n):
    A.append(int(input()))
    
print(solution(n, A))