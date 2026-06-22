# Day 14 - Intersection of Two Arrays

## Topics Learned

### Intersection of Two Arrays
- Find common elements present in both arrays.
- Used Nested Loop Comparison.
- Stored result in a new array using Position Pointer.

---

## Concepts Learned

- Nested Loop Comparison
- Common Element Detection
- Result Array Creation
- Position Pointer (pos)
- break Statement Optimization
- Visited Logic Revision

---

## Logic Used

### Step 1
Take one element from Array 1.

### Step 2
Compare it with all elements of Array 2.

### Step 3
If match found:

```java
arr1[i] == arr2[j]
```

Store element in result array.

### Step 4

```java
arr3[pos] = arr1[i];
pos++;
```

### Step 5

```java
break;
```

Stop unnecessary comparisons.

---

## Problems Solved

1. Intersection of Two Arrays

---

## Pattern Used

Nested Loop
+
Comparison Pattern
+
Position Pointer

---

## Time Complexity

O(n × m)

Where:

- n = size of first array
- m = size of second array

---

## Space Complexity

O(min(n,m))

Because:

```java
int[] arr3 = new int[Math.min(arr1.length, arr2.length)];
```

---

## What I Learned

- How to compare two arrays.
- How to find common elements.
- How to use a result array.
- How to use pos pointer.
- Why break improves performance.
- How visited logic works with duplicate values.

---

## LeetCode Connection

### LeetCode #349

Intersection of Two Arrays

(Currently solved using Brute Force Approach)

---

## Status

✅ Day 14 Completed