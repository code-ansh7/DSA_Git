# Day 27 - Maximum Product Subarray 🚀

## 🎯 Problem Statement

Given an integer array, find the contiguous subarray that has the maximum product.

---

## Example

### Input

```text
2 3 -2 4 -2
```

### Output

```text
96
```

---

# 🧠 Approaches Learned

## 🥉 Approach 1 - Brute Force

### Idea

Generate every possible subarray.

Calculate its product.

Keep updating the maximum product.

### Algorithm

1. Start every index as a new subarray.
2. Keep multiplying elements.
3. Update maximum product.
4. Print answer.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

---

## 🥈 Approach 2 - Prefix & Suffix Product

### Idea

Traverse the array from both directions.

Sometimes the answer appears while moving from left.

Sometimes the answer appears while moving from right.

Track both products simultaneously.

If any product becomes zero,

restart it from 1 because a new subarray begins after zero.

### Algorithm

1. Initialize

```text
prefix = 1

suffix = 1

answer = arr[0]
```

2. Traverse the array once.

3. If prefix becomes zero

```text
prefix = 1
```

4. If suffix becomes zero

```text
suffix = 1
```

5. Update

```text
prefix *= arr[i]

suffix *= arr[n-1-i]
```

6. Update answer using

```text
Maximum of

answer

prefix

suffix
```

7. Print answer.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

---

## 🥇 Approach 3 - Interview Optimal

### Idea

Maintain

- Current Maximum Product
- Current Minimum Product

because

A negative number can convert

Minimum Product

↓

Maximum Product

and

Maximum Product

↓

Minimum Product

### Algorithm

For every element

Compare

- Current Element
- Current × Previous Maximum
- Current × Previous Minimum

Update

Current Maximum

Current Minimum

Finally update Answer.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

---

# 💡 Key Observations

✔ Product behaves differently from Sum.

✔ Two negative numbers produce a positive product.

✔ Zero breaks the product chain.

✔ Prefix and Suffix traversal can detect the maximum product efficiently.

✔ Current Maximum and Current Minimum are tracked in the interview-optimal solution.

---

# 🧩 Pattern Learned

## Pattern 27 - Prefix & Suffix Product Pattern

### Rule

Traverse the array from

- Left → Right
- Right → Left

Track both products simultaneously.

Reset product when it becomes zero.

---

### Used For

- Maximum Product Subarray
- Product-based Problems
- Prefix Product
- Suffix Product
- Zero Reset Pattern

---

### Identification

Question contains

```text
Maximum Product

Subarray

Negative Numbers

Zero
```

Think

```text
Prefix Product

+

Suffix Product
```

---

# 📚 Key Learnings

- Product Traversal
- Prefix Product
- Suffix Product
- Zero Reset Logic
- Product Pattern
- Negative Number Behaviour
- Interview Optimization

---

# 💻 Developer Notes

✔ Learned three different approaches.

✔ Understood why Prefix + Suffix works.

✔ Explored Interview Optimal approach.

✔ Added all approaches in a single learning file for future revision.

✔ Compared Brute Force vs Optimal solutions.

---

# 📌 Status

✅ Maximum Product Subarray Completed

🎯 Next

Longest Subarray with Positive Product / Arrays Module Completion