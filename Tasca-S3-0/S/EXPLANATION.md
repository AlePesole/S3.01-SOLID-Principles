# 🧩• Exercise - `S`OLID (Single Responsibility Principle)

---

## 1. ❌ What was wrong?

The original design placed multiple responsibilities inside a single class (`User`):

* Storing user data
* Validating email and password
* Handling the registration process
* Sending confirmation emails
* Managing user confirmation

👉 This made the class **too complex and overloaded**, mixing different types of logic in one place.

---

## 2. ⚠️ Why did it violate the principle?

It violated the **Single Responsibility Principle (SRP)** because:

> A class should have only **one reason to change**.

In the original code, the `User` class had **multiple reasons to change**, for example:

* If validation rules change → modify `User`
* If email logic changes → modify `User`
* If registration flow changes → modify `User`

👉 This means the class was handling **multiple responsibilities**, which directly breaks SRP.

---

## 3. ✅ What solution was applied and why?

The solution was to **separate responsibilities into different classes**, each focused on a single task:

* `User` → handles only user data
* `UserValidator` → handles user validation logic
* `EmailConfirmation` → handles email and confirmation logic
* `UserRegistrator` → manages the registration process

### ✔ Why this works:

* Each class now has **one clear responsibility**
* Changes in one area do not affect others
* The code becomes more **modular, maintainable, and testable**

👉 This design follows SRP by ensuring that each class has **only one reason to change**.
