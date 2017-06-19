#!/bin/bash
echo $1
#javac $1 2> /dev/null
ERROR=$(javac $1 2>&1 >/dev/null)
if [[ $ERROR = "" ]]; then
  echo "it was successful compilation"
else
  echo "you have mistakes"
fi
