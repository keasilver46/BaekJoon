N = int(input())
post = input()
num = [0] * N
stack = []

for i in range (N):
  num[i] = int(input())
  
for i in post:
  if 'A' <= i <= 'Z':
    stack.append(num[ord(i) - ord('A')])
  else:
    str2 = stack.pop()
    str1 = stack.pop()

    if i == '+':
      stack.append(str1 + str2)
    elif i == '-':
      stack.append(str1 - str2)
    elif i == '*':
      stack.append(str1 * str2)
    elif i == '/':
      stack.append(str1 / str2)

print('%.2f' %stack[0])