# 먼저 오름차순의 리스트가 rotate되면서 무조건 오름차순이 깨지는 부분이 한 곳 발생하게 된다. 
# 앞의 오름차순이 깨지는 부분의 인덱스를 찾으면 이를 통해 rotation 횟수를 알 수 있다.

# 그냥 리스트를 n번 반복해서 조건을 만족하는 부분의 인덱스를 찾으면 쉽지만 실행 시간을 단축하기 위해 이진탐색을 사용했다.

#시간복잡도 : O(log(n)) (이진탐색을 했기 때문)
def solution(A):
	n = len(A)
	start, end = 0, n-1 # 탐색 범위를 좁혀나가기 위한 변수들
	
	while start <= end: # O(log(n))
		mid = (start + end) // 2 
		prev = mid - 1
		nxt = mid + 1
		
		if A[prev] > A[mid]: # 오름차순이 깨질 때(mid와 그 전 원소(prev)비교)
			return n - mid 
		if A[mid] > A[nxt]: # 오름차순이 꺠질 때 (mid와 그 다음 원소(nxt)비교)
			return n - nxt
		#문제에서 왼쪽으로 rotate한 횟수를 원하기에 n에서 각 값을 뺀 값 리턴
		
		# 탐색한 mid의 앞 뒤로 문제가 없을 때 탐색 범위 조정
		elif A[start] > A[mid]:
			end = mid-1
		elif A[mid] > A[end]:
			start = mid + 1
			
		#앞의 조건문에 해당하지 않을 경우는 리스트가 오름차순으로 정렬된 상태이기에 0 리턴
		else:
			return 0
			
	# main
A = list(map(int, input().split()))
print(solution(A))