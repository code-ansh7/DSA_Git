# Day 17 - Longest Consecutive Increasing Subarray 🚀

## 🎯 Problem Statement

Given an integer array, find the length of the **Longest Strictly Increasing Continuous Subarray**.

### Example

**Input**

```text
[2, 5, 8, 1, 3, 4, 2, 9]
```

**Output**

```text
3
```

---

# 🧠 Approach

The idea is to maintain two variables:

* **currentLength** → Length of the current increasing streak.
* **maxLength** → Longest increasing streak found so far.

For every element:

* If the current element is greater than the previous element, extend the current streak.
* Otherwise, start a new streak from the current element.

After every update, compare the current streak with the maximum streak.

---

# 🔄 Algorithm

1. Read the input array.
2. Initialize:

   * `currentLength = 1`
   * `maxLength = 1`
3. Traverse the array from index `1`.
4. If `arr[i] > arr[i-1]`

   * Increment `currentLength`.
5. Else

   * Reset `currentLength = 1`.
6. Update:

```java
if(currentLength > maxLength)
    maxLength = currentLength;
```

7. Print `maxLength`.

---

# 🌊 Flowchart

```text
Start
   │
Initialize
currentLength = 1
maxLength = 1
   │
Traverse Array
   │
arr[i] > arr[i-1] ?
   │
 ┌─Yes─────────────┐
 │                 │
currentLength++    │
 │                 │
 └──────┬──────────┘
        │
       No
        │
currentLength = 1
        │
currentLength > maxLength ?
        │
      Yes
        │
maxLength = currentLength
        │
Continue Loop
        │
Print Answer
```

---

# 🏆 Pattern Learned

## Pattern 17 - Adjacent Comparison + Current Length

### Formula

```text
Current Element
        │
Compare With Previous Element
        │
Increasing?
        │
Yes → currentLength++

No → currentLength = 1
        │
Update Maximum Length
```

---

# 💡 Why Initialization Starts From 1?

A single element itself forms an increasing subarray.

Example:

```text
[10]
```

Longest Increasing Subarray Length = **1**

---

# ⏱ Complexity Analysis

### Time Complexity

```text
O(n)
```

Single traversal.

### Space Complexity

```text
O(1)
```

No extra data structure is used.

---

# 📚 Key Learnings

* Adjacent Comparison Pattern
* Streak Tracking
* Current Length vs Maximum Length
* Initialization Reasoning
* Self Debugging
* Continuous Sequence Detection

---

# 🚀 Developer Notes

✔ Solved without copying solution.

✔ Debugged ArrayIndexOutOfBoundsException independently.

✔ Understood why initialization starts from `1`.

✔ Strengthened the foundation for Sliding Window.

---

# 📌 Status

* ✅ Problem Solved
* ✅ Dry Run Completed
* ✅ Edge Cases Tested
* ✅ Pattern Understood
* ✅ GitHub Ready
