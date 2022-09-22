#!/bin/bash

#greeting and show options
function hello()
{
  echo "Hello! Please choose one of the following"
  echo " -a Display parsed data "
  echo " -b Add new data "
  echo " -c Exit "
  read ans
}

hello #runs hello function

#error checker to make sure it recieves a correct command
if [ -z $ans ] 
then
	echo "please add an response"
	exit 0;
fi
#checking for type of response 
if [[ $ans = "-a" ]] #displays parsed data
    then
    read -p "What is your first name: " fname;
    sh parser.sh MOCK_DATA.csv | grep -A5 "First name: $fname$"
elif [[ $ans = "-b" ]] #user prompts to add data
    then
    read -p "enter first name: " fn;
	
	read -p "enter last name: " la;

	read -p "enter email: " em;
	
	read -p "enter username: " us;
	
	read -p "enter password: " pw;
	
    echo "$fn,$la,$em,$us,$pw" >> MOCK_DATA.csv; #adding data to csv file
    
	echo "info added!"
elif [[ $ans = "-c" ]] #exit script command
then 
    echo "Goodbye!"
    exit 0;
else
    echo "please enter one of the prompted responses"
    exit 0;
fi 

