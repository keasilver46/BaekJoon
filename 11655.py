S = input()
result = ''

for c in S:
  if 'A' <= c <= 'Z':
    c = ord(c) + 13

    if c > ord('Z'):
      c -= 26

    result += chr(c)

  elif 'a' <= c <= 'z':
    c = ord(c) + 13

    if c > ord('z'):
      c -= 26

    result += chr(c)
    
  else:
    result += c

print(result)