s = input()
stack = []
answer = ''

for x in s:
  if x.isalpha():
    answer += x
  elif x == '(':
    stack.append(x)
  elif x == '*' or x == '/':
    while stack and (stack[-1] == '*' or stack[-1] == '/'):
      answer += stack.pop()
    stack.append(x)
  elif x == '+' or x == '-':
    while stack and stack[-1] != '(':
      answer += stack.pop()
    stack.append(x)
  elif x == ')':
    while stack and stack[-1] != '(':
      answer += stack.pop()
    stack.pop()

while stack:
  answer += stack.pop()

print(answer)