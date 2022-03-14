# 먼저 파이썬 내장 함수 sort()를 사용했다. O(nlog(n))
# 리스트를 오름차순으로 정렬한 후 반복문을 사용해 2씩 간격을 두며 값을 swap했다. (n)
# A[i], A[i+1] = A[i+1], A[i]

# 따라서 수행시간은 O(nlog(n))을 보장한다.


def solve(A):
	# return a list B such that B[0] <= B[1] >= B[2] <= B[3] ...
	A.sort() # 오름차순 정렬
	
	for i in range(1, len(A)-1, 2):
		A[i], A[i+1] = A[i+1], A[i]
	
	return A
