def fact(n):
    if n <= 1: return 1
    else: return fact(n-1) * n


n, k = map(int, input().split())
print(int(fact(n) / fact(k) / fact(n - k)))