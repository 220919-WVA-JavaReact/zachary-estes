#!/bin/bash
#wip
function hello()
{
  echo "Hello! Please choose one of the following"
  echo " -a show current directory "
  echo " -b show current user "
  echo " -c Show today's date "
  echo " -d Check if other users are logged in  "
  read ans
}

hello;

if [[ $ans = "-a" ]] #
    then
    pwd
elif [[ $ans = "-b" ]]
    then
    whoami
elif [[ $ans = "-c" ]]
    then
    date +'%m/%d/%Y'
elif [[ $ans = "-d" ]]
    then
    
fi