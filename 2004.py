def count2(N):
  count = 0
  while N > 0:
    count += N // 2
    N //= 2
  return count

def count5(N):
  count = 0
  while N > 0:
    count += N // 5
    N //= 5
  return count

n, m = map(int, input().split())
two_count = count2(n) - count2(m) - count2(n-m)
five_count = count5(n) - count5(m) - count5(n-m)
print(min(two_count, five_count))