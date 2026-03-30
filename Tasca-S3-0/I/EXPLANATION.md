# 🧩• Exercise - SOL`I`D (Interface Segregation Principle)

---

## 1. ❌ What was wrong?

The problem lies in the design of the `MachineActions` interface .

* It contains **too many unrelated methods**:

  * `turnOn()`, `turnOff()`
  * `heat()`, `cool()`
  * `wash()`

* Classes like `AirConditioner`  and `WashingMachine`  are **forced to implement methods they do not need**.

---

## 2. ⚠️ Why did it violate the principle?

This design violates the **Interface Segregation Principle (ISP)**, which states:

> *A client should not be forced to depend on interfaces they do not use.*

### In this case:

* `AirConditioner` depends on `wash()` even though it doesn't use it
* `WashingMachine` depends on `heat()` and `cool()` unnecessarily

### Consequences:

* Tight coupling to irrelevant behavior
* Increased risk of bugs
* Harder to extend and maintain
* Reduced code clarity

---

## 3. ✅ What solution was applied and why?

The solution was to **split the large interface into smaller, more specific interfaces**.

### New interfaces:

* `Switchable` → `turnOn()`, `turnOff()`
* `TemperatureControl` → `heat()`, `cool()`
* `Washable` → `wash()`

### Why this works:

* Each class implements **only what it needs**

  * `AirConditioner` → `Switchable`, `TemperatureControl`
  * `WashingMachine` → `Switchable`, `Washable`

### Benefits:

* No unnecessary methods
* Better separation of concerns
* More flexible and reusable design
* Easier to extend (add new devices without modifying existing 