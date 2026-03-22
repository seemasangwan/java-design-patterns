# Builder Design Pattern

The **Builder Design Pattern** is a **creational design pattern** used to construct complex objects step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

---

## 🔹 Why Use Builder Pattern?

When a class has **many attributes**, especially **optional fields**, creating objects using constructors can become messy:

- Multiple constructors for different combinations of attributes (constructor overloading)  
- Code becomes hard to read and maintain  
- Hard to track which parameters are required and which are optional  

**The Builder Pattern solves these problems by:**

- Providing a clear, readable way to construct objects  
- Supporting optional and required fields  
- Avoiding multiple constructor overloads  
- Enabling immutability if required  

---

## 🔹 Key Concepts

1. **Builder Class** – A static nested class that has the same fields as the main class. Provides setter methods for optional fields.  
2. **Required Fields** – Fields that must be provided to create an object, usually passed via the Builder constructor.  
3. **Optional Fields** – Fields that can be set using setter methods in the Builder.  
4. **Build Method** – Constructs the main object using the values stored in the Builder.  
5. **Immutability (Optional)** – Make main class fields `final` so object state cannot be changed after creation.  

---
