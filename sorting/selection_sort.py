# 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고, 그 다음 작은 데이터를 선택해 앞에서 두번째 데이터와 바꾸는 과정을 반복
data = [7,5,9,0,3,1,6,2,4,8]

for i in range(len(data)):
    min_index = i
    for j in range(i+1, len(data)):
        if data[min_index] > data[j]:
            min_index = j
    data[i], data[min_index] = data[min_index], data[i]
    
    
print(data)

# 0번 인덱스 값과 1번~ 마지막까지 중 최소 값을 swap
# 1번 인덱스 값과 2번~ 마지막까지 중 최소 값을 swap
# 반복 

# O(N**2)