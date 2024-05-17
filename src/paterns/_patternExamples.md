**Creational Patterns** 


**Singleton:** Ensures a class has only one instance and provides a global point <br>
of access to it.<br>
**Example: Runtime.getRuntime()**


**Factory Method:** Defines an interface for creating an object, but lets subclasses <br>
alter the type of objects that will be created.<br>
**Example: Calendar.getInstance()**

Abstract Factory: Provides an interface for creating families of related or dependent objects <br>
without specifying their concrete classes.<br>
**Example: javax.xml.parsers.DocumentBuilderFactory**


**Builder:** Separates the construction of a complex object from its representation so that <br>
the same construction process can create different representations.<br>
**Example: java.lang.StringBuilder**


**Prototype:** Creates new objects by copying an existing object, known as the prototype.<br>
Example: java.lang.Object#clone()


Structural Patterns <br>
**Adapter:** Allows incompatible interfaces to work together by wrapping an existing class <br>
with a new interface.
**Example: java.util.Arrays#asList()**


**Composite:** Composes objects into tree structures to represent part-whole hierarchies, <br>
allowing clients to treat individual objects and compositions of objects uniformly.<br>
**Example: javax.swing.JComponent (and its subclasses)** <br>


**Decorator:** Adds additional responsibilities to an object dynamically.<br>
**Example: java.io.BufferedReader** (wrapping Reader)


Facade: Provides a simplified interface to a complex subsystem.<br>
**Example: javax.faces.context.FacesContext** <br>


**Flyweight:** Reduces the cost of creating and manipulating a large number of similar objects.<br>
**Example: java.lang.Integer#valueOf(int)** <br>


**Proxy:** Provides a surrogate or placeholder for another object to control access to it.<br>
**Example: java.lang.reflect.Proxy** <br>


**Behavioral Patterns** <br>
**Chain of Responsibility:** Passes a request along a chain of handlers until an object handles <br>
the request. <br>
**Example: java.util.logging.Logger** 


**Command:** Encapsulates a request as an object, thereby allowing for parameterization of clients <br>
with different requests, queueing of requests, and logging of the requests. <br>
**Example: java.lang.Runnable**


**Interpreter:** Implements an expression interface to interpret a particular context. <br>
**Example: java.util.regex.Pattern** <br>


**Iterator:** Provides a way to access the elements of an aggregate object sequentially without 
exposing its underlying representation. <br>
**Example: java.util.Iterator** <br>


**Mediator:** Defines an object that encapsulates how a set of objects interact. <br>
**Example: java.util.Timer** <br>


**Memento:** Captures and externalizes an object's internal state so that it can be restored <br>
later. <br>
**Example: java.util.Date** (before Java 8)


**Observer:** Defines a one-to-many dependency between objects so that when one object changes <br>
state, all its dependents are notified and updated automatically. <br>
**Example: java.util.Observer** and java.util.Observable 


**State:** Allows an object to alter its behavior when its internal state changes. <br>
**Example: javax.faces.lifecycle.Lifecycle#execute()** <br>


**Strategy:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable. <br>
**Example: java.util.Comparator** 


**Template Method:** Defines the skeleton of an algorithm, deferring some steps to subclasses. <br>
**Example: java.util.AbstractList**


**Visitor:** Represents an operation to be performed on the elements of an object structure.  <br>
Visitor lets you define a new operation without changing the classes of the elements <br>
on which it operates.
**Example: java.nio.file.FileVisitor**


**Concurrency Patterns**
**Thread Pool:** Manages a pool of worker threads, typically by maintaining a queue of tasks <br>
to be performed and assigning them to available threads. <br>
**Example: java.util.concurrent.ExecutorService**


T**hread-Safe Singleton:** Ensures that a singleton instance is created in a thread-safe manner. <br>
**Example:** Using synchronized or java.util.concurrent.atomic.AtomicReference <br>


**Producer-Consumer:** Separates the processes that produce data from those that consume data. <br>
**Example: java.util.concurrent.BlockingQueue**
