#!/bin/bash

arr=( );#start with empty array

for i in {0..5}
do
    arr+=$i ;#added number to array as loop runs
    echo $arr;#echo results
done