# Day 15 - Union of Two Arrays

## Topics Learned

### Union of Two Arrays
- Find all unique elements from two arrays.
- Avoid duplicate elements.
- Store unique elements in a result array.

---

## Concepts Learned

- Result Array
- Position Pointer (pos)
- Duplicate Handling
- Visited Logic Revision
- Multi Array Handling
- Nested Loop Comparison

---

## Logic Used

### Step 1

Store unique elements of Array 1 into result array.

### Step 2

Take one element from Array 2.

### Step 3

Check whether it already exists in result array.

### Step 4

If found:

```java
continue;
```

Skip element.

### Step 5

If not found:

```java
arr3[pos] = arr2[i];
pos++;
```

Store element.

---

## Problems Solved

1. Union of Two Arrays

---

## Pattern Used

### Pattern 14 - Result Array + Position Pointer

Rule:

Store valid elements in a new array using a position pointer.

Example:

```java
arr3[pos] = value;
pos++;
```

Used For:
- Union of Arrays
- Intersection of Arrays
- Remove Duplicates
- Move Zeroes

Important:

```text
pos = Next Empty Position
```

---

## Time Complexity

O(n × m)

Reason:

Elements are compared using nested loops.

---

## Space Complexity

O(n + m)

Reason:

Result array stores elements from both arrays.

---

## What I Learned

- Difference between duplicate and unique elements.
- How Union works.
- Why result array is needed.
- Why pos pointer is needed.
- How to avoid duplicate entries.
- How to use visited/found logic.

---

## Status

✅ Day 15 Completed