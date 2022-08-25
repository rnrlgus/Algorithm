# 먼저 알고리즘의 경우 반복문과 리스트 슬라이싱을 사용해 최소값을 구할 k개의 원소를 가진 리스트를 구했고
# 문제는 앞의 k개의 원소 중 최소값을 구하는 법이다.

# 먼저 리스트로 시도해보았을 때 예상했듯이 몇개의 테스트케이스에서 timeout 발생
# 이후에 heap 모듈을 사용해서 시간을 단축해보려했지만 10번 테스트케이스에서 timeout

# 이후에 저번주에 공부했던 Amortized O(1)의 maxStack의 getMax()을 응용해
# minStack과 getMin()을 구현해서 사용했지만 또 10번 테스트케이스에서 timeout 발생..

from sys import stdin

class Stack:
    def __init__(self):
        self.items = []
        
    # 모든 함수 O(1)
    def push(self, val):
        self.items.append(val)
        
    def pop(self):
        return self.items.pop()

    def top(self):
        try:
            return self.items[-1]
        except IndexError:
            print("EMPTY")
            
    def __len__(self):
        return len(self.items)
    
    def isEmpty(self):
        return self.__len__() == 0     
    
    
class MinStack():
    def __init__(self):
        self.minimum = None
        self.stk = Stack()
        self.minStk = Stack()
        
    def push(self, val):
        self.minimum = val
        if not self.minStk.isEmpty() and self.minimum > self.minStk.top():
            self.minimum = self.minStk.top()
            
        self.stk.push(val)
        self.minStk.push(self.minimum)
        
    def getMax(self):
        if self.minStk.isEmpty():
            print("EMPTY")
        else:
            print(self.minStk.top(), end=" ")
    
    def pop(self):
        try:
            print(self.stk.pop())
            self.minStk.pop()
        except:
            print("EMPTY")




# -----------------------------------------------------------------------------
def solution(A, n, k):
    B = [] # result
    
    for i in range(0, n-k+1): # O(n-k)
        minStack = MinStack()
        for i in  A[i:i+k]: # O(4)
            minStack.push(i)
        B.append(minStack.getMax()) # Amortized O(1)
        
    return B

# main
n ,k = map(int, stdin.readline().split())
A = list(map(int, stdin.readline().split()))
B = solution(A, n, k)