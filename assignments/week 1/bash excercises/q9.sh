#!/bin/bash

read -p "Enter a number: " num;

if [[ $(expr $num % 2) = 0 ]]
then
    echo "its an even number "
else    
    echo "its an odd number "
fi