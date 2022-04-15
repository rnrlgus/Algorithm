import itertools

def solution():
    result = 0
    tmp = []
    for i in range(n):
        #print(i)
        tmp.append(i)
    
    triples = list(itertools.permutations(tmp, 3))
    
    for i in range(len(triples)):
        if P[triples[i][0]] < P[triples[i][1]] < P[triples[i][2]] and Q[triples[i][0]] < Q[triples[i][1]] < Q[triples[i][2]]:
            result += 1 
            
    return result

# main
n = int(input())
P = list(map(int, input().split()))
Q = list(map(int, input().split()))

print(solution())