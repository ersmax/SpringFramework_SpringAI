1. Normal Interface
   A normal interface is an interface that contains two or more abstract
   methods. These interfaces are the most commonly used in Java. Any class that
   implements this interface must provide an implementation for all its abstract
   methods.
   Starting from Java 8, normal interfaces can also include:
   • Default methods (methods with a body that have a default
   implementation).
   • Static methods (methods that belong to the interface class, not to an
   instance of the class).


2. Functional Interface
   A functional interface is an interface that contains only one abstract method.
   This type of interface is also called SAM (Single Abstract Method) interface.
   Functional interfaces can have any number of:
   • Static methods
   • Default methods
   • Methods from java.lang.Object
   Lambda expressions are typically used with functional interfaces in Java.

Important Note: Even though it has one abstract method, a functional interface
can have multiple default and static methods.

3. Marker Interface
   A marker interface is an interface that does not contain any methods, fields,
   or constants. Marker interfaces serve the purpose of tagging or marking a
   class as having a particular property. These interfaces rely on runtime behaviour.
   Examples of Marker Interfaces:
   • Serializable
   • Cloneable
   Serializable Interface:
   The Serializable interface is a marker interface defined in the java.io package.
   It is used to make a class serializable, meaning that the state of an object can be
   converted into a byte stream and stored in a file or database.
   • Serialization: The process of converting an object's state to a byte
   stream, making it suitable for storage or transmission.
   • Deserialization: The reverse process of restoring the object's state from a
   byte stream back into memory.