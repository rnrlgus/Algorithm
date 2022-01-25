# 삽입 정렬의 경우 필요할 때만 위치를 바꾸기 때문에 데이터가 가의 정렬 되어있을 때 효율적이다.
data = [7,5,9,0,3,1,6,2,4,8]

for i in range(1, len(data)):
    for j in range(i, 0, -1):
        if data[j-1] > data[j]:
            data[j-1], data[j] = data[j], data[j-1]
        else:
            break
            
print(data)

# 0번 인덱스의 값을 기준으로 1번 인덱스의 값을 적절한 위치에 넣는다.
# 2번 인덱스도 위와 같은 방식으로 넣는다.
# 앞과 같이 반복해 마지막 인덱스의 값을 적절한 위치에 넣으면 정렬 끝

# 최약의 경우 : O(n**2) / 최선의 경우 O(n)