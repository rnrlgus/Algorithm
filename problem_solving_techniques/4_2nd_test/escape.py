def solution():
    result = 0
    
    for i in range(u):
        for j in range(m):
            tmp1 = u_holes[i] - m_holes[j]
            for k in range(l):
                tmp2 = m_holes[j] - l_holes[k]
                
                if tmp1 == tmp2:
                    result += 1
                    break
                    #print(tmp1, tmp2)
                    
    return result
                

# main
u = int(input())
u_holes = list(map(int, input().split()))
m = int(input())
m_holes = list(map(int, input().split()))
l = int(input())
l_holes = list(map(int, input().split()))

# print(u,m,l)
# print(u_holes, m_holes, l_holes)

print(solution())

