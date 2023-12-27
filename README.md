
# LeetCode Challenge D13

## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [2148.  Count Elements With Strictly Smaller and Greater Elements](https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

Given an integer array `nums`, return _the number of elements that have  *both*  a strictly smaller and a strictly greater element appear in_ `nums`.

**Example**

>**Input:** nums = [11,7,2,15]
>
>**Output:** 2
>
>**Explanation:** The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it. Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it. In total there are 2 elements having both a strictly smaller and a strictly greater element appear in `nums`.

**Language Used**
> Java

**Difficulty**
> Easy



## Solution Overview
The solution begins by identifying the maximum (`largest`) and minimum (`smallest`) elements in the array using built-in functions from the `Arrays` class. Subsequently, a `count` variable is initiated to track the number of array elements satisfying the given conditions. The array is then iterated through using a `for` loop, and for each element, it checks whether there exists both a smaller and a larger element than the current one. If this condition is met, the counter increments. Finally, the count is returned as the result.
