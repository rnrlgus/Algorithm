# 피벗을 활용한 정렬법 O(n*log(n))

data = [5,7,9,0,3,1,6,2,4,8]

def quick_sort_1(array, start, end):
    if start >= end: # 리스트 길이가 1일 때 종료
        return 0
    
    pivot = start
    left = start + 1
    right = end
    
    while left <= right:
        # 피벗보다 큰 값 찾을 때까지 반복
        while left <= end and array[left] <= array[pivot]:
            left += 1
        # 피벗보다 작은 값 찾을 때까지 반복
        while right > start and array[right] >= array[pivot]:
            right -= 1
            
        if left > right: # 엇갈렸을 때
            array[right], array[pivot] = array[pivot], array[right]
        else:
            array[right], array[left] = array[left], array[right]
    
    quick_sort_1(array, start, right-1)
    quick_sort_1(array, right + 1, end)
    
    
quick_sort_1(data, 0, len(data)-1)
print(data)

# ----------------------------------------------------------------------------------------------------------------

data = [5,7,9,0,3,1,6,2,4,8]

def quick_sort_2(array):
    if len(array) <= 1:
        return array
    
    pivot = array[0]
    tail = array[1:] # 피벗을 제외한 리스트
    
    left_side = [x for x in tail if x <= pivot]
    right_side = [x for x in tail if x > pivot]
    
    return quick_sort_2(left_side) + [pivot] + quick_sort_2(right_side)

    
print(quick_sort_2(data))    