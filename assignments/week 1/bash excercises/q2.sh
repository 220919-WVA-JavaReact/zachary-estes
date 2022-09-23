#!/bin/bash
max=100;#takes max number

fib1=0;#starting value

fib2=1;#secondary value to be added

for (( i=0; i<=max; i++ ))#running the fib.series the max number
do  
    echo "$fib1 ";#echo result
    sum=$(( fib1 + fib2 ));#incrementally adding the two number to get then fib sequence
    fib1=$fib2;
    fib2=$sum
    
done