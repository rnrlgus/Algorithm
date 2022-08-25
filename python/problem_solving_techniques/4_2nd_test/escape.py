# 먼저 처음에는 u, m, l 각 리스트를 모두 순회하도록 코드를 작성했다. 
# 조건문에는 u, m, l에서 u, m / m, l의 차가 같을 때 결과 값을 의미하는 result의 값을 1씩 증가시켰다. 
# 앞처럼 했을 때는 O(uml)이고 시간복잡도가 너무 효율적이지 못해 다른 방법을 생각해봤다. 

# u와 m리스트를 통해 각 순서쌍에서의 값의 차를 구해 m에 그 값을 더한 값이 l 리스트에 존재하는지만 확인을 하면 된다고 생각했기에
# l리스트를 x좌표 값으로 표현한 리스트를 만들었다. (-30000 ~ 30000 리스트의 인덱스 중 l에 존재하는 값의 인덱스 값을 1로 설정)
# 예를들어 l 리스트가 [-1, 0, 1]이라면 [0,0,0,0........1(-1),1(0),1(1),, .........., 0,0,0,0,0,0,] l의 각 값에 30000을 더해 다루기 편하도록 조정했다.
# 이렇게 하면 O(um)만에 해결이 가능하다.

# 시간복잡도 : O(um)

def solution():
    result = 0

    l_list = [0] * 70000 # -30000 ~ 30000 (x좌표 리스트)
    
    for i in range(l): # 음수 처리하기위해 30000씩 더해줌 **즉 원하는 숫자 + 30000으로 탐색** # O(l)
        l_list[30000 + l_holes[i]] = 1
    
    for i in range(u): # O(u)
        for j in range(m): #O(m)
            tmp = m_holes[j] - u_holes[i]
            
            if l_list[m_holes[j] + tmp + 30000] == 1:
                #print(u_holes[i], m_holes[j], tmp)
                result += 1
                
    return result
                

# main
u = int(input())
u_holes = list(map(int, input().split()))
m = int(input())
m_holes = list(map(int, input().split()))
l = int(input())
l_holes = list(map(int, input().split()))

print(solution())

