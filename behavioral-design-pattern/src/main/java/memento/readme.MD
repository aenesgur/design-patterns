### What is memento design pattern?
Memento pattern is used to restore state of an object to a previous state. As your application is progressing, you may want to save checkpoints in your application and restore back to those checkpoints later. Intent of Memento Design pattern is without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later.

Think about a situation where we develop an application with states. Now there is a requirement saying that at a particular point, we need to go back to the previous state. A Memento Design pattern can be used to achieve this functionality.

There are 3 main components of the Memento Design Pattern

* Originator: Particular object whose state needs to be maintained. It creates the memento.


* Memento: Object that is responsible for maintaining the state of the originator.


* Caretaker: Object Keeps Track of multiple mementos.