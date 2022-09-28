S = input()
arr = [0] * 26

for c in S:
  arr[ord(c) - ord('a')] += 1

print(*arr)