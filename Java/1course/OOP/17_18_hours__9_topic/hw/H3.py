def fnd(lst, key):
    return -1 if key not in lst else lst.index(key)

l = [1, 2, 4, 9]
k = 7
print(fnd(l, k))
