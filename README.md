# Learning Builder Design Pattern

Builder Pattern:

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
