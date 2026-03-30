# 🧩• Exercise - SOLI`D` (Dependency Inversion Principle)

---

## 1. ❌ What was wrong?

The original design (see `old` directory) had two main issues:

* `ServicePerson` directly instantiated a concrete class (`MySql`).
* `ServicePerson` must depend on abstractions (interfaces)

This made the code rigid and harder to extend or test.

---

## 2. ⚠️ Why did it violate the principle?

It violated the **Dependency Inversion Principle (DIP)** because:

* High-level modules (`ServicePerson`) depended on low-level modules (`MySql`).
* There was no abstraction layer between them.
* DIP states:

  > High-level modules should not depend on low-level modules. Both should depend on abstractions.

In this case:

```
ServicePerson → MySql ❌
```

Instead of:

```
ServicePerson → PersonStorage ← MySql ✅
```

Because of this, any change in the persistence layer (e.g., switching from MySQL to another database) would require modifying `ServicePerson`.

---

## 3. ✅ What solution was applied and why?

The solution was to introduce an abstraction and apply dependency injection:

### Changes made:

* Created an interface `PersonStorage` to represent the persistence behavior.
* Made `MySql` implement this interface.
* Modified `ServicePerson` to depend on `PersonStorage` instead of `MySql`.
* Injected the dependency through the constructor (constructor injection).

### Why this works:

* It decouples the high-level logic from the low-level implementation.
* It allows swapping implementations without modifying `ServicePerson`.
* It improves testability (you can inject mocks or fake implementations).
* It follows the correct structure of DIP:

```
High-level module → Abstraction ← Low-level module
```