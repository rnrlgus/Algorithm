# solution_1 (binary_search)
# --------------------------------------------------------------------------------------------------
def binary_search(array, target, start, end):
    if start > end:
        return 
    
    mid = (start + end) // 2
    if array[mid] == target:
        return mid
    elif array[mid] > target:
        return binary_search(array, target, start, mid-1)
    else:
        return binary_search(array, target, mid+1, end)
    
# def binary_search(array, target, start, end):
#     while start <= end:
#         mid = (start + end) // 2
#         if array[mid] == target:
#             return mid
#         elif array[mid] > target:
#             end = mid-1
#         else:
#             start = mid+1
#     return 

n = int(input())
l1 = list(map(int, input().split()))
l1.sort()

m = int(input())
l2 = list(map(int, input().split()))

for i in l2:
    result = binary_search(l1, i, 0, len(l1)-1)
    if result == None:
        print("No", end=' ')
    else:
        print("Yes", end=' ')
        
# --------------------------------------------------------------------------------------------------

# solution_2 (계수 정렬)
n = int(input())
array = [0]*1000001

for i in input().split():
    array[int(i)] =1

m = int(input().split())
l = list(map(int, input().split()))

for i in l:
    if array[i] == 1:
        print("Yes", end=' ')
    else:
        print("No", end=' ')