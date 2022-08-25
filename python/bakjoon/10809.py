a = input()

# lst = [-1 for _ in range(26)]
# for i in range(len(a)):
#     if lst[ord(a[i])-97] == -1:
#         lst[ord(a[i])-97] = i
    
# for i in lst:
#     print(i, end=' ')

alpha = "abcdefghizklmnopqrstuvwxyz"

for i in alpha:
    print(a.find(i), end=" ")