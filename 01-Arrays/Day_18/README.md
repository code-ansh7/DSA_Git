# Day 18 - Single Number using XOR ⚡

## 🎯 Problem Statement

Given an integer array where every element appears **exactly twice** except for **one unique element**, find that unique element.

### Example

**Input**

```text
[1, 4, 2, 1, 7, 4, 2]
```

**Output**

```text
7
```

---

# 🧠 Approaches

## Approach 1 - Brute Force (Visited + Frequency)

### Idea

- Skip already visited elements.
- Count the frequency of every unvisited element.
- The element with frequency **1** is the answer.

### Time Complexity

```text
O(n²)
```

### Space Complexity

```text
O(1)
```

---

## Approach 2 - XOR (Optimal)

### Idea

Use XOR properties:

```text
A ^ A = 0

A ^ 0 = A
```

Every duplicate pair cancels itself.

Only the unique element remains.

---

# 🔄 Algorithm

1. Initialize

```java
int result = 0;
```

2. Traverse the array.

3. XOR every element with `result`.

```java
result ^= arr[i];
```

4. Print `result`.

---

# 🌊 Flowchart

```text
Start
   │
result = 0
   │
Traverse Array
   │
result = result ^ arr[i]
   │
Loop Ends
   │
Print result
```

---

# 🏆 Pattern Learned

## Pattern 18 - XOR Pair Cancellation

### Rule

Duplicate pairs cancel each other automatically.

Only the unique element remains.

---

### XOR Properties

```text
A ^ A = 0

A ^ 0 = A

A ^ B = B ^ A
```

---

### Formula

```java
int result = 0;

for(...)
{
    result ^= arr[i];
}
```

---

### Used For

- Single Number
- Duplicate Pair Cancellation
- Bit Manipulation Basics

---

### Identification

Whenever the question says:

- Every duplicate appears exactly twice.
- Only one unique element exists.

Think about **XOR**.

---

### Limitation

This approach works only when:

- Every duplicate element appears **exactly twice**.
- Only **one unique element** exists.

---

# ⏱ Complexity Analysis

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

---

# 📚 Key Learnings

- XOR Operator (^)
- Binary Thinking
- Pair Cancellation
- Optimal Thinking
- Bit Manipulation Introduction

---

# 🚀 Developer Notes

✔ Solved Brute Force using Visited + Frequency.

✔ Learned XOR from scratch.

✔ Understood why duplicate pairs disappear.

✔ Understood the limitations of XOR.

✔ Implemented interview-level optimal solution.

---

# 📌 Status

- ✅ Brute Force Completed
- ✅ Optimal Solution Completed
- ✅ Bit Manipulation Started
- ✅ GitHub Ready