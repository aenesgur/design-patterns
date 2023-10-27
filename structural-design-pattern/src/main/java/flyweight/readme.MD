### What is flyweight design pattern?

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. Only 5 colors are available so color property is used to check already existing Circle objects.

##### Types: 
The main purpose of the Flyweight design pattern is to minimize memory usage by sharing similar objects. This design pattern works by separating objects into intrinsic (intrinsic) and extrinsic (extrinsic) properties. Here's the difference between these two types of features:

* Intrinsic Properties: Intrinsic properties are common and shared properties other than the identity of the object. These properties are the same for all objects and therefore can be shared by each object. For example, an intrinsic property of a character object might be the character itself. This property is the same and shared between objects. The Flyweight design pattern saves memory by sharing these common inherent features.


* Extrinsic Properties: Extrinsic properties are features that specialize objects and differ between objects. It is unique to each object and cannot be shared. For example, the position or color of a character object are external properties. These properties vary between objects and cannot be shared. The Flyweight design pattern does not take advantage of sharing these extrinsic properties by separating them from intrinsic properties.