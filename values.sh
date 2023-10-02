#/bin/bash
ARR=(1 2 3 4 5)
op=1;
len=`echo "${#ARR[@]}-1"|bc`;

for((i=$len;i>=0;i--));
do
echo "${ARR[$i]}*$op"|bc
op=`ehco "$op*10"|bc`
done