## Mastering Abstraction in Java: Interfaces and Abstract Classes in Java
Create a Java program that models real-world machines using abstraction principles.

Your task is to:

Create an interface called Machine with one method:
```Java
String start();
```


Create an abstract class called Appliance that:

- Implements Machine

- Has a String name field

- Has a constructor to set the name

- Create two concrete classes:
  - Fan, which extends Appliance and overrides start() to return "Fan is running"
  - WashingMachine, which extends Appliance and overrides start() to return "Washing Machine is operating"

- In the main() method:
  - Create one object of each type using the interface reference:
```Java
Machine fan = new Fan("Fan");
Machine washer = new WashingMachine("Washing Machine");
```

 - Call start() on each and print the result.


Instructions:

- Use an interface to define behavior (start() method).
- Use an abstract class to provide common structure (the name field).
- Use subclasses to implement and customize behavior.
- Use System.out.println() to print outputs as shown below.

Expected Output
```
Fan is running

Washing Machine is operating
```