# 좀비들을 이동시키며 충돌했을 때 방향을 바꿔주고, 떨어졌을 때 리스트에서 삭제하는 것을 반복하는 방식으로 문제를 해결했다.
# 떨어진 좀비들을 result 리스트에 차례대로 추가한 후 최후에 result 리스트의 k-1번 인자 값(답)을 출력했다.

# 좀비들이 충돌했을 때 방향을 바꿔주는 것이 중요했다.
# 먼저 두 좀비가 같은 위치에 있을 때는 두 좀비의 방향만 바꿔줬고, 두 좀비 사이의 거리가 1일 때 1초 뒤의 상황을 부여했다.(두 좀비의 위치는 그대로인데 방향만 반대를 향하게)

# <시간복잡도>
# 시간복잡도의 경우 외부의 while 반복문에서 떨어진 좀비들의 리스트의 길이가 k가 될 때 까지 반복했기에 O(k)이고, 
# while 내부 코드의 반복문의 경우 모두 O(n)을 보장하기에 전체 시간복잡도는 O(kn)이다. 

def solution(L, k, zombies):
    while len(fallen_zonmbies) < k: # 떨어진 좀비의 수가 k가 될 때 반복 종료 O(k)
        tmp = [] # 마주보고 한칸 떨어져 있는 좀비들 제외할 때 사용할 리스트
        
        # 두 좀비를 비교해서 서로 마주보고 한칸 떨어져 있을 때 위치 냅두고 방향만 바꾸기 위해 tmp에 인덱스 저장
        for i in range(len(zombies)-1): #O(n)
            if zombies[i][1] > 0 and zombies[i+1][1] < 0: # 마주볼 때 
                if zombies[i+1][0] - zombies[i][0] == 1: # 1칸 떨어져 있을 때
                    tmp.append(zombies[i]) # O(1)
                    tmp.append(zombies[i+1]) # O(1)
        
        # 1칸씩 진행 
        for i in range(len(zombies)): # O(n)
            if zombies[i] not in tmp: # tmp에 있는 인덱스 제외하고 진행
                if zombies[i][1] > 0: # 오른쪽
                    zombies[i][0] += 1
                if zombies[i][1] < 0: # 왼쪽
                    zombies[i][0] -= 1
                    
            if zombies[i] in tmp: # tmp에 있는 경우 방향만 바꾸기
                zombies[i][1] = -zombies[i][1]
                
            
        # 떨어졌을 때 fallen 리스트에 추가
        fallen_tmp = []
        ttmp = [] # 떨어질 좀비의 최초 id를 얻기 위한 임시 리스트 
        for i in range(len(zombies)): # O(n)
            if zombies[i][0] < 0 or zombies[i][0] > L:
                fallen_tmp.append(zombies[i])

        for i in fallen_tmp: # 이중 for문이지만 n번 x 2번이기에 O(n) (한번에 떨어지는 좀비 수의 최대값이 2이기 때문)
            for j in initial_dir: # O(n)
                if abs(i[1]) == abs(j):
                    ttmp.append([i[0], j])
                    
        ttmp.sort(key= lambda x:x[1])
        
        for i in ttmp: # O(1) (떨어질 좀비의 최대값이 2이기 때문)
            result.append(i)
        
        for i in fallen_tmp: # O(1) (떨어질 좀비의 최대값이 2이기 때문)
            fallen_zonmbies.append(i)
        
        for i in fallen_zonmbies: # O(n) (떨어질 좀비의 최대값이 2이기 때문)
            if i in zombies:
                zombies.remove(i) # O(n)
        
        # 위치가 같을 때 방향만 바꾸기
        for i in range(len(zombies)-1): # O(n)
            if zombies[i][0] == zombies[i+1][0]: 
                zombies[i][1], zombies[i+1][1] = -zombies[i][1], -zombies[i+1][1]
    

# main
n, L, k = map(int, input().split()) # 좀비 수 / 길의 길이 / k번째로 떨어질 좀비 id 출력
zombies = [] # ex) [19,-1] : 1번 좀비의 초기 위치: 19 / 아이디가 음수이기에 첫 이동 방향은 왼쪽
for _ in range(n):
    zombies.append(list(map(int, input().split())))
fallen_zonmbies = [] # 떨어진 좀비들 차례대로 append
result = [] # 떨어진 좀비들의 최초 id값을 저장할 리스트
initial_dir = [] # 최초의 방향을 알기 위해 선언한 임시 리스트

for i in zombies: # 최초의 좀비들의 id (한번에 좀비 두마리가 떨어질 때 id가 작은 순으로 떨어지게 하기 위한 도구) O(n)
    initial_dir.append(i[1])

solution(L, k, zombies) # O(kn)
print(result[k-1][1])

