# Shape Factory Example (Factory Design Pattern)

This project demonstrates the **Factory Design Pattern** using shapes like **Rectangle** and **Square**. The Factory Pattern allows creation of objects without exposing the creation logic to the client and makes it easy to add new shapes in the future.

---

## 🏭 Overview

The **Factory Design Pattern** is a **creational design pattern** that:

- Centralizes object creation in one place (the Factory class)  
- Hides the instantiation logic from the client  
- Allows the type of object to be decided at runtime  
- Makes it easy to add new object types without modifying client code  

In this example, the **`ShapeFactory`** is responsible for creating shape objects (`Rectangle` or `Square`) based on the input type.

---

## 🔹 Project Structure
shape/
├── Shape.java # Interface defining common methods for shapes
├── Rectangle.java # Concrete implementation of Shape (rectangle)
├── Square.java # Concrete implementation of Shape (square)
└── ShapeFactory.java # Factory class to create Shape objects
Main.java # Demonstrates usage of ShapeFactory


---

## 🔹 Code Explanation

### Shape Interface

```java
public interface Shape {
    int getArea();
    int getPerimeter();
}
