# Day 23 - Prefix Sum + HashMap (Subarray Sum Equals K) 🚀

## 🎯 Problem Statement

Given an array and an integer K, find any one continuous subarray whose sum is exactly K.

### Example

Input

```text
Array = [3,4,-7,1,3,3,1,-4]

K = 7
```

Output

```text
Subarray = [3,4]

or

Subarray = [3,3,1]
```

---

# 🧠 Brute Force Approach

Check every possible subarray.

### Algorithm

1. Start from every index.
2. Calculate running sum.
3. If sum becomes K, print subarray.

### Time Complexity

O(n²)

Problem:

Repeated calculation of sums.

---

# 💡 Observation

Negative numbers are present.

Sliding Window cannot be used because the running sum may increase or decrease unpredictably.

Need another approach.

---

# 📚 Prefix Sum Idea

Store running Prefix Sum.

Formula

```text
Current Prefix = Previous Prefix + Current Element
```

---

# 🚀 Core Observation

If

```text
Current Prefix - Old Prefix = K
```

Then

```text
Old Prefix = Current Prefix - K
```

Meaning:

If an old Prefix Sum equal to

```text
Current Prefix - K
```

already exists,

then the subarray between those two positions has sum K.

---

# 💡 Why HashMap?

Searching Old Prefix inside Prefix Array

takes

```text
O(n)
```

HashMap allows searching in

```text
O(1)
```

Average Time.

---

# 🧠 HashMap Storage

```text
Key   → Prefix Sum

Value → Index
```

Example

```text
3 → 0

7 → 1

0 → 2

1 → 3

4 → 4
```

---

# 🚀 Algorithm

1. Initialize Prefix = 0
2. Traverse the array.
3. Update Prefix.
4. If Prefix == K

   Subarray = 0 → Current Index

5. Calculate

```text
Need = Prefix - K
```

6. Search Need inside HashMap.

If found

Subarray = OldIndex + 1 → Current Index

7. Store Current Prefix inside HashMap.

---

# 🌊 Flowchart

```text
Start

↓

Prefix = 0

↓

Traverse Array

↓

Update Prefix

↓

Prefix == K ?

↓

Yes

↓

Answer Found

↓

No

↓

Need = Prefix - K

↓

Need Exists In HashMap ?

↓

Yes

↓

Subarray Found

↓

No

↓

Store Current Prefix

↓

Continue

↓

End
```

---

# 🏆 Pattern Learned

## Pattern 23 - Prefix Sum + HashMap

### Rule

Store previously calculated Prefix Sums inside a HashMap.

Search old Prefix in O(1).

---

### Used For

- Subarray Sum Equals K
- Negative Numbers
- Fast Prefix Search
- Running Sum Problems

---

### Identification

Whenever

- Negative Numbers exist
- Sliding Window fails
- Need fast Prefix searching

Think

```text
Prefix Sum + HashMap
```

---

### Golden Lines

Running Prefix

↓

Need = Prefix - K

↓

Search Old Prefix

↓

Subarray Found

---

# 📚 Key Learnings

- Running Prefix
- Old Prefix
- Need Formula
- HashMap Storage
- Fast Searching
- Prefix Difference
- Prefix Based Subarray Detection

---

# ⚡ Time Complexity

Traversal

```text
O(n)
```

HashMap Search

```text
O(1)
```

Overall

```text
O(n)
```

---

# ⚡ Space Complexity

```text
O(n)
```

---

# 💻 Developer Notes

✔ Understood why Sliding Window fails.

✔ Derived Old Prefix formula manually.

✔ Understood the need for HashMap.

✔ Implemented Prefix + HashMap solution.

✔ Learned O(n) solution for Subarray Sum = K.

---

# 📌 Status

✅ Prefix Sum + HashMap Completed

🎯 Next

- Prefix Sum Advanced Problems
- Longest Subarray With Sum K
- Kadane's Algorithm