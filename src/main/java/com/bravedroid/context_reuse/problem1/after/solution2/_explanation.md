So first of all we should refactor what does not change "the context"
and we create a subclass that we delegate to do the work here.

We can define what to do in this places using the template method design pattern.
So every usage of the abstract method have its own custom algorithms.

The read the StreamToStringWriter which is an anonymous class od the abstract method 
and the StreamToStringReader which is a sub class that shows how to do to read the stream
by implementing the abstract method from the StreamProcessorContext.

We should mention that we can use the lambda expression here as we are using a "SAM" single abstract method
which can be an arrow function.

By designing that method we have to think about what are its input/output so the most important thing is what it would 
do basing on its input and what type of output should it give us by finishing its algorithm.

In this sample it should take int as the read character, and return void as we don't use it in that algorithm.

This solution works well with scenarios that have a lot of action to do in a specific order.
This is why it's called the template method (it's for creating a template based on some methods that are defined
, and some other that are not defined yet and it's the client task to defined them,
 this methods will be called by the service class that had implemented by the template method abstract class)
