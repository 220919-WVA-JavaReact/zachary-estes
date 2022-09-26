#!/bin/bash

#prompts user and saves arg
function hello()
{
  echo "Hello! Please enter a number!"
  
  read ans
}

hello;

#for loop for checking $ans if prime
for (( i=2; i<=$ans/2; i++ ))
do 
    x=$(( $ans%i )) #dividing $ans by i and using modulo to turn into integer
    if [ $x -eq 0 ] #using if statement to check if was divisble by i
    then
        echo "$ans is not PRIME" #returning answer if $ans was not prime 
        exit 0;
    fi
done
echo "$ans is PRIME!";