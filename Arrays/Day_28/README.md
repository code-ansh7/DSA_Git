# Day 28 - Majority Element (HashMap Approach) 🚀

## 🎯 Problem Statement

Given an integer array, find the element whose frequency is greater than **n/2**.

If no such element exists, print that the majority element is not found.

---

## Example

### Input

```text
2 2 2 1 1
```

### Output

```text
Majority Element : 2
```

---

# 🧠 Approach Learned

## 🥈 HashMap Approach

### Idea

Store the frequency of every element using a HashMap.

After building the frequency table, check which element has a frequency greater than **n/2**.

---

# 📚 HashMap Revision

## HashMap stores

```text
Key → Value
```

Example

```text
2 → 3

1 → 2
```

Meaning

```text
Element → Frequency
```

---

## Operations Used

### Create

```java
HashMap<Integer,Integer> map = new HashMap<>();
```

---

### Insert

```java
map.put(key,value);
```

---

### Get Value

```java
map.get(key);
```

---

### Check Key

```java
map.containsKey(key);
```

---

### Traverse Keys

```java
for(Integer key : map.keySet())
```

---

# 📝 Algorithm

### Step 1

Create an empty HashMap.

---

### Step 2

Traverse the array.

---

### Step 3

If element already exists

```text
Frequency = Frequency + 1
```

Otherwise

```text
Frequency = 1
```

---

### Step 4

Traverse the HashMap.

---

### Step 5

If

```text
Frequency > n/2
```

Store or print the majority element.

---

### Step 6

If no majority element exists

Print

```text
Majority Element Not Found!
```

---

# 🔄 Dry Run

Array

```text
2 2 2 1 1
```

HashMap after traversal

```text
2 → 3

1 → 2
```

Now

```text
3 > 5/2

↓

3 > 2

↓

Majority Element = 2
```

---

# 💡 Key Learnings

- Frequency Counting
- HashMap Revision
- containsKey()
- put()
- get()
- keySet()
- Frequency Table
- Majority Element

---

# 🧩 Pattern Learned

## Pattern 28 - Frequency Counting Pattern

### Rule

Whenever the question asks about

- Frequency
- Count
- Occurrences
- Majority
- Most Frequent Element

Think

```text
HashMap
```

---

### Identification

Question contains

```text
Count

Frequency

Occurrences

Majority
```

↓

Use

```text
HashMap
```

---

# 📚 Developer Notes

✔ Revised HashMap operations.

✔ Understood frequency counting using HashMap.

✔ Implemented Majority Element using HashMap.

✔ Strengthened Java Collections knowledge while solving DSA.

---

# 📌 Status

✅ Majority Element (HashMap Approach) Completed

🎯 Next

Moore's Voting Algorithm (Optimal Approach)