#!/bin/bash

a=$1 # taking user input

x=1 #min value

for (( i=$a; i>0; i-- ))
do 
    x=$[$i * $x] #loop calculation for getting factorial
done; 

echo $x; #print answer
