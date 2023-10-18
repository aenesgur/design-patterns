### What is proxy design pattern?

Proxy design pattern allows you to control access of an object due to various reason e.g. Security, Performance, Caching etc. Proxy implements same interface as real object, so it can act as surrogate, until real object is available and than it can forward request to real object for processing.

##### Let’s talk about when to use the Proxy pattern:

When we want a simplified version of a complex or heavy object. In this case, we may represent it with a skeleton object which loads the original object on demand, also called as lazy initialization. This is known as the Virtual Proxy

When the original object is present in different address space, and we want to represent it locally. We can create a proxy which does all the necessary boilerplate stuff like creating and maintaining the connection, encoding, decoding, etc., while the client accesses it as it was present in their local address space. This is called the Remote Proxy

When we want to add a layer of security to the original underlying object to provide controlled access based on access rights of the client. This is called Protection Proxy

##### Variants of the proxy design pattern are:

Remote proxy: Used if the real object is remote from the client.

Virtual proxy: The real object is used only if it is created when needed.

Cache proxy: Caches data from the real object.

Protection proxy: Allows only certain users to access the real object.

Logging proxy: Logs access to the real object.