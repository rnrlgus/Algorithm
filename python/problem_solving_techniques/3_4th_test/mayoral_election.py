    # 먼저 후보별 득표수를 저장할 딕셔너리를 선언한다.

    # 그리고 반복문을 사용해 각 후보를 의미하는 key값에 대한 value(득표수)를 갱신해준다.
    # 이 과정의 경우 평균적으로 O(n)을 보장하고 최악의 경우O(n**2)를 보장한다.
    # ( 딕셔너리의 in 연산의 경우 hash를 통해 값을 저장함으로 접근하는 시간은 O(1), but 해쉬의 충돌이 많아 성능이 떨어지는 경우 O(n) )

    # 마지막으로 딕셔너리의 원소 중 최대 value(득표수) 값을 찾는다.
    # 이 과정의 경우 max(dict, key = dict.get) 에서 dict.get에 O(1), max에서 O(n)을 보장한다 
    # 즉 총 O(n)을 보장 

    # 이후에는 득표수가 과반수를 넘는지 체크한 후 return 
    # O(1)

    # 따라서 총 시간복잡도는 평균적으로 O(n) 최악의 경우 O(n**2)이다.

def solution(n ,A):
    dict = {} # 후보별 득표수를 저장할 딕셔너리
    for i in range(n): # O(n)
        # 딕셔너리의 in 연산의 경우 hash를 통해 값을 저장함으로 접근하는 시간은 O(1), but 해쉬의 충돌이 많아 성능이 떨어지는 경우 O(n)
        # 평균적으로 O(1) worst O(n) 
        if A[i] not in dict: 
            dict[A[i]] = 1 # O(1)
        else:
            dict[A[i]] += 1 # O(1)
    
    # dict의 원소 중 최대 value의 key 찾기
    # dict.get의 경우 O(1), max 함수의 경우 O(n)
    # 총 O(n)
    maximum = max(dict, key = dict.get)
    
    # 과반수 넘는지 확인 
    # O(1)
    if dict[maximum] > (n/2):
        return maximum
    else:
        return -1

# main
n = int(input())
A = list(map(int, input().split()))

print(solution(n, A))
