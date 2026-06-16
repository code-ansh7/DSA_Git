 # Day 8 - Array Rotation

## Topics Learned

### Left Rotate By One

* Moving every element one position towards the left.
* First element moves to the last position.

### Right Rotate By One

* Moving every element one position towards the right.
* Last element moves to the first position.

### Left Rotate By N

* Performing multiple left rotations.
* Using modulo operation to reduce unnecessary rotations.

## Key Concepts

* Traversal + Shifting Pattern
* Rotation Logic
* Temporary Variable Usage
* Rotation Optimization

## Time Complexity

### Left Rotate By One

O(n)

### Right Rotate By One

O(n)

### Left Rotate By N

O(n × k)

## Space Complexity

### All Problems

O(1)

## Problems Solved

1. Left Rotate By One
2. Right Rotate By One
3. Left Rotate By N

## Learning Outcome

* Learned array rotation.
* Understood left and right shifting directions.
* Learned why loop direction matters.
* Learned rotation optimization using modulo.
* Practiced debugging rotation logic.

## Important Patterns

### Traversal + Shifting

Used for:

* Left Rotation
* Right Rotation
* Rotate By N
* Circular Movement Problems

### Rotation Formula

```java
k = k % arr.length;
```

Meaning:

Rotate By 12 on an array of length 5:

```text
12 % 5 = 2
```

Therefore:

```text
Rotate By 12 = Rotate By 2
```

## Status

✅ Day 8 Completed
