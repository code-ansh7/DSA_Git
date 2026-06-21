# Day 13 - Duplicate Elements

## Topics Learned

### Duplicate Elements
- Find all duplicate elements in an array.
- Find frequency of duplicate elements.
- Used Visited Logic and Frequency Count together.

---

## Concepts Learned

- Visited Logic
- Frequency Count
- Duplicate Detection
- Dry Run Using Tables
- Pattern Recognition

---

## Logic Used

### Step 1
Check whether current element is already visited.

### Step 2
If visited:
- Skip

### Step 3
If not visited:
- Count frequency

### Step 4
If frequency > 1:
- Print duplicate element

---

## Flowchart

Current Element
↓
Already Visited?
↓         ↓
Yes       No
↓
Skip

          ↓
     Count Frequency
          ↓
      count > 1 ?
       ↓      ↓
      Yes     No
       ↓
Print Duplicate

---

## Problems Solved

1. Find Duplicate Elements
2. Find Frequency Of Duplicate Elements

---

## Dry Run Learning

### Rule

Dry Run Table Columns = Variables Changing In Code

Examples:

- Max Element → i, arr[i], max
- Missing Number → i, arr[i], actualSum
- Duplicate Element → i, arr[i], alreadyVisited, count

---

## Time Complexity

O(n²)

Reason:
- Nested Loops

---

## Space Complexity

O(1)

Reason:
- Only Variables Used

---

## What I Learned

- Difference between Frequency Count and Duplicate Detection.
- Duplicate means frequency > 1.
- Visited Logic prevents repeated processing.
- Learned how to create dry run tables using variables.

---

## LeetCode Connection

### LeetCode #217

Contains Duplicate

Pattern:
Visited Logic + Frequency Count

---

## Status

✅ Day 13 Completed