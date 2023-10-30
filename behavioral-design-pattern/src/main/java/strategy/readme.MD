### What is strategy design pattern?
The Strategy Pattern is a behavioral design pattern that enables an object, known as the context, to vary its behavior based on a selected algorithm or strategy. It allows you to define a family of algorithms, encapsulate each one as an object, and make them interchangeable. This pattern promotes loose coupling between objects, enabling you to change the behavior of an object without changing the code that uses it.

In other words, the Strategy Pattern allows you to define multiple algorithms for a particular task and choose the one you want to use at runtime, depending on the context. The key concept is to separate the algorithm's implementation from the context in which it is used, enabling you to switch between algorithms easily.

##### The advantages of the strategy pattern may be:

* Flexibility and Interchangeability: The strategy pattern abstracts algorithms and behaviors and makes these objects interchangeable. This makes it easy to add new algorithms and modify existing algorithms. It allows you to make changes without recompiling your code.


* Compliance with the Discrimination and Comprehension Principle: This pattern supports the "Parsing and Comprehension Principle". The context class is decomposed into a specific strategy so that each strategy can be modified independently of its context. Thus, it reduces the dependency between classes.


* Testability: The strategy pattern makes it easy to test strategies independently. Each strategy can have its own tests, and these tests only affect that strategy.


* Reducing Code Duplication: Strategy pattern reduces code duplication. You can use the same process with different strategies, so your code will be less repetitive.


* Compliance with the SOLID Principle: The strategy pattern especially complies with the "Open/Closed Principle". According to this principle, a class should keep a behavior closed that needs to be changed, but should be open for adding new behaviors. The strategy pattern provides an ideal way to implement this principle.

In a scenario where the strategy pattern is not used, algorithms will often be hard-coded within the same class and become difficult to change. The class may need to be changed for each new algorithm, causing the code to become complex and difficult to maintain. It can also result in too much responsibilities piling up in a single classroom.