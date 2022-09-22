#!/bin/bash

#greeting and show options
function hello()
{
  echo "Hello! Please choose one of the following"
  echo " -a Display parsed data "
  echo " -b Add new data "
  read ans
}

hello 
#saves data to variable
#ans=${1}

#error checker to make sure it recieves a correct command

if [[ $ans = "-a" ]] #displays parsed data
    then
    read -p "What is your first name: " fname;
    sh parser.sh MOCK_DATA.csv | grep -A5 "First name: $fname$"
	exit 0;
elif [[ $ans = "-b" ]] #adding data to MOCK_DATA.csv
    then
    read -p "enter first name: " fn;
	
	read -p "enter last name: " la;

	read -p "enter email: " em;
	
	read -p "enter username: " us;
	
	read -p "enter password: " pw;
	
    echo "$fn,$la,$em,$us,$pw" >> MOCK_DATA.csv;
    
	echo "info added!"

    exit 0;
fi 

