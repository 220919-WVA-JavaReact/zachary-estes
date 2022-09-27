#!/bin/bash

exec < $1 #saving arg/searched file 

read header #skipping the header of our data file 

while IFS="," read -r fname lname email uname pw pla #organizing the data and saving the searched data to their corresponding variable
do #using IFS as a word splitter so our data doesn't come out jumbled, using the "," as a separator
  echo "First name: $fname" 
  echo "Last name: $lname"
  echo "Email: $email"
  echo "Username: $uname"
  echo "Password: $pw"
  echo "Favorite Plant: $pla"
  echo "++++++++++++++++++++"
done