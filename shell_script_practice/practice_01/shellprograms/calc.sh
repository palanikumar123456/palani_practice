#!/bin/bash
A=10
B=20
echo $[A+B]
echo $[ A + B ]
echo $[A + B ]
echo $[ A + B]
SUM=$((A+B))
echo "SUM = $SUM"
echo $(( A + B ))