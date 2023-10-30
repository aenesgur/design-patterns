### What is bridge design pattern?

The Bridge design pattern is designed as a structural design pattern used to reduce the complexity of classes and objects, increase abstraction, and make them independent of each other. This design pattern is used to reduce complexity in a system that contains multiple options or variations.

The main purpose of the Bridge design pattern is to separate the abstraction from the actual implementation. This makes the code more flexible and extensible because it becomes easier to combine different abstractions and actual implementations.

The main components in the Bridge design pattern are:

Abstraction: This represents the client's request and is defined as an abstracted interface or class. The client accesses the real implementation through the abstraction.

Implementation: This represents actual implementations of the abstraction. There may be multiple different real implementations, and they are linked by abstraction.

The Bridge design pattern makes these two components independent of each other. Abstraction is distinguished from implementations, and both can have different development paths. This provides great flexibility, especially when adding new applications or modifying existing ones.

As an example scenario, let's consider a shape drawing application:

Abstraction: The Shape class provides a basic interface for drawing various shapes.
Application: Raster and Vector classes represent real applications for drawing shapes on different platforms (for example, computer screen and printer).
The Bridge design pattern defines the relationship between Abstraction and Implementation and makes this relationship independent. As a result, it is easier to add new shape types or new platforms, and you can combine abstraction and implementation without changing either side.

The Bridge design pattern makes complex applications more manageable and better prepared for future changes. Therefore, it is often used in large and scalable software systems.