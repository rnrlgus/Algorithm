n, m = map(int, input().split())
x, y, dir = map(int, input().split())

# 방문한 위치 저장용 map
visited = [[0]* m for _ in range(n)]
visited[x][y] = 1

world_map = []
for i in range(n):
    world_map.append(list(map(int, input().split())))

#북 동 남 서
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def turn_left():
    global dir
    dir -= 1
    if dir == -1:
        dir = 3

# 시뮬레이션 시작
count = 1
turn_time = 0

while 1:
    print(x, y)
    turn_left()
    nx = x + dx[dir]
    ny = y + dy[dir]
    
    if visited[nx][ny] == 0 and world_map[nx][ny] == 0:
        x, y = nx, ny
        turn_time = 0
        visited[x][y] = 1
        count += 1
        
    else:
        turn_time += 1
        
    if turn_time == 4:
        nx = x - dx[dir]
        ny = y - dy[dir]
        if world_map[nx][ny] == 0:
            x, y = nx, ny
        else:
            break
        turn_time = 0
        
print(count)   
# --------------------------------------------------
for i in range(n):
    print(world_map[i])
print("------------------------------")
for i in range(n):
    
    print(visited[i])


# map 함수의 반환 값은 map 객체이기 때문에 사용할 때 list 혹은 tuple로 변환해줘야 한다.
# 핵심은 방문했던 곳을 체크하는 리스트, 지형을 표시하는 리스트를 각각 만들어 조건문을 작성해야 한다는 점이다.
# 문제의 조건을 잘 파악하지 못하면 좆된다. 1시간이면 풀 거 3시간 걸렸다..
# visited = [[0]* m for _ in range(n)]
print("-------------------------")
a = [0]*m
print(a)