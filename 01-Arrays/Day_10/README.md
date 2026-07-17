# Day 10 - Frequency Count

## Topics Learned

### Frequency of One Element
- Counting how many times a target element appears in an array.
- Using traversal and counting.

### Frequency of All Elements
- Counting frequency of every unique element.
- Avoiding duplicate printing.
- Using visited logic.

## Key Concepts

- Frequency Count
- Visited Logic
- Continue Statement
- Past Check Concept

## Time Complexity

### Frequency of One Element
O(n)

### Frequency of All Elements
O(n²)

## Space Complexity

### All Problems
O(1)

## Problems Solved

1. Frequency of One Element
2. Frequency of All Elements

## Learning Outcome

- Learned how frequency counting works.
- Understood why duplicate frequencies should not be printed multiple times.
- Learned visited checking.
- Learned how continue statement can skip unnecessary processing.
- Understood the concept of checking previous occurrences.

## Important Logic

### Frequency of One Element

```java
count = 0;

for(int i = 0; i < arr.length; i++)
{
    if(arr[i] == target)
    {
        count++;
    }
}
```
