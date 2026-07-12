# Day 30 - Majority Element II (Moore's Voting Algorithm) 🚀

## 🎯 Problem Statement

Given an integer array, find all elements whose frequency is greater than **n/3**.

Note:

- Maximum two majority elements can exist.
- Solve the problem in **O(n)** Time and **O(1)** Space.

---

## Example

### Input

```text
1 2 1 3 1 2 2 2
```

### Output

```text
1 2
```

---

# 🧠 Observation

For an array of size **n**,

Any element must appear

```text
> n/3
```

times.

Maximum possible majority elements

```text
2
```

Therefore,

We only need

- Candidate 1
- Candidate 2

instead of storing every element inside a HashMap.

---

# 🚀 Moore's Voting Algorithm

## Phase 1

Find two possible candidates.

Variables Used

```java
candidate1
candidate2

count1
count2
```

---

## Candidate Selection Rules

### Rule 1

If current element equals candidate1

```java
count1++;
```

---

### Rule 2

If current element equals candidate2

```java
count2++;
```

---

### Rule 3

If count1 becomes zero

```java
candidate1 = currentElement;
count1 = 1;
```

---

### Rule 4

If count2 becomes zero

```java
candidate2 = currentElement;
count2 = 1;
```

---

### Rule 5 (Cancellation Rule)

If current element matches neither candidate
and both counts are non-zero

```java
count1--;
count2--;
```

---

# 🧠 Why Cancellation Works?

The majority element has more occurrences than other elements.

Different elements cancel each other's support.

Since the majority element has extra occurrences, it survives after repeated cancellation.

---

# Phase 2

Reset both counts.

Traverse the array again.

Count the actual frequency of

- candidate1
- candidate2

---

# Phase 3

Print only those candidates whose frequency is

```text
> n/3
```

Otherwise

```text
No Majority Element
```

---

# 📝 Algorithm

Create

```text
candidate1

candidate2

count1

count2
```

↓

Traverse Array

↓

Apply Candidate Selection Rules

↓

Reset Counts

↓

Traverse Again

↓

Count Candidate Frequencies

↓

Frequency > n/3 ?

↓

Print Majority Elements

---

# 💻 Complexity

### Time

```text
O(n)
```

### Space

```text
O(1)
```

---

# 🧩 Pattern Learned

## Pattern 30 - Candidate Elimination Pattern

Idea

Instead of storing frequencies,

keep only possible candidates.

Eliminate non-majority elements using cancellation.

Verify candidates in the second pass.

---

# 💡 Key Learnings

- Moore's Voting Algorithm
- Candidate Selection
- Candidate Elimination
- Cancellation Rule
- Verification Pass
- O(1) Space Optimization

---

# 📚 Developer Notes

✔ Extended Majority Element problem from n/2 to n/3.

✔ Learned why only two candidates are enough.

✔ Understood why cancellation works.

✔ Learned why verification pass is mandatory.

✔ Reduced Space Complexity from O(n) to O(1).

---

# 📌 Status

✅ Majority Element II Completed

🎯 Next

Final important Array Interview Pattern