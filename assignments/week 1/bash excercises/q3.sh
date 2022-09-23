#!/bin/bash

a=$1

x=1

for (( i=$a; i>0; i-- ))
do 
    x=$[$i * $x] 
done; 

echo $x;
