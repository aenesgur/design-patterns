### What is observer design pattern?
Observer Pattern is one of the behavioral design pattern. Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change. In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.

##### The reasons and advantages of using Observer Pattern may be:

Distributed and Independence: Observer Pattern is useful in a distributed system or for preserving independence between objects. Observers are dependent on the subject but independent of each other.

Sensitivity: Observer Pattern allows you to react sensitively to changes in an object's state. When an object's state changes, all relevant observers are automatically updated.

Extensibility: It is possible to easily add new observers and remove or modify existing observers. This increases the extensibility of your application.

Disconnection: Connections between observers and subject are loose. An observer remains unknown to reduce his dependence on other observers or the subject.

Let's consider a real-life example with Java: A news agency application. News is constantly updated in this application and users need to get these updates. In a scenario where news needs to be constantly updated with new content and users need to have instant access to these updates, the Observer Pattern can be used.