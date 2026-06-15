# Day 7 - Remove Duplicates From Sorted Array

## Topics Learned

### Remove Duplicates From Sorted Array

* Removing duplicate elements from a sorted array
* Keeping only unique elements
* Maintaining the order of unique elements

## Key Concepts

* Adjacent Comparison Pattern
* Position Pointer Pattern
* In-place Array Modification
* Unique Element Identification

## Time Complexity

### Remove Duplicates From Sorted Array

O(n)

## Space Complexity

### Remove Duplicates From Sorted Array

O(1)

## Problems Solved

1. Remove Duplicates From Sorted Array

## Learning Outcome

* Learned how to identify unique elements in a sorted array.
* Understood why duplicates in a sorted array appear adjacent to each other.
* Practiced combining multiple DSA patterns in a single problem.
* Learned how to collect unique elements using a position pointer.

## Important Patterns

### Adjacent Comparison Pattern

Used to identify duplicates.

Example:

```java
if(arr[i] != arr[i-1])
```

Meaning:

Current element is different from the previous element.

### Position Pointer Pattern

Used to place unique elements at the correct position.

Example:

```java
arr[pos] = arr[i];
pos++;
```

## Important Observation

In a sorted array, duplicate elements are always adjacent.

Therefore, comparing:

```java
arr[i]
```

with

```java
arr[i-1]
```

is enough to identify duplicates.

## Status

✅ Day 7 Completed
