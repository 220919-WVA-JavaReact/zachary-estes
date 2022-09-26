#!/bin/bash

function hello()
{
  echo "Hello! Please enter 10 numbers!"
  
  read ans
}

hello;

x=0;

y=0;


for (( i=$@; i<=10; i++ ))
do 
if [[ $ans > 0 ]] 
    then
    x++
else
    y++
fi
done

echo "there are $x postives and $y negatives";