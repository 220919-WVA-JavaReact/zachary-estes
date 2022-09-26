#!/bin/bash

read -p "enter a word: " word;

pali="";

num=${#word};

for (( i=$num-1; i>=0; i-- ));
do  
  pali="$pali${word:$i:1}"
done

#echo $pali;

if [[ $pali == $word ]]
then
  echo "its a palindrome"
else
  echo "not a palindrome"
fi
