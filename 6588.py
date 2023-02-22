import sys

isPrime = [True for i in range(1000001)]

for i in range(2, 1000001):
  if isPrime[i]:
    for j in range(i*2, 1000001, i):
      isPrime[j] = False

while True:
  n = int(sys.stdin.readline())

  if n == 0:
    break
  else:
    for i in range(3, len(isPrime)):
      if isPrime[i] & isPrime[n-i]:
        print(n, '=', i, '+', n-i)
        break