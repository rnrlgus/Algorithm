n = int(input())
h, m, s = 0, 0, -1
cnt = 0

while (n >= h):
    s += 1
    
    if (s == 60):
        m += 1
        s = 0
    if (m == 60):
        h += 1
        m = 0
    
    if (str(n) in str(h)):
        cnt += 1
        continue
    if (str(n) in str(m)):
        cnt += 1
        continue
    if (str(n) in str(s)):
        cnt += 1
        continue
    
print(cnt)