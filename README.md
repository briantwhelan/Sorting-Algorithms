# Sorting-Algorithms
Various sorting algorithms implemented in Java along with a description of how they work and their respective runtimes

## Overview

| Sorting Algorithm | Best-case Time Complexity | Worst-case Time Complexity | Space Complexity | Stable? | Inplace? |
|:-----------------:|:-------------------------:|:--------------------------:|:----------------:|:-------:|:--------:|
|    Bubble Sort    |          Theta(N)         |         Theta(N^2)         |     Theta(1)     |   Yes   |    Yes   |
|   Insertion Sort  |          Theta(N)         |         Theta(N^2)         |     Theta(1)     |   Yes   |    Yes   |
|     Merge Sort    |        Theta(NlogN)       |        Theta(NlogN)        |     Theta(N)     |   Yes   |    No    |
|     Quicksort     |        Theta(NlogN)       |         Theta(N^2)         |    Theta(logN)   |    No   |    Yes   |
|   Selection Sort  |         Theta(N^2)        |         Theta(N^2)         |     Theta(1)     |   Yes   |    Yes   |
|     Shell Sort    |        Theta(NlogN)       |         Theta(N^2)         |     Theta(1)     |   Yes   |    Yes   |where N is the length of the array to be sorted|

## Bubble Sort
### How It Works
Bubble Sort works by taking every element (starting from the leftmost element) and comparing it with every other element (from left to right), swapping them if the element on the left is greater than the element on the right. At the end of each pass, the next largest element will be in its correct location. In other words, at the end of the first pass, the largest element will be at the end of the array (rightmost element), at the end of the second pass the second largest element will be at the position to the left of the largest element and so on. If a full pass completes without any swaps being made, we know the array is sorted and do not have to continue any further. 
### Space and Time Complexity
Bubble Sort has a worst-case time complexity of Theta(N^2) due to the two nested for loops the algorithm requires. Both of these for loops iterate over (almost) the entire length of the array (N), leading to this order of growth.
Bubble Sort has a best-case time complexity of Theta(N) as we can exit the loops if we go through a full pass and find no swaps occurred. This only occurs when the array to be sorted is in fact already sorted.
Bubble Sort in both stable and in-place. It does not require any additional memory meaning it has a space complexity of Theta(1).
### Potential Improvements
- **Already Sorted Arrays** - exiting the loops if the array is already sorted is worthwhile as it results in a performance of Theta(N) in the case that the array is already sorted. (I have implemented this improvement in my algorithm)
- **Reducing Length of Inner Loop** - with the knowledge that after every pass the next largest element will be in its correct position towards the end of the array, we can reduce the length of the array we have to traverse in every pass of the inner loop. Instead of going through the entire length of the array, we can offset it with the current position of the outer for loop. In other words, instead of ```java for(int j = 0; j < array.length - 1; j++)```, we can have ```java for(int j = 0; j < array.length - i - 1)```. (I have implemented this improvement in my algorithm).
### Uses and Final Thoughts

## Insertion Sort
### How It Works

### Space and Time Complexity

### Potential Improvements

### Uses and Final Thoughts

## Merge Sort
### How It Works

### Space and Time Complexity

### Potential Improvements

### Uses and Final Thoughts

## Quicksort
### How It Works

### Space and Time Complexity

### Potential Improvements

### Uses and Final Thoughts

## Selection Sort
### How It Works

### Space and Time Complexity

### Potential Improvements

### Uses and Final Thoughts

## Shell Sort
### How It Works

### Space and Time Complexity

### Potential Improvements

### Uses and Final Thoughts