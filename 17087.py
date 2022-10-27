import math

N, S = map(int, input().split())
A = list(map(int, input().split()))
dif = [0] * N

for i in range(N):
  dif[i] = abs(S - A[i])

D = dif[0]
for item in dif:
  D = math.gcd(D, item)

print(D)