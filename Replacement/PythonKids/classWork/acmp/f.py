import math

def dist(x1, y1, x2, y2):
    return math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)

def geron(a, b, c):
    p = (a + b + c) / 2
    return math.sqrt(p * (p - a) * (p - b) * (p - c))

x1, y1, x2, y2, x3, y3 = map(int, input().split())

a = dist(x1, y1, x2, y2)
b = dist(x2, y2, x3, y3)
c = dist(x3, y3, x1, y1)

print("{0:.1f}".format(geron(a, b, c)))