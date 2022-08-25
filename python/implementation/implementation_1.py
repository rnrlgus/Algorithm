n = int(input())
plans = input().split()

# L R U D
move_types = ['L', 'R', 'U', 'D']
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
nx, ny = 0, 0
x, y = 1, 1

for plan in plans:
    for i in range(len(move_types)):
        if (move_types[i] == plan):
            nx = x + dx[i]
            ny = y + dy[i]
        if (1 > nx or 5 < nx or 1 > ny or 5 < ny ):
            continue
        x, y = nx, ny
        
print(x, y)

# 예외처리할 때 임시 변수 활용하기
# 격자점 활용하기 move_types / dx / dy
# continue, pass의 차이점 자꾸 까먹는다. pass는 무의미 에러 안뜨게 하는 용도, continue는 다음 루프로 이동시키는 용도