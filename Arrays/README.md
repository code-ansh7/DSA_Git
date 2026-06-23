# Arrays 🚀

Arrays are the first and most fundamental topic in Data Structures and Algorithms.

## Arrays Progress

Day 1  - Traversal Basics
Day 2  - Search Basics
Day 3  - Max / Min
Day 4  - Second Largest
Day 5  - Sorted Array Check
Day 6  - Move Zeroes
Day 7  - Remove Duplicates
Day 8  - Array Rotation
Day 9  - Reverse & Palindrome
Day 10 - Frequency Count
Day 11 - Majority Element
Day 12 - Missing Number
Day 13 - Duplicate Elements

## Progress

### Day 1 ✅
- Time Complexity
- O(1), O(n), O(n²), O(log n)
- Array Sum
- Array Minimum
- Array Maximum

### Day 2 ✅
- Array Traversal
- Reverse Traversal
- Array Indexing
- arr.length

### Day 3 ✅
- Linear Search
- First Occurrence
- Last Occurrence
- Count Occurrences

### Day 4 ✅
- Largest Element
- Second Largest Element
- Two Loop Approach
- Single Loop Approach

### Day 5 ✅
- Check Sorted Array
- Strictly Increasing Array
- Adjacent Comparison
- Condition Checking

### Day 6 ✅
- Move Zeroes To End
- Count Zeroes
- Count Non-Zeroes
- Position Pointer

### Day 7 ✅
- Remove Duplicates From Sorted Array
- Duplicate Detection
- Position Pointer + Adjacent Comparison

### Day 8 ✅
- Left Rotate By One
- Right Rotate By One
- Left Rotate By N
- Rotation Formula (k % n)
- Traversal + Shifting

### Day 9 ✅
- Reverse Array
- Palindrome Array
- Two Pointer Pattern
- Swap Logic
- Violation Concept

### Day 10 ✅
- Frequency of One Element
- Frequency of All Elements
- Visited Logic
- Continue Statement
- Past Check Logic

### Day 11 ✅
- Majority Element
- Found Variable
- Break Statement
- Frequency + Condition Checking

### Day 12 ✅
- Missing Number (1 to N)
- Missing Number (0 to N)
- Expected Sum
- Actual Sum
- Observation Based Questions
- Formula Based Thinking
- LeetCode #268 Missing Number

### Day 13 ✅
- Find Duplicate Elements
- Frequency Of Duplicate Elements
- Visited Logic Revision
- Dry Run Tables
- LeetCode #217 Contains Duplicate

### Day 14 ✅
- Intersection of Two Arrays
- Nested Loop Comparison
- Result Array
- Position Pointer
- break Optimization
- LeetCode #349 Connection

 ### Day 15 ✅
- Union of Two Arrays
- Result Array
- Position Pointer
- Duplicate Handling
- Multi Array Handling

---

## Problems Solved

1. Array Sum
2. Array Minimum
3. Array Maximum
4. Array Traversal
5. Reverse Traversal
6. Linear Search
7. First Occurrence
8. Last Occurrence
9. Count Occurrences
10. Largest Element
11. Second Largest Element (Two Loops)
12. Second Largest Element (Single Loop)
13. Check Sorted Array
14. Count Order Of Breaks
15. Strictly Increasing Array
16. Move Zeroes To End
17. Count Zeroes
18. Count Non-Zeroes
19. Remove Duplicates From Sorted Array
20. Left Rotate By One
21. Right Rotate By One
22. Left Rotate By N
23. Reverse Array
24. Check Palindrome Array
25. Frequency Of One Element
26. Frequency Of All Elements
27. Majority Element
28. Missing Number (1 to N)
29. Missing Number (0 to N)
30. Find Duplicate Elements
31. Frequency Of Duplicate Elements
32. Intersection of Two Arrays
33. Union of Two Arrays

---

## Patterns Learned

### Pattern 1 - Traversal
Used For:
- Sum
- Count
- Print
- Reverse Traversal

### Pattern 2 - Linear Search
Used For:
- Search Element
- First Occurrence
- Last Occurrence
- Count Occurrences

### Pattern 3 - Max / Min
Used For:
- Largest Element
- Smallest Element
- Second Largest
- Second Smallest

### Pattern 4 - Adjacent Comparison
Used For:
- Sorted Array
- Strictly Increasing Array
- Duplicate Detection

### Pattern 5 - Condition Checking
Rule:
- Assume condition is true.
- Find violation.
- Make condition false.

Used For:
- Sorted Array
- Strictly Increasing Array
- Palindrome Check
- Majority Check

### Pattern 6 - Position Pointer
Used For:
- Move Zeroes To End
- Remove Duplicates
- In-Place Modification

### Pattern 7 - Traversal + Shifting
Used For:
- Left Rotation
- Right Rotation
- Rotate By N

### Pattern 8 - Two Pointer
Used For:
- Reverse Array
- Palindrome Array
- Reverse String

### Pattern 9 - Frequency Counting
Used For:
- Count Occurrences
- Frequency Of Elements
- Majority Element

### Pattern 10 - Visited Logic
Rule:
- Check whether current element has already appeared before.
- If yes, skip it.
- If no, process it.
Used For:
- Frequency Of All Elements
- Majority Element

### Pattern 11 - Observation + Formula
Rule:
Expected Value - Actual Value = Answer

Used For:
- Missing Number
- Sum Based Problems
- Mathematical Observation Questions

### Pattern 12 - Visited + Frequency

Rule:

Already Visited?
↓
Yes → Skip

No
↓
Count Frequency
↓
Frequency > 1
↓
Duplicate Found

Used For:
- Duplicate Elements
- Majority Element
- Frequency Count

### Pattern 13 - Comparison Between Two Arrays

Rule:

Take one element from Array 1 and compare it with all elements of Array 2.

Used For:
- Intersection of Two Arrays
- Common Element Detection
- Pair Matching Problems

Identification:

Whenever the question contains two arrays and asks for common elements, matching elements, or pair checking, this pattern can be used.

Time Complexity:

O(n × m)

### Pattern 14 - Result Array + Position Pointer

Rule:

Store valid elements in a new result array using a position pointer.

Example:

arr3[pos] = value;
pos++;

Used For:
- Intersection of Arrays
- Union of Arrays
- Remove Duplicates
- Move Zeroes

Identification:

Whenever a question asks to create a new array containing only valid elements, use a result array and a position pointer.

Important:

pos always points to the next empty position.


### Pattern 15 - Search Before Insert

Rule:

Before storing an element in the result array, first check whether it already exists.

Flow:

Take Element

↓

Search In Result Array

↓

Already Present?

↓ 
         ↓

Yes      No

↓

Skip

            ↓

         Store

            ↓
            
          pos++

Used For:
- Union of Two Arrays
- Unique Elements
- Remove Duplicates
- Set Simulation

Identification:

Whenever the question says:
- Unique Elements
- No Duplicates
- Store Only Once

Use Search Before Insert Pattern.

Important:

Never insert an element without checking whether it already exists.

Golden Line:

Search First,
Insert Later.
---

## Important Concepts Learned

- Time Complexity
- Space Complexity
- Array Traversal
- Linear Search
- Max / Min Logic
- Adjacent Comparison
- Condition Checking
- Violation Concept
- Position Pointer
- Rotation Logic
- Left Shift
- Right Shift
- Two Pointer
- Frequency Count
- Visited Logic
- Observation Based Thinking
- Formula Based Thinking
- Duplicate Detection
- Majority Element Logic
- Missing Number Logic
- Continue Statement
- Break Statement
- Found Variable
- Dry Run Tables
- Pattern Recognition
- Result Array
- Common Element Detection
- Nested Loop Comparison
- Position Pointer Revision
- Multi Array Handling
- Unique Element Detection
- Duplicate Handling
- Multi Array Handling
- Result Array

---

## Total Stats

- Days Completed: 15
- Problems Solved: 33
- Patterns Learned: 15

## Current Status

✅ Arrays Basics Completed (Strong Foundation)

🎯 Next Goal:
- More Array Interview Questions
- Medium Level Array Problems
- Placement-Oriented Logic Building