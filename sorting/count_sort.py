# 계수정렬
array = [7,5,9,0,3,1,6,2,9,1,4,8,0,5,2]

count = [0] * (max(array) +1)

for i in array:
    count[i] += 1

for i in range(len(count)):
    for j in range(count[i]):
        print(i, end=', ')
        
# 계수 정렬의 경우 데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때만 사용 가능하다.
# array의 크기 +1 만큼의 count 리스트를 생성하고 각 인덱스에 array리스트에 포함된 개수를 넣어준 뒤 출력하는 방식이다.
# 데이터의 개수가 N, 최대값이 K일 때 O(N+K)를 보장한다.