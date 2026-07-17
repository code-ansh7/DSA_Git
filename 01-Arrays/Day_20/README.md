# Day 20 - Longest Subarray With Sum = K (Sliding Window) 🚀

## 🎯 Problem Statement

Given an array of **positive integers** and an integer **K**, find the **length of the longest continuous subarray** whose sum is exactly **K**.

### Example

Input

```text
Array = [2,1,3,2,1]
K = 3
```

Output

```text
2
```

Explanation

```text
Possible Valid Subarrays

[2,1] → Length = 2
[3]   → Length = 1
[2,1] → Length = 2

Longest Length = 2
```

---

# 🧠 Approach

Instead of generating every possible subarray,

Maintain a **window** using two pointers.

- Expand the window using the Right Pointer.
- Shrink the window using the Left Pointer.
- Maintain a Running Sum.
- Update the answer whenever the window sum becomes K.

---

# 🚀 Algorithm

1. Initialize
   - left = 0
   - sum = 0
   - maxLength = 0

2. Traverse using Right Pointer.

3. Add current element to Running Sum.

4. While sum > K
   - Remove left element.
   - Move left pointer.

5. If sum == K
   - Calculate window length.
   - Update maximum length.

6. Print answer.

---

# 🌊 Flowchart

```text
Start
   │
left = 0
sum = 0
maxLength = 0
   │
Move Right Pointer
   │
sum += arr[right]
   │
sum > K ?
   │
Yes
   │
Remove arr[left]
   │
left++
   │
Repeat Until Valid
   │
sum == K ?
   │
Yes
   │
Calculate Length
   │
Update Maximum Length
   │
Continue
```

---

# 🏆 Pattern Learned

## Pattern 20 - Sliding Window

### Rule

Expand the window using the Right Pointer.

Shrink the window using the Left Pointer.

Maintain the Running Sum without recalculating.

---

### Flow

```text
Expand Window

↓

Running Sum

↓

sum > K ?

↓

Shrink Window

↓

sum == K ?

↓

Update Answer
```

---

### Used For

- Longest Subarray
- Smallest Subarray
- Maximum Sum Window
- Minimum Size Window
- Continuous Range Problems

---

### Identification

Whenever the question contains

- Continuous Subarray
- Positive Numbers
- Longest / Smallest
- Sum = K

Think

```text
Sliding Window
```

---

# ⚡ Optimization

Brute Force

```text
O(n²)
```

Sliding Window

```text
O(n)
```

Reason

Every pointer moves only forward.

No repeated sum calculation.

---

# 📚 Key Learnings

- Sliding Window
- Left Pointer
- Right Pointer
- Running Sum
- Window Expansion
- Window Shrinking
- Reuse Previous Sum
- Variable Scope
- while vs if
- Two Pointer Optimization

---

# 💡 Developer Notes

✔ First Optimal O(n) Algorithm.

✔ Learned why Right Pointer never moves backward.

✔ Learned why Left Pointer shrinks the window.

✔ Understood Running Sum optimization.

✔ Understood while vs if through dry run.

✔ Built the foundation for future Sliding Window problems.

---

# 📌 Status

✅ Sliding Window Foundation Completed

⏳ Next:
- More Sliding Window Problems
- Variable Size Window
- Fixed Size Window