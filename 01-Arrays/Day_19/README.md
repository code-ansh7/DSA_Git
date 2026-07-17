# Day 19 - Longest Subarray With Sum = K (Brute Force) 📏

## 🎯 Problem Statement

Given an array of **positive integers** and an integer **K**, find the **length of the longest continuous subarray** whose sum is exactly **K**.

### Example

Input

```text
Array = [1,2,3,1,1,1,1,4,2,3]
K = 6
```

Output

```text
4
```

Explanation

```text
Subarrays with Sum = 6

[1,2,3]      → Length = 3
[2,3,1]      → Length = 3
[3,1,1,1]    → Length = 4
[1,1,4]      → Length = 3
[4,2]        → Length = 2

Longest Length = 4
```

---

# 🧠 Approach

## Brute Force

Generate every possible subarray using two loops.

Maintain a running sum.

Whenever the sum becomes equal to **K**, calculate the subarray length and update the maximum length.

---

# 🔄 Algorithm

1. Initialize `maxLength = 0`.
2. Traverse every possible starting index.
3. Initialize `sum = 0`.
4. Traverse every possible ending index.
5. Add current element to the running sum.
6. If `sum == k`
   - Calculate length
   - Update maximum length
7. If `sum > k` (Positive Array)
   - Break the inner loop.
8. Print `maxLength`.

---

# 🌊 Flowchart

```text
Start
   │
maxLength = 0
   │
Choose Starting Index
   │
sum = 0
   │
Choose Ending Index
   │
sum += arr[end]
   │
sum == k ?
 ┌──┴──┐
 │     │
Yes    No
 │
Calculate Length
 │
Update Maximum Length
 │
sum > k ?
 │
Yes
 │
Break
 │
Continue
```

---

# 🏆 Pattern Learned

## Pattern 19 - Start Index + End Index

### Rule

Fix one starting index.

Increase the ending index.

Keep extending the subarray until all possibilities are checked.

---

### Formula

```java
length = end - start + 1;
```

---

### Used For

- Longest Subarray Sum = K
- Continuous Subarray Problems
- Brute Force Range Problems

---

### Identification

Whenever the question asks:

- Continuous Subarray
- Longest Subarray
- Sum = K

Think about

```text
Start Index + End Index
```

---

# 🚀 Optimization Learned

Since all elements are **positive**:

```text
If sum > K

↓

Break
```

Because adding more positive numbers can never decrease the sum.

---

# ⏱ Complexity

Time Complexity

```text
O(n²)
```

Space Complexity

```text
O(1)
```

---

# 📚 Key Learnings

- Continuous Subarray
- Running Sum
- Start Index
- End Index
- Length Formula
- Early Break Optimization
- Variable Scope
- Brute Force Thinking

---

# 💡 Developer Notes

✔ First range-based problem.

✔ Learned why `sum` belongs inside the outer loop.

✔ Learned why `maxLength` belongs outside the loops.

✔ Understood `length = end - start + 1`.

✔ Built the foundation for Sliding Window.

---

# 📌 Status

✅ Brute Force Completed

⏳ Next: Sliding Window Optimization