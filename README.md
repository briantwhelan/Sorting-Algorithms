# Sorting-Algorithms
## Overview

| Sorting Algorithm | Best-case Time Complexity | Worst-case Time Complexity | Space Complexity | Stable? | Inplace? |
|:-----------------:|:-------------------------:|:--------------------------:|:----------------:|:-------:|:--------:|
|    Bubble Sort    |          &Theta;(N)         |         &Theta;(N<sup>2</sup>)         |     &Theta;(1)     |   Yes   |    Yes   |
|   Insertion Sort  |          &Theta;(N)         |         &Theta;(N<sup>2</sup>)         |     &Theta;(1)     |   Yes   |    Yes   |
|     Merge Sort    |        &Theta;(NlogN)       |        &Theta;(NlogN)        |     &Theta;(N)     |   Yes   |    No    |
|     Quicksort     |        &Theta;(NlogN)       |         &Theta;(N<sup>2</sup>)         |    &Theta;(logN)   |    No   |    Yes   |
|   Selection Sort  |         &Theta;(N<sup>2</sup>)        |         &Theta;(N<sup>2</sup>)         |     &Theta;(1)     |   Yes   |    Yes   |
|     Shell Sort    |        &Theta;(NlogN)       |         &Theta;(N<sup>2</sup>)         |     &Theta;(1)     |   Yes   |    Yes   |

where N is the length of the array to be sorted

## Bubble Sort
### How It Works
Bubble Sort works by taking every element (starting from the leftmost element) and comparing it with every other element (from left to right), swapping them if the element on the left is greater than the element on the right. At the end of each pass, the next largest element will be in its correct location. 

In other words, at the end of the first pass, the largest element will be at the end of the array (rightmost element), at the end of the second pass the second largest element will be at the position to the left of the largest element and so on. If a full pass completes without any swaps being made, we know the array is sorted and do not have to continue any further. 

### Space and Time Complexity
Bubble Sort has a worst-case time complexity of &Theta;(N<sup>2</sup>) due to the two nested for loops the algorithm requires. Both of these for loops iterate over (almost) the entire length of the array (N), leading to this order of growth.

Bubble Sort has a best-case time complexity of &Theta;(N) as we can exit the loops if we go through a full pass and find no swaps occurred. This only occurs when the array to be sorted is in fact already sorted.

Bubble Sort is both a stable and in-place sorting algorithm. It does not require any additional memory meaning it has a space complexity of &Theta;(1).

### Potential Improvements
- **Already Sorted Arrays** - exiting the loops if the array is already sorted is worthwhile as it results in a performance of &Theta;(N) in the case that the array is already sorted. (I have implemented this improvement in my algorithm)
- **Reducing Length of Inner Loop** - with the knowledge that after every pass the next largest element will be in its correct position towards the end of the array, we can reduce the length of the array we have to traverse in every pass of the inner loop. Instead of going through the entire length of the array, we can offset it with the current position of the outer for loop. In other words, instead of `for(int j = 0; j < array.length - 1; j++)`, we can have `for(int j = 0; j < array.length - i - 1)`(I have implemented this improvement in my algorithm)

### Uses and Final Thoughts
Bubble Sort is an easily understandable algorithm and has as advantage over many sorting algorithms (but not insertion sort) in that it can detect when the array is already sorted. However, in reality, there are far better algorithms for efficiency and Bubble Sort's order of growth makes it unusable for larger input sizes. For these reasons, it is rarely used other than for educational purposes. 

## Insertion Sort
### How It Works
Insertion Sort works by splitting the array conceptually into two parts: a sorted part and an unsorted part. At the beginning of the algorithm, the sorted part consists of just the leftmost element (i.e. the element at index 0), while the remaining elements exist in the unsorted part. 

With every pass, the algorithm takes the first element in the unsorted part and places it in the correct position in the sorted part. For example, in the first pass, the first element in the unsorted part is at index 1. This element is compared with all elements in the sorted part (just the element at index 0 at this point) and inserted accordingly. With every pass, the sorted part grows by one and the unsorted part shrinks by one until the unsorted part is empty.

### Space and Time Complexity
Insertion Sort has a worst-case time complexity of &Theta;(N<sup>2</sup>) due to the nested while loop within a for loop the algorithm requires. Both of these for loops iterate over (almost) the entire length of the array (N), leading to this order of growth.

Insertion Sort has a best-case time complexity of &Theta;(N) as the while loop will not be entered if every element that is being inserted is greater than the largest element currently in the sorted part. This only occurs when the array to be sorted is in fact already sorted.

Insertion Sort is both a stable and in-place sorting algorithm. It does not require any additional memory meaning it has a space complexity of &Theta;(1).

### Potential Improvements
- **Swap Elements Before Sorting** - by comparing array[0] with array[array.length - 1] and swapping accordingly, comparing array[1] with array[array.length - 2] and swapping accordingly and so on, we can drastically improve the number of comparisons needed within the insertion sort algorithm. [See here for more information.](http://ijcset.com/docs/IJCSET13-04-05-068.pdf) (I have not implemented this improvement in my algorithm)

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
Selection Sort works by splitting the array conceptually into two parts: a sorted part and an unsorted part. At the beginning of the algorithm, the sorted part consists of no elements, while the all the elements exist in the unsorted part. 

With every pass, the algorithm searches through the unsorted part to find the minimum element. This minimum element is then swapped into the sorted part starting at index 0. With every pass, the sorted part grows by one and the unsorted part shrinks by one until the unsorted part consists of only a single element (as we know the array is sorted at this point). 

### Space and Time Complexity
Selection Sort has a worst-case time complexity of &Theta;(N<sup>2</sup>) due to the nested for loops the algorithm requires. Both of these for loops iterate over (almost) the entire length of the array (N), leading to this order of growth.

Selection Sort has a best-case time complexity of &Theta;(N<sup>2</sup>) as regardless of input the two nested for loops will be executed. With every pass we need to find the minimum element in the unsorted part, and in order to do this we need to look through every element in the unsorted part. This results in every input being a worst-case input.

Selection Sort is not stable but is an in-place sorting algorithm. It does not require any additional memory meaning it has a space complexity of &Theta;(1).

### Potential Improvements
- **Find Maximum Element As Well** - in each pass we find the minimum element in the unsorted part of the array and place it in the correct position in the sorted part. We could also find the maximum element on each pass and then place this at its correct position in the sorted part of the array also. (I have not implemented this improvement in my algorithm)

### Uses and Final Thoughts
Selection Sort may be used when auxiliary memory is limited and where a minimal number of swaps is required. However, its quadratic order of growth makes it unusable for large input sizes and Insertion Sort is generally a better option for smaller arrays. The main advantage of Selection Sort is that it makes the minimal number of swaps in the worst case (N - 1 swaps where N is the length of the array).

## Shell Sort
### How It Works
Shell Sort is a variation of Insertion Sort that reduces the number of swaps required in the case where an element being inserted into the sorted part of the array requires many swaps.

In Shell Sort we introduce a gap between which we compare elements and make swaps. In each pass, we reduce this gap until it becomes 1. On the final pass, it acts exactly like insertion sort. When the gap becomes 0, the array is sorted. (In my implementation, the gap starts at half the array size and is reduced by half in each iteration i.e. `gap = array.length/2 -> array.length/4 -> array.length/8 ...`)

### Space and Time Complexity
Shell Sort has a worst-case time complexity of &Theta;(N<sup>2</sup>) due to the nested for loops the algorithm requires. The outer for loop contributes &Theta;(logN) while the inner two for loops contribute &Theta;(N<sup>2</sup>). This results in a &Theta;(logN * N<sup>2</sup>) worst-case time complexity but is in fact better. If we introduce the gap variable we see that it becomes &Theta;(N<sup>2</sup>). In simpler terms, Shell Sort is just Insertion Sort with a gap, which makes it at the very worst &Theta;(N<sup>2</sup>). This occurs when the smallest elements are located in odd positions in the array and the largest elements in the array are located in even positions in the array (or vice-versa).

Shell Sort has a best-case time complexity of &Theta;(NlogN) as the outer for loop will be executed logN times as we reduce the gap by half each time and the inner loop will execute N times. The innermost loop will act as constant time expression if it is never executed, which it won't be in the case that the array is already sorted. Hence, we get a worst-case time complexity of &Theta;(NlogN).

Shell Sort is is not stable but is an in-place sorting algorithm. It does not require any additional memory meaning it has a space complexity of &Theta;(1).

### Potential Improvements
- **Gap Sequences** - choosing the right gap size can improve the algorithm further but this depends on a variety of factors. I've just gone with a basic approach which leads to a worst-case runtime of &Theta;(N<sup>2</sup>) but this can be improved upon by changing the gap sequence. For example, using Hibbard's Sequence or Sedgewick's Sequence lead to better worse-case time complexities.

### Uses and Final Thoughts
Shell Sort is an adapted version of Insertion Sort but this adaptation results in the loss of stability. Insertion sort does not perform well when the gaps between elements are large, and this is where Shell Sort comes in. By introducing the gap sequence, less swaps will be required when the gap between two elements is large.
