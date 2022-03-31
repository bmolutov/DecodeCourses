def isPrime(n):
    if n <= 1: return False
    i = 2
    while i * i <= n:
        if n % i == 0: return False
        i += 1
    return True


lst = list(map(int, input().split()))
ans = sum([i for i in lst if isPrime(i)])
print(ans)
print("Yes") if isPrime(ans) else print("No")
