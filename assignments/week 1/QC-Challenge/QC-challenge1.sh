#!/bin/bash

#greeting and show options
function hello()
{
  echo "Hello! Welcome to Plantify"
  echo "Please choose one of the following"
  echo " -a Search For Specific User: "
  echo " -b Add New User "
  echo " -c Display All Users "
  read ans
}

hello;

#error checker to make sure it doesn't recieve a blank response
if [ -z $ans ] 
then
	echo "please add an response";
	exit 0;
fi
#using if statements to check user's argument and matching it to the appropriate option
if [ $ans == "a" ] #-a option is to search with my mock data for a specific user
then
  read -p "What is your first name: " fname;
  sh search1.sh mock_data.csv | grep -A6 "First name: $fname$"; #executing our search1.sh bash script to organize the data and using the grep command to search the data for a specific user
  exit 0;
elif [ $ans == "b" ] #-b option is to add a user to the rest of our data / creating new data
then
  read -p "Enter user's first name: " fn; #following 5 are prompts that ask the user for their data and are stored to their local variables
  read -p "Enter user's last name: " ln;
  read -p "Enter user's email: " em;
  read -p "Enter user's username: " uname;
  read -p "Enter user's password: " pw;
  read -p "Enter user's favorite plant: " pla;
  echo "$fn,$ln,$em,$uname,$pw,$pla" >> mock_data.csv; #echoing/adding the stored variables from the prompts to where we are storing the data
  echo "user has been added to our database!"
  echo "Welcome to Plantify!"
  exit 0;
elif [ $ans == "c" ] #-c option is to display all of the data in an organized manner using our search1.sh script
then  
  sh search1.sh mock_data.csv;
else
  exit 0;
fi

  