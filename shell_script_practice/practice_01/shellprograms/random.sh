#!/bin/bash
echo "program filename: $0"
echo "no.of arguments passed: $#"
echo "first argument: $1"
echo "second argument: $2"
echo "passed arguments using *: $*"
echo "passed arguments using @: $@"
n1=$*
n2=$@
echo "n1: $n1"
echo "n2: $n2"
echo ===============================================
# passed arguments: 10 20 '30 40'
echo "3rd argument using @: $@[2]"  # in this case string is interpreted as 1 argument
echo "3rd argument using *: $*[2]"     # in case of * it ignores quotes and consider space to be as an argument seprator
