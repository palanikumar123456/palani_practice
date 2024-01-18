#!/bin/bash

A=10
B=2000
SUM=$((A+B))

echo "Good \n Morning"
echo "How are you doing today"

echo "Good Evening \n have a nice day!"
echo -e "Good Evening \n have a nice day!"
echo -E "Good Evening \n have a nice day!"

echo "A: $A\n B: $B\nSUM=$SUM"
echo -e "A: $A\tB: $B\tSUM=$SUM"
echo -E "A: $A\t B: $B\tSUM=$SUM"
echo  "A: $A\t B: $B\tSUM=$SUM"
echo ============================================

printf "Good Morning!\n"
printf "Hope you have a great day today\n"

printf "A: $A\nB: $B\nSUM=$SUM"
printf "\nA: $A\tB: $B\tSUM=$SUM"
printf "\nUsing format specifiers\nA: %d\tB: %d\tSUM=%d\t" $A $B $SUM
printf "\nUsing format specifiers\nA: %d\nB: %d\nSUM=%d\n" $A $B $SUM
echo =============================================

echo -e -n "Good Evening \n have a nice day!"

