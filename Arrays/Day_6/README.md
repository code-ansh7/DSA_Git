 # Day 6 - Move Zeroes To End

## Topics Learned

### Move Zeroes To End

* Moving all zeroes to the end of an array
* Maintaining the relative order of non-zero elements
* Rearranging array elements without using an extra array

### Counting Elements

* Counting zeroes in an array
* Counting non-zero elements in an array

## Key Concepts

* Position Pointer Pattern
* Traversal + Copy Pattern
* In-place Array Modification
* Maintaining Relative Order

## Time Complexity

### Move Zeroes To End

O(n)

### Count Zeroes and Non Zeroes

O(n)

## Space Complexity

### Move Zeroes To End

O(1)

### Count Zeroes and Non Zeroes

O(1)
 
## Problems Solved

1. Move Zeroes To End
2. Count Zeroes and Non-Zeroes

## Learning Outcome

* Learned how to rearrange elements inside an array.
* Understood the Position Pointer Pattern.
* Learned the Traversal + Copy approach.
* Practiced counting-based array problems.
* Learned how to solve array modification problems in-place.

## Important Pattern

Use a position pointer to keep track of where the next valid element should be placed.

Example:

```java
int pos = 0;
```

When a non-zero element is found:

```java
arr[pos] = arr[i];
pos++;
```

After placing all non-zero elements, fill the remaining positions with zeroes.

## Status

✅ Day 6 Completed
