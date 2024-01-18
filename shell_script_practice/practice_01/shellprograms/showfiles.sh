#!/bin/bash

DIRECTORY_NM=$1
ls $DIRECTORY_NM

printf "command-substitution demo\n"
ALL_FILES=$(ls $1)
printf "ALL_FILES: $ALL_FILES\n"
echo -e "ALL_FILES: $ALL_FILES\n"
echo =================================
printf "ALL_FILES: %s\n" $ALL_FILES

echo ===========================
printf "NUMBER: %d\n" 10 20 30