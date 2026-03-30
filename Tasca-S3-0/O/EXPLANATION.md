# 🧩• Exercise - S`O`LID (Open/Closed Principle)

---

## 1. ❌ What was wrong?

The original implementation used a series of `if-else` statements to determine which instrument to play based on a `String` value.

```
if ("guitar".equals(instrument)) {
    ...
} else if ("drums".equals(instrument)) {
    ...
}
```

This approach tightly couples the `InstrumentPlayer` class with all possible instrument types. Every new instrument requires modifying this class.

---

## 2. ⚠️ Why did it violate the Open/Closed Principle?

The **Open/Closed Principle (OCP)** states that:

> Software entities should be open for extension but closed for modification.

The original code violates this principle because:

* Adding a new instrument (e.g., `"violin"`) requires **modifying existing code**
* The `InstrumentPlayer` class is **not closed for modification**
* The behavior is not extensible without changing core logic

---

## 3. ✅ What solution was applied and why?

To fix this, we applied **polymorphism** and introduced an abstraction:

### ✔ Solution:

* Created an `Instrument` interface with a `play()` method
* Implemented concrete classes (`Guitar`, `Drums`, `Piano`)
* Modified `InstrumentPlayer` to depend on the abstraction instead of concrete logic

### ✔ Why this works:

* New instruments can be added by simply creating new classes
* No need to modify `InstrumentPlayer` anymore
* The system is now **open for extension** and **closed for modification**