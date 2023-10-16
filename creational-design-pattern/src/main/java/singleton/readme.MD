### What is singleton pattern?

The singleton design pattern is a creational design pattern that allows only one instance of a class to be created. This instance represents an object shared by all users within the application.

#### Advantages:

* Single Instance Guarantee: Singleton ensures that only one instance is created. This is important to maintain the consistency and data integrity of shared resources.

* Global Access: Singleton instance can be accessed from anywhere. This makes it easier to share information between different parts of the application.

* Memory and Performance Optimization: Avoids unnecessary memory consumption as the Singleton instance is created only once. It also reduces the cost of creating samples repeatedly.

#### The singleton design pattern is especially useful in the following scenarios:

* When expensive resources such as database connections need to be shared.

* When shared services such as logging, caching or configuration must be used.

* For application processes that require control or coordination from a single point.

However, the Singleton design pattern may not always meet the requirements, and it is important to choose appropriate use cases. Its use should be carefully considered, especially in very large projects or in situations where it may make testability difficult.

### 1. Eager Initialization:

* static instance field instantinate with class name.

* The singleton instance is created immediately when the class is loaded or the application starts.

* Thread is safe and ready to use immediately upon launch.

* It is faster in terms of performance because the instance is always ready.

* However, it may cause unnecessary memory usage because the instance may not be needed when the application starts.

### 2. Lazy Initialization:

* static instance field DOES NOT instantinate with class name.
* Singleton instance is created only when needed, it is created when getInstance is called.
* It consumes less memory initially because the instance is created on demand.
* There may be a performance cost because synchronization may be required on each call and delays may occur while creating the instance.
* Synchronization or double-checking methods may be required to ensure thread safety.
* Double-checked locking in Lazy usage is an idiom used to improve performance and reduce unnecessary synchronization cost when using the "lazy initialization" approach in the Singleton design pattern. Essentially, it ensures that the Singleton instance is created only once while minimizing unnecessary synchronization operations.

### 3.Enum

Enum allows you to implement the Singleton design pattern very cleanly and automatically. Enum is specifically designed in Java to support the Singleton design pattern. Enums provide a mechanism to create a single guaranteed instance that is directly controlled by the JVM (Java Virtual Machine). Here are the advantages of Singleton design pattern with enum:

* Thread Safety: Enum-based Singleton provides guaranteed thread safety in Java. Enum constants are created only once and can be shared safely across multiple threads.

* Guaranteed Single Instance: Since Enum constants are created only once, only one Singleton instance is created. This meets the basic requirement of the Singleton design pattern.

* Code Simplicity: Enum-based Singleton simplifies your code and automatically handles Singleton instantiation. It also eliminates complexities such as double-checking or synchronization.