def f(lst):
    return len([i for i in lst if i.isalpha()])

print(f(input().split()))