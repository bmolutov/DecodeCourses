def dist(x1, y1, x2, y2):
    return (x1 - x2) ** 2 + (y1 - y2) ** 2

x1, y1, x2, y2, x3, y3 = map(int, input().split())

a = dist(x1, y1, x2, y2)
b = dist(x2, y2, x3, y3)
c = dist(x3, y3, x1, y1)

mx = max(a, b, c)
mn = min(a, b, c)
avg = (a + b + c) - mn - mx

print("Yes") if mx == mn + avg else print("No")