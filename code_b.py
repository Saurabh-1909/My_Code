import math
v1 =int(input())
r1 = int(input())
v2 = int(input())
r2 = int(input())
t = int(input())
d1 = v1*t
d2 = v2*t

d1=d1%360
d2=d2%360

rad1 = (3.14*d1)/180
rad2 = (3.14*d2)/180

X1=r1*math.cos(rad1)
Y1=r1*math.sin(rad1)

if d1>90 and d1<=180:
  X1=(-1)*X1
elif d1>180 and d1<=270:
  X1=(-1)*X1
  Y1=(-1)*Y1
elif d1>270:
  Y1=(-1)*Y1
else:
  pass

X2=r2*math.cos(rad2)
Y2=-1*(r2*math.sin(rad2))

if d2>90 and d2<=180:
  X2=(-1)*X2
elif d2>180 and d2<=270:
  X2=(-1)*X2
  Y2=(-1)*Y2
elif d2>270:
  Y2=(-1)*Y2
else:
  pass

dis =math.sqrt((X2-X1)**2 + (Y2-Y1)**2)
print ("%.2f" %dis)
