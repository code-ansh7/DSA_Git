# Day 25 - Longest Consecutive Sequence (HashSet) 🚀

## 🎯 Problem Statement

Given an unsorted array, find the length of the longest consecutive sequence.

### Example

Input

```text
Array = [100,4,200,1,3,2]
```

Output

```text
Longest Length = 4

Sequence = 1 2 3 4
```

---

# 🧠 Brute Force Approach

For every element,

search its next consecutive element using a loop.

### Time Complexity

```text
O(n²)
```

Problem

Searching every element repeatedly.

---

# 💡 Observation

Only sequence starting points should be considered.

A number is a starting point if

```text
Current - 1
```

does NOT exist.

Example

```text
100 ✔

200 ✔

1 ✔

4 ✖

3 ✖

2 ✖
```

---

# 🚀 Why HashSet?

Question repeatedly asks

```text
Does x exist?
```

Searching inside an array takes

```text
O(n)
```

HashSet provides

```text
Average O(1)
```

search.

---

# 📦 HashSet Role

HashSet stores only values.

Example

```text
{100,4,200,1,3,2}
```

Purpose

Fast existence checking.

---

# 🌊 Algorithm

1. Store every array element inside HashSet.

2. Traverse the array.

3. Check

```text
Current - 1
```

exists?

YES

↓

Skip

(Not a starting point)

NO

↓

Starting point found.

4. Initialize

```text
Current = Starting Value

Length = 1
```

5. While

```text
Current + 1
```

exists

↓

Current++

↓

Length++

6. Compare

```text
Length > MaxLength
```

↓

Update

```text
MaxLength

BestStartValue
```

7. Print sequence.

---

# 🌊 Flowchart

```text
                START
                   │
                   ▼
         Create HashSet
                   │
                   ▼
     Store All Array Elements
                   │
                   ▼
        Traverse Every Number
                   │
                   ▼
      Previous Exists ?
(Current - 1 in HashSet)
          │            │
        YES            NO
         │              │
         ▼              ▼
      Continue     Starting Point
                         │
                         ▼
                 Current = Number
                 Length = 1
                         │
                         ▼
        Current + 1 Exists ?
               │          │
             YES          NO
              │            │
              ▼            ▼
         Current++     Compare Length
         Length++           │
                            ▼
                  Update MaxLength
                  Update BestStart
                            │
                            ▼
                     Next Element
                            │
                            ▼
                           END
```

---

# 🏆 Pattern Learned

## Pattern 25 - HashSet Search Pattern

### Rule

Whenever repeated searching is required,

consider HashSet.

---

### Used For

- Existence Checking
- Consecutive Sequence
- Duplicate Detection
- Fast Searching

---

### Identification

Whenever question asks

```text
Does x exist?
```

Think

```text
HashSet
```

---

### Golden Lines

Starting Point

↓

Expand Sequence

↓

Update Maximum

---

Search

↓

HashSet

↓

O(1)

---

# 📚 Key Learnings

- HashSet
- Fast Searching
- Starting Point Identification
- Consecutive Sequence
- Continue Statement
- Best Sequence Tracking

---

# 💻 Developer Notes

✔ Understood why HashSet is needed.

✔ Learned Starting Point Observation.

✔ Solved Longest Consecutive Sequence.

✔ Printed Longest Sequence.

✔ Learned interview-standard O(n) solution.

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

✅ Longest Consecutive Sequence Completed

🎯 Next

- Rearrange Array by Sign
- Two Pointer + Extra Array