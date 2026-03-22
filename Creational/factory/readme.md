# Factory Design Pattern

The **Factory Design Pattern** is a **creational design pattern** that provides a way to create objects from a centralized place without exposing the object creation logic to the client. It is particularly useful when the type of object needs to be decided at runtime and makes it easy to add new object types.  

---

## Key Points

- Object creation happens at **one centralized place** (factory class)  
- Object type can be decided at **runtime**  
- **Client code** does not need to know how the object is created  
- **Easy to extend** by adding new object types  

---

## Why Use Factory Pattern?

Instead of creating objects directly in multiple places, which can make the code hard to maintain, the Factory Pattern allows you to:  

- **Centralize object creation**  
- **Hide object creation logic** from the client  
- **Decide object type dynamically**  
- **Easily add new object types** without modifying existing client code  

---

## How It Works

1. **Factory Class**: Contains the logic to create objects.  
2. **Product Interface / Abstract Class**: Defines the common behavior for objects.  
3. **Concrete Classes**: Implement the interface or extend the abstract class.  
4. **Client Code**: Uses the factory to get objects without knowing the creation logic.  

---


---

## Benefits

- **Loose coupling**: Client code is decoupled from concrete classes.  
- **Scalability**: Adding new object types does not affect existing code.  
- **Centralized control**: All object creation logic is in one place.  

---

## References / Implementation Example

- [Java Factory Pattern Implementation](https://lnkd.in/gUXicEDY)

---

# Tags

`#DesignPatterns` `#FactoryPattern` `#Java` `#SoftwareDevelopment` `#CleanCode`  
