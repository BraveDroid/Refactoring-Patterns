So first of all we should refactor what does not change "the context"
and we delegate an interface that have only one abstract method that will do the work here.

We can define what to do in this places using the strategy pattern.
So every usage of the abstract method have its own custom algorithms.

The read the StreamToStringWriter which is an anonymous class od the abstract method 
and the StreamToStringReader which is a nested static class that shows how to do to read the stream
by implementing the abstract interface.

We should mention that we can use the lambda expression here as we are using a "SAM" single abstract method
which can be an arrow function.

By designing that method we have to think about what are its input/output so the most important thing is what it would 
do basing on its input and what type of output should it give us by finishing its algorithm.

In this sample it should take int as the read character, and return void as we don't use it in that algorithm.
