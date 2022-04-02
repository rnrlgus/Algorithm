
# L = 강의 폭
# n = 돌의 개수
# k = 뺄 수 있는 돌의 개수
# S = 돌들의 위치
def solution(L, n, k, S):
    rocks = [0] + S + [L]
    
    # 가능한 간격 볌위 1 ~ L
    start = 1 
    end = L
    while start < end: 
        mid = (start + end) // 2 # 간격 중 최대값
        cnt = 0 # 제거하는 돌의 개수 (k)
        
        # ------
        prev_rock = 0 # index
        removed_rock = 1 # index
        while removed_rock <= len(rocks) - 1:
            if rocks[removed_rock] - rocks[prev_rock] < mid:
                cnt += 1
                removed_rock += 1
            else:
                prev_rock = removed_rock
                removed_rock += 1
        # ------
        if cnt > k:
            end = mid
        else:
            start = mid + 1
    print(start-1)


# main
# L, n, k = map(int, input().split())
# S = list(map(int, input().split()))

L, n, k = 12, 4, 1
S = [2,4,5,8]
solution(L, n, k, S)