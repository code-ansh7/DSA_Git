# Day 12 - Missing Number

## Topics Learned

### Missing Number (1 to N)
- Find the missing number using Expected Sum and Actual Sum.
- Used formula-based approach instead of searching.

### Missing Number (0 to N)
- Solved LeetCode #268 Missing Number.
- Learned the difference between 1 to N and 0 to N cases.

---

## Concepts Learned

- Observation Based Questions
- Formula Based Thinking
- Expected Sum
- Actual Sum
- Missing Number
- Array Traversal

---

## Formulas

### 1 to N

```java
n = arr.length + 1;
expectedSum = n * (n + 1) / 2;
missingNumber = expectedSum - actualSum;
```

### 0 to N

```java
n = arr.length;
expectedSum = n * (n + 1) / 2;
missingNumber = expectedSum - actualSum;
```

---

## Problems Solved

1. Missing Number (1 to N)
2. Missing Number (0 to N) - LeetCode #268

---

## Time Complexity

O(n)

---

## Space Complexity

O(1)

---

## What I Learned

- Not every array question requires searching.
- Observation can simplify a problem.
- Formula can reduce unnecessary work.
- Learned the difference between 1 to N and 0 to N approaches.
- Solved my first LeetCode-connected array problem.

---

## LeetCode Connection

### LeetCode #268 - Missing Number

Pattern:

Expected Sum - Actual Sum

---

## Status

✅ Day 12 Completed