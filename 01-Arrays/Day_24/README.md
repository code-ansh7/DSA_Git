# Day 24 - Kadane's Algorithm (Maximum Sum Subarray) 🚀

## 🎯 Problem Statement

Given an array, find the continuous subarray having the maximum possible sum.

### Example

Input

```text
Array = [2,3,-8,7,-1,2,3]
```

Output

```text
Maximum Sum = 11

Subarray = [7,-1,2,3]
```

---

# 🧠 Brute Force Approach

Generate every possible subarray.

Calculate the sum of each subarray.

Store the maximum.

### Time Complexity

```text
O(n²)
```

Problem

Repeated calculation of subarray sums.

---

# 💡 Observation

If the current running sum becomes negative,

continuing with it will only decrease future sums.

Instead of carrying a negative sum,

start a new subarray.

---

# 🚀 Kadane's Algorithm

Maintain only two variables.

```text
Current Sum

Maximum Sum
```

Whenever Current Sum becomes negative,

reset it.

---

# 🌊 Algorithm

1. Initialize

```text
Current Sum = 0

Maximum Sum = -∞
```

2. Traverse the array.

3. Add current element into Current Sum.

4. If Current Sum is greater than Maximum Sum

Update Maximum Sum.

5. If Current Sum becomes negative

Reset Current Sum to 0.

6. Continue till the end.

---

# 🌊 Flowchart

```text
                START
                   │
                   ▼
        Current Sum = 0
        Maximum Sum = -∞
                   │
                   ▼
          Traverse Array
                   │
                   ▼
      Current Sum += arr[i]
                   │
                   ▼
    Current Sum > Maximum Sum ?
            │               │
          YES               NO
           │                 │
           ▼                 │
 Update Maximum Sum          │
 Save Best Window            │
           │                 │
           └──────────┐      │
                      ▼      │
          Current Sum < 0 ?
              │          │
            YES          NO
             │            │
             ▼            │
      Current Sum = 0     │
      Current Start=i+1   │
             │            │
             └──────┬─────┘
                    ▼
             Next Element
                    │
                    ▼
                   END
```

---

# 🏆 Pattern Learned

## Pattern 24 - Kadane's Algorithm

### Rule

Never carry a negative running sum.

If Current Sum becomes negative,

start a fresh subarray.

---

### Used For

- Maximum Sum Subarray
- Continuous Subarray Problems
- Greedy Optimization
- Interview Problems

---

### Identification

Whenever the question contains

- Maximum Sum
- Continuous Subarray
- Largest Sum

Think

```text
Kadane's Algorithm
```

---

### Golden Lines

Negative Running Sum

↓

Forget Previous Journey

↓

Start Fresh

---

Current Sum

↓

Compare

↓

Maximum Sum

---

# 📚 Key Learnings

- Kadane's Algorithm
- Running Sum
- Maximum Sum
- Reset Concept
- Greedy Thinking
- Best Window Tracking

---

# 💻 Developer Notes

✔ Understood why carrying a negative sum is harmful.

✔ Derived Kadane's Algorithm manually.

✔ Tracked Maximum Sum.

✔ Printed Maximum Sum Subarray.

✔ Learned interview-standard O(n) solution.

---

# ⚡ Time Complexity

```text
O(n)
```

---

# ⚡ Space Complexity

```text
O(1)
```

---

# 📌 Status

✅ Kadane's Algorithm Completed

🎯 Next

- Longest Consecutive Sequence
- HashSet