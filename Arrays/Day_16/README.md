# Day 16 - Maximum Consecutive Ones 🚀

## 🎯 Problem Statement

Given a binary array, find the maximum number of consecutive `1's`.

### Example

Input:
```text
[1,1,0,1,1,1]
```

Output:
```text
3
```

---

## 🧠 Approach

The idea is to maintain:

- `count` → Current streak of consecutive 1's.
- `max` → Maximum streak found so far.

Whenever:

```java
arr[i] == 1
```

Increase the current streak.

Whenever:

```java
arr[i] == 0
```

Reset the current streak.

At every step, compare:

```java
count > max
```

and update the maximum streak if required.

---

## 🔄 Algorithm

1. Initialize `count = 0` and `max = 0`.
2. Traverse the array.
3. If current element is `1`:
   - Increment `count`.
   - Update `max` if needed.
4. If current element is `0`:
   - Reset `count` to `0`.
5. Print `max`.

---

## 💻 Code Concepts Used

- Array Traversal
- Conditional Statements
- Streak Tracking
- Variable Updating
- Pattern Recognition

---

## 🏆 Pattern Learned

### Pattern 16 - Current Count + Maximum Count

```text
Current Count = Current Streak

Maximum Count = Best Streak Found Till Now
```

This pattern is commonly used in:

- Maximum Consecutive Ones
- Longest Streak Problems
- Sliding Window Problems
- Longest Subarray Questions

---

## ⏱ Complexity Analysis

### Time Complexity

```text
O(n)
```

Single traversal of the array.

### Space Complexity

```text
O(1)
```

Only two variables are used.

---

## 📚 Key Learning

- Difference between current state and best state.
- How streak based problems work.
- Why `count` resets but `max` doesn't.
- Foundation of future Sliding Window problems.

---

## 🚀 Status

✅ Problem Solved

✅ Pattern Understood

✅ Dry Run Completed

✅ Edge Cases Tested

✅ Ready For Advanced Variations