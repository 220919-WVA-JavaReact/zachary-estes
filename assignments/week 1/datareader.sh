#!/bin/bash

#greeting and show options
function hello()
{
  echo "Hello! Please choose one of the following"
  echo " -a Display parsed data "
  echo " -b Add new data "
}

#saves data to variable
ans=${1}
#error checker to make sure it recieves correct command

#option to display parsed data
while disp ":ab: option; do
  case $option in
	a) #displays info
	   sh parser.sh MOCK_DATA.csv | -A5 "First Name: $fname$"
	   exit; 
#option to add data
	b) #add data
	   echo "enter first name: ";
	   read fn | >> MOCK_DATA.csv;
	   echo "enter last name: ";
	   read la | >> MOCK_DATA.csv;
	   echo "enter email: ";
	   read em | MOCK_DATA.csv;
	   echo "enter username: ";
	   read us | >> MOCK_DATA.csv
	   echo "enter password: ";
	   read pw | >> MOCK_DATA.csv
	   echo "info added!"
	exit;
esac




