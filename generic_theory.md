# Java Generics - Complete Point-wise Notes

## 1. What is Generic?

* Generics is a feature introduced in **Java 5 (JDK 1.5)**.
* It allows a **class, interface, or method** to work with different data types.
* It provides **compile-time type safety**.

**Definition:**

> Generics allow a class, interface, or method to work with different data types while providing compile-time type safety.

---

# 2. Why Generics Were Introduced

Before Java 5:

* Collections stored everything as `Object`.
* Required explicit type casting.
* Could cause `ClassCastException` at runtime.

Generics were introduced to solve these problems.

---

# 3. Advantages of Generics

* Provides compile-time type safety.
* Eliminates explicit type casting.
* Prevents `ClassCastException`.
* Makes code reusable.
* Improves readability.
* Improves maintainability.
* Used extensively in the Collection Framework.

---

# 4. Generic Class

A class declared with one or more type parameters.

**Syntax**

```java
class Box<T> {

}
```

`T` is called a **Type Parameter (Generic Type)**.

---

# 5. Type Parameter Naming Convention

| Symbol | Meaning |
| ------ | ------- |
| T      | Type    |
| E      | Element |
| K      | Key     |
| V      | Value   |
| N      | Number  |

These are conventions, not keywords.

---

# 6. How Generic Class Works

```java
class Box<T>{

    T data;
}
```

Creating object:

```java
Box<String> b = new Box<>();
```

Compiler treats it like:

```java
String data;
```

Similarly,

```java
Box<Integer>
```

becomes

```java
Integer data;
```

---

# 7. Homogeneous Object

If a generic class has one type parameter (`T`), then all members declared with `T` become the **same type** for that object.

Example:

```java
class A<T>{

    T x;
    T y;
    T z;

}
```

```java
A<String> obj = new A<>();
```

Now:

* `x` → String
* `y` → String
* `z` → String

This is called a **homogeneous object**.

---

# 8. Generic Constructor

Generics decide the **type**.

Constructor initializes the **value**.

Example:

```java
class Box<T>{

    T data;

    Box(T data){
        this.data = data;
    }

}
```

Remember:

* Generic → What type?
* Constructor → What value?

---

# 9. Generic Method

A method can also be generic.

```java
class Demo{

    public <T> T show(T value){

        return value;
    }

}
```

---

# 10. Generic Return Type

Return type can be a generic type.

```java
T getData(){

    return data;
}
```

If object is

```java
Box<String>
```

Return type becomes

```java
String
```

---

# 11. Multiple Generic Types

Java allows multiple type parameters.

```java
class Student<ID,NAME,MARKS>{

    ID id;

    NAME name;

    MARKS marks;

}
```

Object:

```java
Student<Integer,String,Double> s;
```

Result:

* ID → Integer
* NAME → String
* MARKS → Double

---

# 12. Mixing Generic and Normal Data Types

Allowed.

```java
class Student<T>{

    int rollNo;

    String name;

    T marks;

}
```

---

# 13. Can We Use Object Instead of Generic?

Yes.

```java
Object data;
```

But:

* Requires type casting.
* May cause `ClassCastException`.

Generics are safer.

---

# 14. Generic vs Object

### Object

* Stores any object.
* Requires casting.
* Runtime errors possible.

### Generic

* Stores only specified type.
* No casting required.
* Compile-time type checking.
* Safer.

---

# 15. Actual Uses of Generics

* Type Safety
* No Explicit Casting
* Prevent Runtime Errors
* Code Reusability
* Better Readability
* Better Maintainability
* Used in Collection Framework
* Used in Map
* Used in User-defined Classes
* Used in Generic Methods

---

# 16. Real-Life Examples

Collections

```java
ArrayList<String>

HashSet<Integer>

LinkedList<Student>

HashMap<Integer,String>
```

Own Generic Class

```java
Box<String>

Box<Integer>

Box<Employee>
```

---

# 17. Important Interview Questions

### Q1. What is Generic?

A feature that allows classes, interfaces, and methods to work with different data types while providing compile-time type safety.

---

### Q2. Why are Generics used?

To provide:

* Compile-time type safety
* Reusability
* No explicit casting
* Prevention of `ClassCastException`

---

### Q3. What is a Type Parameter?

A placeholder representing a data type.

Example:

```java
<T>
```

---

### Q4. Can a Generic Class Have Multiple Type Parameters?

Yes.

Example:

```java
class A<T,U,V>{

}
```

---

### Q5. Can We Use Primitive Types?

No.

```java
Box<int>
```

Not allowed.

Use wrapper classes.

```java
Box<Integer>
```

---

### Q6. Can We Use Different Data Types in a Generic Class?

Yes.

Either:

```java
class A<T>{

    int x;

    String y;

    T z;

}
```

or

```java
class A<T,U,V>{

}
```

---

# 18. Easy Formula

```
Without Generics

Object
↓
Casting
↓
Runtime Error


With Generics

Specific Type
↓
No Casting
↓
Compile-Time Safety
```

---

# 19. Golden Rules

* Generic works with **objects only**, not primitive types.
* `T` is a placeholder for a data type.
* One generic class can work with many data types.
* One type parameter (`T`) creates a homogeneous object.
* Multiple type parameters (`<T, U, V>`) allow different types.
* Generics provide compile-time type safety.
* Generics eliminate explicit type casting.
* Generics improve code reusability and readability.
