### What is builder design pattern?
Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can be used to create different representations of the same object.

The Builder design pattern is a creational pattern used to simplify and structure the creation of complex objects. This pattern makes building objects doable step by step, making object creation more readable and manageable.

Here are some advantages of the Builder pattern:

Hides Complexity of Objects: The Builder pattern hides the creation of complex objects and allows the user to set only the properties they want.

Readable Code: The Builder pattern makes the code more readable by performing the object creation process step by step.

Flexibility: The Builder pattern provides a flexible way to change object structure or add new types.

Non-Required Parameters: The Builder pattern allows you to easily manage non-mandatory parameters when creating objects.

You may need to use the Builder pattern:

If your objects have many configuration options.
If you need to create a usable structure to create complex objects.
If you want the constructed objects to be immutable.
