# Day 22 - Prefix Sum (Range Sum Query) 🚀

## 🎯 Problem Statement

Given an array and two indexes (Left and Right), find the sum of all elements between them.

### Example

Input

```text
Array = [2,5,1,8,2,9,3]

Left = 2
Right = 5
```

Output

```text
20
```

---

# 🧠 Brute Force Approach

Loop from Left to Right and calculate the sum.

### Algorithm

1. Initialize sum = 0.
2. Traverse from Left to Right.
3. Add every element.
4. Print sum.

### Time Complexity

O(n)

Problem:

If there are 1000 queries, loop runs 1000 times.

---

# 💡 Observation

Instead of calculating the same sums repeatedly,

calculate them once and reuse them.

This idea leads to Prefix Sum.

---

# 📚 Prefix Sum

Prefix Sum stores the sum from index 0 to the current index.

Example

Array

```text
2 5 1 8 2 9 3
```

Prefix

```text
2 7 8 16 18 27 30
```

Meaning

```text
Prefix[0] = 2

Prefix[1] = 2+5 = 7

Prefix[2] = 2+5+1 = 8

...
```

---

# 🚀 Prefix Array Algorithm

1. Create Prefix Array.
2. Store first element.
3. Add previous Prefix Sum with current Array element.

Formula

```text
Prefix[0] = Array[0]

Prefix[i] = Prefix[i-1] + Array[i]
```

---

# 🚀 Range Sum Algorithm

Case 1

If Left == 0

```text
Answer = Prefix[Right]
```

Case 2

If Left > 0

```text
Answer = Prefix[Right] - Prefix[Left-1]
```

---

# 🌊 Flowchart

```text
Start

↓

Create Prefix Array

↓

Store First Element

↓

Build Remaining Prefix Values

↓

Input Left & Right

↓

Left == 0 ?

↓

Yes

↓

Answer = Prefix[Right]

↓

No

↓

Answer = Prefix[Right] - Prefix[Left-1]

↓

Print Answer

↓

End
```

---

# 🏆 Pattern Learned

## Pattern 22 - Prefix Sum

### Rule

Calculate cumulative sums once.

Reuse them to answer multiple range sum queries.

---

### Used For

- Range Sum Query
- Multiple Sum Queries
- Query Optimization
- Cumulative Sum Problems

---

### Identification

Whenever the question contains

- Multiple Range Queries
- Sum Between Two Indexes
- Repeated Sum Calculation

Think

```text
Prefix Sum
```

---

### Golden Lines

Calculate Once.

Reuse Forever.

Don't Recalculate.

Reuse Previous Work.

---

# 📚 Key Learnings

- Prefix Sum
- Prefix Array
- Range Sum Query
- Prefix Construction
- Prefix Formula
- Edge Case Handling
- Query Optimization
- Preprocessing

---

# 💡 Developer Notes

✔ First Prefix Sum problem.

✔ Derived Prefix Array algorithm manually.

✔ Derived Range Sum formula manually.

✔ Understood why Prefix Sum saves time.

✔ Learned preprocessing concept.

✔ Solved Range Sum Query in O(1).

---

# ⚡ Time Complexity

Building Prefix Array

```text
O(n)
```

Each Query

```text
O(1)
```

---

# ⚡ Space Complexity

```text
O(n)
```

---

# 📌 Status

✅ Prefix Sum (Range Sum Query) Completed

🎯 Next

- Prefix Sum + HashMap
- Subarray Sum Equals K