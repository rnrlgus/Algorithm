def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        if array[mid] == target:
            return mid
        elif array[mid] > target:
            end = mid-1
        else:
            start = mid+1
    return None # == return 

n, target = 10, 7
array = [1,3,5,7,9,11,13,15,17,19]

result = binary_search(array, target, 0, len(array)-1)

if result == None:
    print("원소가 없음")
else:
    print(result+1) 