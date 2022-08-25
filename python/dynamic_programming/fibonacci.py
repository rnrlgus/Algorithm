def fibo_1(x):
    if x == 1 or x == 2:
        return 1
    else:
        return fibo(x-1) + fibo(x-2)
    
    
    

mem = [0]*100  
mem[1], mem[2] = 1, 1  
def fibo_2(x):
    if x == 1 or x == 2:
        return 1
    if mem[x] != 0:
        return mem[x]
    mem[x] = fibo_2(x-1) + fibo_2(x-2)
    
    return mem[x]

print(fibo_2(99))
print(mem)