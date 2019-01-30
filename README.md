# Learning Design Patterns

**Builder Pattern:**

Purpose via GoF:  
Separate the construction of a complex object from its representation so that
the same construction process can create different representations. 


Use the Builder pattern when

· the algorithm for creating a complex object should be independent of the
parts that make up the object and how they're assembled.
· the construction process must allow different representations for the
object that's constructed. 



_BoardingPassWithoutBuilderPatter.java_

This class demonstrates a traditional POJO (Plain Old Java Object).


**Pros:**
Straight forward and well understood

**Cons:**
Becomes difficult to manage as the number of fields/args increase so do setters and getters
Inflexible, all args defined in the constructor must be provided, even if they aren't needed.
If they aren't needed we are forced to use "" for unneeded fields.  


_BoardingPassWithBuilderPatter.java_

**Pros:**
Provides flexibility when building and object.

**Cons:**
Verbose, a lot of code is written

**My Key Takeaway**
I see now that each method of the java class is 'typed' as inner class BoardingPassBuilder.  The key
point is that each method returns itself which creates a fluent interface.  You essentially
you to access the methods kinda like in a circle.



**Iterator Pattern:**

