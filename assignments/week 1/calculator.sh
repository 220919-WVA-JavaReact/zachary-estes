#!/bin/bash
a=$1;
b=$2;
c=$3;

#using regex to check variables for actual numbers/work in progress

#t1='^[0-9]*$'
#if [ -z $a ] || [ -z $b ] || [ -z $c ]
#then
#	echo "please add an equation"
#	exit
#fi

#if ! [ $a !=~ ^[0-9]+$ ] || ! [ $c !=~ ^[0-9]+$ ]
#then 
#	echo "please use a number" >&2; 
#	exit 
#fi

#using if/elif to check operations and using arithmetic/echoing answers

if [ $b == + ]
then
	let ad=$a+$c
	echo $ad
	exit
elif [ $b == - ]
then
	let su=$a-$c
	echo $su
	exit
elif [ $b == / ]
then 
	let di=$a/$c
	echo $di
	exit
elif [ $b = x ]
then
	let mu=$a*$c
	echo $mu
	exit
else
	>&2 echo "error! refer to error log"
	exit
fi

