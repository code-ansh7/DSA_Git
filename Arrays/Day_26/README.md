# Day 26 - Rearrange Array by Sign 🚀

## 🎯 Problem Statement

Given an array containing an equal number of positive and negative integers,

Rearrange the array so that:

- Positive number comes first.
- Negative number comes second.
- Continue alternating positive and negative numbers.
- Maintain the relative order of positive and negative elements.

---

## Example

### Input

```text
3 -2 1 -5 2 -4
```

### Output

```text
3 -2 1 -5 2 -4
```

---

# 🧠 Brute Force Thinking

Separate positive and negative numbers into two arrays.

Merge them alternately.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(n)
```

Problem

Uses extra arrays.

---

# 💡 Observation

Positive numbers should always occupy

```text
Even Index

0

2

4

6...
```

Negative numbers should always occupy

```text
Odd Index

1

3

5

7...
```

Instead of creating two separate arrays,

directly place every element into its correct position.

---

# 🚀 Optimal Idea

Create one answer array.

Maintain

```text
positiveIndex = 0

negativeIndex = 1
```

Whenever

Positive comes

↓

Store at positiveIndex

↓

positiveIndex += 2

Whenever

Negative comes

↓

Store at negativeIndex

↓

negativeIndex += 2

Done.

---

# 🌊 Algorithm

1. Create Answer Array.

2. Initialize

```text
positiveIndex = 0

negativeIndex = 1
```

3. Traverse the original array.

4. If current element is positive

↓

Store at positiveIndex

↓

positiveIndex += 2

5. Else

↓

Store at negativeIndex

↓

negativeIndex += 2

6. Print Answer Array.

---

# 🌊 Flowchart

```text
                START
                   │
                   ▼
         Create Answer Array
                   │
                   ▼
     positiveIndex = 0

     negativeIndex = 1
                   │
                   ▼
       Traverse Original Array
                   │
                   ▼
      Current > 0 ?
          │            │
        YES            NO
         │              │
         ▼              ▼
 Store at Even      Store at Odd
    Position          Position
         │              │
         ▼              ▼
 positiveIndex +=2  negativeIndex +=2
          │             │
          └──────┬──────┘
                 ▼
          Next Element
                 │
                 ▼
        Print Answer Array
                 │
                 ▼
                END
```

---

# 🏆 Pattern Learned

## Pattern 26 - Alternate Placement Pattern

### Rule

Maintain two indexes.

One for even positions.

One for odd positions.

---

### Used For

- Rearranging Arrays
- Alternate Placement
- Positive Negative Problems
- Even Odd Position Problems

---

### Identification

Question says

```text
Positive

Negative

Positive

Negative
```

Think

```text
Even Index

Odd Index
```

---

# 📚 Key Learnings

- Alternate Placement
- Extra Array
- Even Index
- Odd Index
- Two Position Variables
- Relative Order Preservation

---

# 💻 Developer Notes

✔ Derived the complete algorithm without hints.

✔ Learned alternate placement strategy.

✔ Preserved relative order.

✔ Solved optimal O(n) solution.

---

# ⚡ Time Complexity

```text
O(n)
```

---

# ⚡ Space Complexity

```text
O(n)
```

---

# 📌 Status

✅ Rearrange Array by Sign Completed

🎯 Next

Maximum Product Subarray