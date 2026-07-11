# Day 29 - Best Time to Buy and Sell Stock 📈

## 🎯 Problem Statement

Given an array where each element represents the stock price of a particular day, find the maximum profit that can be earned by buying once and selling once.

Conditions

- Buy only once.
- Sell only once.
- Buy must happen before Sell.

---

## Example

### Input

```text
7 1 5 3 6 4
```

### Output

```text
Best Buy Day  : 2
Best Sell Day : 5
Maximum Profit: 5
```

---

# 🧠 Observation

Profit depends on

```text
Current Price - Minimum Price So Far
```

We never need to check all possible pairs.

We only need to remember

- Lowest price seen so far.
- Maximum profit found so far.

---

# 🚀 Optimal Approach

### Variables Used

```java
minimumPrice
```

Stores the minimum price seen so far.

---

```java
currentProfit
```

Stores the profit for the current day.

---

```java
maximumProfit
```

Stores the maximum profit found so far.

---

```java
buyDay
```

Current minimum price day.

---

```java
bestBuyDay
```

Final answer's buy day.

---

```java
bestSellDay
```

Final answer's sell day.

---

# 📝 Algorithm

### Step 1

Initialize

```java
minimumPrice = arr[0];
maximumProfit = 0;
buyDay = 0;
bestBuyDay = 0;
bestSellDay = 0;
```

---

### Step 2

Traverse the array from index 1.

---

### Step 3

If current price is smaller than minimum price

Update

- minimumPrice
- buyDay

---

### Step 4

Otherwise

Calculate

```text
Current Profit = Current Price - Minimum Price
```

---

### Step 5

If current profit is greater than maximum profit

Update

- maximumProfit
- bestBuyDay
- bestSellDay

---

### Step 6

Print

- Best Buy Day
- Best Sell Day
- Maximum Profit

---

# 🌊 Dry Run

Array

```text
7 1 5 3 6 4
```

| Day | Price | Minimum | Profit | Max Profit |
|----:|------:|--------:|-------:|-----------:|
|1|7|7|0|0|
|2|1|1|0|0|
|3|5|1|4|4|
|4|3|1|2|4|
|5|6|1|5|5|
|6|4|1|3|5|

Final

```text
Buy Day  : 2

Sell Day : 5

Profit   : 5
```

---

# 🧩 Pattern Learned

## Pattern 29 - Minimum Element + Maximum Difference

Rule

Track

```text
Minimum Value So Far
```

Then

```text
Current Value - Minimum Value
```

Keep updating the maximum difference.

---

# 💡 Key Learnings

- Minimum Element Tracking
- Maximum Difference Pattern
- Buy Before Sell Condition
- Index Tracking
- Best Buy Day
- Best Sell Day
- Index vs Day Number

---

# 📚 Developer Notes

✔ Learned the Best Time to Buy and Sell Stock problem.

✔ Understood why buy must happen before sell.

✔ Learned to track minimum price in one traversal.

✔ Learned how to print Buy Day and Sell Day.

✔ Understood the difference between Array Index and Human Day Number.

---

# 💻 Complexity

### Time Complexity

```text
O(n)
```

---

### Space Complexity

```text
O(1)
```

---

# 📌 Status

✅ Best Time to Buy and Sell Stock Completed

🎯 Next

Moore's Voting Algorithm (Optimal) or continue remaining important Array interview patterns.