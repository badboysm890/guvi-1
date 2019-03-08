list3=[]
N=int(input())
K=int(input())
num=0
while N > 0 :
 list3.append(input())
 N=N-1
while K > 0 :
 p=int(list3[K-1])
 num= num + p
 K=K-1
print(num) 
