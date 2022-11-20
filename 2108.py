import sys
from collections import Counter

N = int(sys.stdin.readline())
arr = []

for i in range(N):
  arr.append(int(sys.stdin.readline()))
arr.sort()

# 산술평균
print(round(sum(arr) / len(arr)))

# 중앙값
print(arr[len(arr) // 2])

# 최빈값
count = Counter(arr)
mode = count.most_common(2)
if len(mode) > 1:
  if mode[0][1] == mode[1][1]:
    print(mode[1][0])
  else:
    print(mode[0][0])
else:
  print(mode[0][0])

# 범위
print(max(arr) - min(arr))