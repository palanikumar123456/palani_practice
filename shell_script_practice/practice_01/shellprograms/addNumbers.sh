#!/bin/bash
A=25
B=30
SUM=$[A+B]
echo "SUM: $SUM"
echo ==============================================
read A # the shell interpreter waits for the user input
read B
SUM=$[A+B]
echo "SUM: $SUM"
echo =============================================
echo "Enter A"
read A
# the shell interpreter waits for the user input and collects it and assigns to the variable A
echo "Enter B"
read B
SUM=$[A+B]
echo "SUM: $SUM"
echo ===================================================
read -p "Enter A: " A
read -p "Enter B: " B
SUM=$[A+B]
echo "sum: $SUM"
echo =================================================
A=$1
B=$2
SUM=$[A+B]
echo "$0 $1 $2"
echo "sum: $SUM"
