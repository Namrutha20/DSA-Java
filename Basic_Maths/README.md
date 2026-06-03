# Day 4 - Basic Maths

## Problems Solved

1. Count Digits
2. Reverse Integer
3. Palindrome Number
4. Armstrong Number
5. GCD / HCF
6. Print All Divisors
7. Prime Number Check

---

## Concepts Learned

### 1. Digit Manipulation

Used in:

* Count Digits
* Reverse Integer
* Palindrome Number
* Armstrong Number

Key Operations:

```java
digit = n % 10;   // Extract last digit
n /= 10;          // Remove last digit
```

---

### 2. Reverse Number Pattern

```java
rev = rev * 10 + digit;
```

Used to construct a reversed number digit by digit.

---

### 3. Armstrong Number Logic

An Armstrong Number satisfies:

```text
Sum of (digit ^ total_digits)
=
Original Number
```

Example:

```text
153

1³ + 5³ + 3³
=
153
```

---

### 4. Euclidean Algorithm

Used to find GCD/HCF efficiently.

Formula:

```text
gcd(a,b) = gcd(b,a%b)
```

This reduces the problem size using modulo operations.

---

### 5. Divisor Pair Observation

Divisors always occur in pairs.

Example:

```text
36

1 ↔ 36
2 ↔ 18
3 ↔ 12
4 ↔ 9
6 ↔ 6
```

This observation helps reduce complexity from O(n) to O(√n).

---

### 6. Square Root Optimization

Instead of checking:

```java
for(int i = 1; i <= n; i++)
```

check:

```java
for(int i = 1; i * i <= n; i++)
```

Used in:

* Print Divisors
* Prime Number Check

---

### 7. Early Exit Optimization

Return immediately when the answer is known.

Example:

```java
if(n % i == 0)
    return false;
```

Used in Prime Number Check.

---

## Complexity Summary

| Problem                         | Time Complexity  | Space Complexity |
| ------------------------------- | ---------------- | ---------------- |
| Count Digits (Division)         | O(log n)         | O(1)             |
| Count Digits (Logarithm)        | O(1)             | O(1)             |
| Reverse Integer                 | O(log n)         | O(1)             |
| Palindrome Number               | O(log n)         | O(1)             |
| Armstrong Number                | O(log n)         | O(1)             |
| GCD / HCF (Euclidean Algorithm) | O(log(min(a,b))) | O(1)             |
| Print Divisors                  | O(√n + k log k)  | O(k)             |
| Prime Number Check              | O(√n)            | O(1)             |

---

## Key Takeaways

* `% 10` extracts the last digit.
* `/ 10` removes the last digit.
* `rev = rev * 10 + digit` is the standard reverse-number pattern.
* Euclidean Algorithm is the optimal approach for GCD/HCF.
* Divisors occur in pairs.
* Checking till √n is sufficient for divisor and prime-related problems.
* Mathematical observations can drastically reduce time complexity.

---

## Patterns Mastered

✅ Digit Manipulation

✅ Reverse Number Construction

✅ Armstrong Number Validation

✅ Euclidean Algorithm

✅ Divisor Pair Observation

✅ Square Root Optimization

✅ Early Exit Technique

---

### Day 4 Status

✅ Completed Basic Maths Section of the TUF A2Z DSA Sheet

Total Problems Solved: **7**
