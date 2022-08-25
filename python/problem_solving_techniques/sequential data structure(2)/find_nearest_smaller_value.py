# 스택의 역할을 하는 리스트(tmp)를 사용했다.
# 반복문을 사용해 리스트 A의 각 원소들에 대하여
# (1) 스택 tmp가 비어있지 않을 때 && tmp의 top 값이 A[i]보다 크거나 같을 때
#     계속해서 tmp.pop()
# (2) tmp가 비어있다면 결과 저장용 리스트 B에 0을 append
# (3) tmp에 값이 있다면 tmp의 top 값을 B에 append
# (4) 반복할 때마다 tmp에 A[i]값 push

# 이렇게 구현했을 때 n번 반복하기 때문에 O(n), 
# 내부에서 조건문에 따라 tmp를 반복해서 pop하지만 Amortized O(1)
# 따라서 시간복잡도는 Amortized O(n)이다.

def solution(A, n):
    B = [] # result
    tmp = [] # push / pop (stack)
    
    for i in range(n):
        while len(tmp) > 0 and tmp[-1] >= A[i]:
            tmp.pop()
        
        if len(tmp) == 0:
            B.append(0)
        else:
            B.append(tmp[-1])
            
        tmp.append(A[i])
        
    return B

# main
n = int(input())
A = list(map(int, input().split()))
B = solution(A, n)
for i in B:
    print(i, end=" ")