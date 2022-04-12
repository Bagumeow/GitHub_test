import math
x=int(input())
def giaithua(n):
    ans = 1;
    if (n == 0 or n == 1):
        return ans;
    else:
        for i in range(2, n + 1):
            ans = ans * i;
        return ans;
print(math.log(pow(x+math.sin(x),1/3)/giaithua(x+1)))