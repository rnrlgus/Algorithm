# 최초에 시도한 방법은 입력받은 리스트 A의 prefix_sum(0번 인덱스부터 끝까지의 누적 구간 합)값들을
# 리스트 prefix_sum에 저장한 후 이중 반복문(i, j)을 사용해 prefix_sum의 두 인덱스의 차(prefix_sum[j] - prefix_sum[i])의 값 중 
# 목푶 구간 합과 같은 값이 있을 때 True를 반환하도록 코드를 작성했다.
# if prefix_sum[j] - prefix_sum[i] == k: return True 
# 하지만 위의 알고리즘의 경우 O(n**2)로 테스트 케이스 중 일부에서 timeout이 발생해 다른 방법을 생각해보았다.

# <답> 시간복잡도 : 평균적으로 O(n)
# 먼저 앞의 prefix_sum 리스트와 의미가 같은 prefix_sum_dict dictionary를 선언했다.
# 그리고 반복문을 사용해 앞의 딕셔너리의 각 key값에 prefix_sum값, value값에 1을 넣었다. 
# 딕셔너리 내에 원하는 key값이 있는지 확인할 때 평균적으로 O(1)내에 가능하기 때문에 딕셔너리를 사용했다.

# 마지막으로 반복문 내에서 prefix_sum_dict 내에 (prefix_sum - k)의 값이 있을 때 True를 반환해주고 없을 때 False를 반환해줬다.
# 왜냐하면 누적 구간합 값 prefix_sum에서 목표 구간 합 k를 뺀 값이 prefix_sum_dict에 존재한다는 말은 목표 구간 합 k 또한 존재한다는 것을 의미하기 때문이다.

def solution(A, k): # 리스트, target sum
    prefix_sum_dict = {}
    prefix_sum = 0
    for i in A:
        prefix_sum += i
        prefix_sum_dict[prefix_sum] = 1
    
        if prefix_sum - k in prefix_sum_dict:
            return True
    
    return False            

# main
n, k = map(int, input().split()) # 정수 개수, target sum
A = list(map(int, input().split())) # 정수 리스트

if solution(A, k) == True:
    print("True")
else:
    print("False")