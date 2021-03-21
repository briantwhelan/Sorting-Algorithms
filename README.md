# Sorting-Algorithms
## Overview

| Sorting Algorithm | Best-case Time Complexity | Worst-case Time Complexity | Space Complexity | Stable? | Inplace? |
|:-----------------:|:-------------------------:|:--------------------------:|:----------------:|:-------:|:--------:|
|    Bubble Sort    |          Theta(N)         |         Theta(N^2)         |     Theta(1)     |   Yes   |    Yes   |
|   Insertion Sort  |          Theta(N)         |         Theta(N^2)         |     Theta(1)     |   Yes   |    Yes   |
|     Merge Sort    |        Theta(NlogN)       |        Theta(NlogN)        |     Theta(N)     |   Yes   |    No    |
|     Quicksort     |        Theta(NlogN)       |         Theta(N^2)         |    Theta(logN)   |    No   |    Yes   |
|   Selection Sort  |         Theta(N^2)        |         Theta(N^2)         |     Theta(1)     |   Yes   |    Yes   |
|     Shell Sort    |        Theta(NlogN)       |         Theta(N^2)         |     Theta(1)     |   Yes   |    Yes   |

where N is the length of the array to be sorted

## Bubble Sort
### How It Works
Bubble Sort works by taking every element (starting from the leftmost element) and comparing it with every other element (from left to right), swapping them if the element on the left is greater than the element on the right. At the end of each pass, the next largest element will be in its correct location. 

In other words, at the end of the first pass, the largest element will be at the end of the array (rightmost element), at the end of the second pass the second largest element will be at the position to the left of the largest element and so on. If a full pass completes without any swaps being made, we know the array is sorted and do not have to continue any further. 

### Space and Time Complexity
Bubble Sort has a worst-case time complexity of Theta(N^2) due to the two nested for loops the algorithm requires. Both of these for loops iterate over (almost) the entire length of the array (N), leading to this order of growth.

Bubble Sort has a best-case time complexity of Theta(N) as we can exit the loops if we go through a full pass and find no swaps occurred. This only occurs when the array to be sorted is in fact already sorted.

Bubble Sort is both a stable and in-place sorting algorithm. It does not require any additional memory meaning it has a space complexity of Theta(1).

### Potential Improvements
- **Already Sorted Arrays** - exiting the loops if the array is already sorted is worthwhile as it results in a performance of Theta(N) in the case that the array is already sorted. (I have implemented this improvement in my algorithm)
- **Reducing Length of Inner Loop** - with the knowledge that after every pass the next largest element will be in its correct position towards the end of the array, we can reduce the length of the array we have to traverse in every pass of the inner loop. Instead of going through the entire length of the array, we can offset it with the current position of the outer for loop. In other words, instead of ```for(int j = 0; j < array.length - 1; j++)```, we can have ```for(int j = 0; j < array.length - i - 1)```(I have implemented this improvement in my algorithm)

### Uses and Final Thoughts
Bubble Sort is an easily understandable algorithm and has as advantage over many sorting algorithms (but not insertion sort) in that it can detect when the array is already sorted. However, in reality, there are far better algorithms for efficiency and Bubble Sort's order of growth makes it unusable for larger input sizes. For these reasons, it is rarely used other than for educational purposes. 

## Insertion Sort
### How It Works
Insertion Sort works by splitting the array conceptually into two parts: a sorted part and an unsorted part. At the beginning of the algorithm, the sorted part consists of just the leftmost element (i.e. the element at index 0), while the remaining elements exist in the unsorted part. 

With every pass, the algorithm takes the first element in the unsorted part and places it in the correct position in the sorted part. For example, in the first pass, the first element in the unsorted part is at index 1. This element is compared with all elements in the sorted part (just the element at index 0 at this point) and inserted accordingly. With every pass, the sorted part grows by one and the unsorted part shrinks by one until the unsorted part is empty.

### Space and Time Complexity
Insertion Sort has a worst-case time complexity of Theta(N^2) due to the nested while loop within a for loop the algorithm requires. Both of these for loops iterate over (almost) the entire length of the array (N), leading to this order of growth.

Insertion Sort has a best-case time complexity of Theta(N) as the while loop will not be entered if every element that is being inserted is greater than the largest element currently in the sorted part. This only occurs when the array to be sorted is in fact already sorted.

Insertion Sort is both a stable and in-place sorting algorithm. It does not require any additional memory meaning it has a space complexity of Theta(1).

### Potential Improvements
- ***Swap Elements Before Sorting*** - by comparing array[0] with array[array.length - 1] and swapping accordingly, comparing array[1] with array[array.length - 2] and swapping accordingly and so on, we can drastically improve the number of comparisons needed within the insertion sort algorithm. [See here for more information.](http://ijcset.com/docs/IJCSET13-04-05-068.pdf) (I have not implemented this improvement in my algorithm)

### Uses and Final Thoughts
Insertion Sort is widely used, particularly in improving other algorithms for small input sizes. Insertion Sort works very well in cases where the array is sorted or almost sorted, resulting in many algorithms switching to Insertion Sort once the array is almost sorted (Heap Sort, Merge Sort and Quicksort). However, it is not useful on its own for sorting large input sizes due to its order of growth. 

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
