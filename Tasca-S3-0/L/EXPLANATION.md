# 🧩• Exercise - SO`L`ID (Liskov Substitution Principle)

---

## 1. ❌ What was wrong?

The original design forced all subclasses of `Character` to implement the method `takeDamage(int points)`.

However, not all characters can logically receive physical damage. For example, the `Ghost` class overrides this method and throws an exception instead:

This indicates that the base class `Character` was defining a behavior that is not valid for all its subclasses.

---

## 2. ⚠️ Why did it violate the Liskov Substitution Principle (LSP)?

The Liskov Substitution Principle states that subclasses must be replaceable for their base class without altering the correctness of the program.

In the original implementation:

- `Character` provides a valid implementation of `takeDamage()`
- `Ghost` overrides it with an exception

This breaks LSP because:

- Code that works with `Character` expects `takeDamage()` to be safe to call.
- Substituting a `Ghost` causes unexpected behavior (runtime exception).

Therefore, `Ghost` is not a true substitute for `Character`, violating LSP.

---

## 3. ✅ What solution was applied and why?

The solution was to **delegate the damage behavior using composition instead of inheritance**.

## Key changes:

### 1. Introduced a behavior interface:
- `PhysicalDamageable` defines the contract for taking damage

### 2. Injected behavior into `Character`:
- `Character` now receives a `PhysicalDamageable` object and delegates the responsibility

### 3. Created different implementations:
- `NoPhysicalDamage` → ignores damage (used for ghosts)
- `StandardPhysicalDamage` → take standard damage

### 4. Assigned behavior per class:
- `Warrior` uses a `StandardPhysicalDamage` implementation
- `Ghost` uses a `NoPhysicalDamage` implementation

---

## Why this works

- All `Character` objects can safely respond to `takeDamage()` without throwing exceptions.
- Behavior differences are handled through composition, not inheritance.
- Subclasses no longer break the expected contract.

✅ This fully respects the Liskov Substitution Principle because any `Character` can now be used interchangeably without causing errors.