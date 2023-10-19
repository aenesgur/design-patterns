### What is decorator design pattern?
Decorator design pattern is used to modify the functionality of an object at runtime. At the same time other instances of the same class will not be affected by this, so individual object gets the modified behavior.

Adding new changes to the core class is against the OCP principle. In this example, if we add each "imdb" variable to the constructor, it is necessary to change all classes that use this class and the unit tests must also be updated.
