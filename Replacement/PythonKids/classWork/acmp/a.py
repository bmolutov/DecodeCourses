def f(lst):
    return len([i for i in lst if i.isdigit()])

print(f(input().split()))

# ls = [1,2,3,4]

# evens = [i * 2 for i in ls if i % 2 == 0]
# print(*evens)
