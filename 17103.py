T = int(input())
N = [int(input()) for _ in range(T)]

isPrime = [True for _ in range(1000001)]

for i in range(2, 1000001):
  if isPrime[i]:
    for j in range(i*2, 1000001, i):
      isPrime[j] = False

for num in N:
  count = 0
    
  for i in range(2, (num//2) + 1):
    if isPrime[i] and isPrime[num-i]:
      count += 1

  print(count)