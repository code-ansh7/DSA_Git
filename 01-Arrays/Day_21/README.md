# Day 21 - Maximum Sum Subarray (Fixed Size Sliding Window) 🚀

## 🎯 Problem Statement

Given an array and an integer **K**, find the **maximum sum** of any continuous subarray having **exactly K elements**.

### Example

Input

```text
Array = [2,5,1,8,2,9,3]
K = 3
```

Output

```text
Maximum Sum = 19

Best Window = [8,2,9]
```

---

# 🧠 Approach

Instead of recalculating the sum of every window,

Maintain a **fixed-size sliding window**.

- Expand window using the Right Pointer.
- If window size becomes greater than K, shrink it from the Left.
- Update Maximum Sum whenever window size becomes exactly K.

---

# 🚀 Algorithm

1. Initialize
   - sum = 0
   - maxSum = 0
   - left = 0

2. Traverse using Right Pointer.

3. Add current element to Running Sum.

4. If Window Size > K
   - Remove left element.
   - Move left pointer.

5. If Window Size == K
   - Compare current sum with maximum sum.
   - Update answer if needed.
   - Store best window indexes.

6. Print Maximum Sum and Best Window.

---

# 🌊 Flowchart

```text
Start

↓

left = 0
sum = 0
maxSum = 0

↓

Move Right Pointer

↓

sum += arr[right]

↓

Window Size > K ?

↓

Yes

↓

Remove arr[left]

↓

left++

↓

Window Size == K ?

↓

Yes

↓

sum > maxSum ?

↓

Update Maximum Sum

↓

Store Window

↓

Continue
```

---

# 🏆 Pattern Learned

## Pattern 21 - Fixed Size Sliding Window

### Rule

Maintain a window of fixed length.

Whenever the window becomes larger than K,

remove one element from the left.

---

### Flow

```text
Expand Window

↓

Window Size > K ?

↓

Shrink Window

↓

Window Size == K ?

↓

Process Answer
```

---

### Used For

- Maximum Sum Subarray
- Minimum Sum Subarray
- Average of K Elements
- Fixed Length Window Problems
- Rolling Window Calculations

---

### Identification

Whenever the question contains

- Exactly K Elements
- Fixed Window
- Maximum / Minimum Sum
- Continuous Subarray

Think

```text
Fixed Size Sliding Window
```

---

# ⚡ Optimization

Brute Force

```text
O(n × k)
```

Sliding Window

```text
O(n)
```

Reason

Every element enters and leaves the window only once.

---

# 📚 Key Learnings

- Fixed Size Sliding Window
- Running Sum
- Window Expansion
- Window Shrinking
- Window Size Formula
- Best Window Tracking
- Edge Case Handling
- Two Pointer Technique

---

# 💡 Developer Notes

✔ First Fixed Size Sliding Window problem.

✔ Implemented two different approaches.

✔ Stored Best Window indexes.

✔ Printed the actual maximum sum window.

✔ Learned why Window Size must be updated after shrinking.

✔ Learned difference between reusable variables and recalculated values.

---

# 📌 Status

✅ Fixed Size Sliding Window Completed

⏳ Next

- More Sliding Window Variations
- Prefix Sum
- Kadane's Algorithm