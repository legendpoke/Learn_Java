# Java Learning Repository

A beginner-friendly Java practice repository covering core language concepts through small, focused examples. Each file demonstrates one topic, so it can be used as a quick reference while learning Java.

## Author

**Dhruv** - Java learning journey documented through practical code examples.

## Project Structure

```text
.
|-- HelloWorld.java                  # Hello World and simple addition
|-- VotingEligibility.java           # Basic if-else condition
|-- GreatestOfThreeNumbers.java      # Find the greatest of three numbers
|-- ForLoopExample.java              # Nested for loops
|-- WhileLoopFactorial.java          # Factorial using a while loop
|-- DoWhileLoop.java                 # do-while loop example
|-- user_input.java                  # Scanner input
|-- array.java                       # Array basics
|-- all_array_values.java            # Printing array values
|-- array_obj.java                   # Array of objects
|-- multi_array.java                 # 2D array
|-- jagged_array.java                # Jagged array
|-- three_d_array.java               # 3D array
|-- ClassObjectExample.java          # Class and object basics
|-- GradeSystem.java                 # Grade system practice
|-- MethodReturnExample.java         # void methods and return values
|-- InstanceVariableExample.java     # Instance variables
|-- constructors.java                # Constructors
|-- encapsulation.java               # Getters and setters
|-- inheritance.java                 # Inheritance example
|-- Calculator.java                  # Base calculator class
|-- AdvancedCalculator.java          # Calculator inheritance example
|-- VeryAdvancedCalculator.java      # Advanced calculator with power()
|-- polymorphism.java                # Polymorphism notes
|-- MethodOverriding.java            # Method overriding
|-- DynamicMethodDispatch.java       # Runtime method dispatch
|-- AbstractKeyword.java             # Abstract class and abstract method
|-- AbstractAnonymousClass.java      # Anonymous class with abstract class
|-- InterfaceMethods.java            # Interface variables and multiple interfaces
|-- NeedOfInterface.java             # Why interfaces are useful
|-- TypesOfInterfaces.java           # Normal, functional, and marker interfaces
|-- FunctionalInterfaceExample.java  # Functional interface example
|-- LambdaExpression.java            # Lambda basics
|-- MoreLambdaMethods.java           # Lambda with return value
|-- for_each.java                    # forEach and Consumer
|-- InnerClassExample.java           # Inner and static nested classes
|-- AnonymousClassExample.java       # Anonymous class example
|-- ObjectClassMethods.java          # toString() and equals()
|-- ThisKeyword.java                 # this keyword
|-- ThisSuperExample.java            # this() and super()
|-- StaticKeyword.java               # static variables and methods
|-- FinalKeyword.java                # final keyword
|-- AccessModifier.java              # Access modifiers
|-- StringExample.java               # String and StringBuffer
|-- TypeCasting.java                 # Upcasting and downcasting
|-- enumeration.java                 # enum basics
|-- enum_class.java                  # enum constructors and methods
|-- OverrideAnnotationExample.java   # @Override annotation
|-- exceptions.java                  # try-catch examples
|-- exception_hierarchy.java         # Exception hierarchy notes
|-- ThrowKeyword.java                # throw keyword
|-- ThrowsKeyword.java               # throws keyword
|-- custom_exception.java            # Custom exception
|-- try_with.java                    # try-with-resources and finally
|-- collection_api.java              # HashSet and TreeSet
|-- map.java                         # HashMap example
|-- sorting.java                     # Comparator and Collections.sort()
|-- stream_api.java                  # Stream filter, map, and reduce
|-- threads.java                     # Thread and Runnable examples
|-- threads_safe.java                # synchronized and join()
|-- thread_states.java               # Thread states reference
|-- dynamic_array.java               # Dynamic array example
|-- random_values.java               # Random values in a 2D array
|-- linear_search.java               # Linear search
|-- naming_conv.java                 # Java naming conventions
|-- PackagesExample.java             # Package import example
`-- tools/
    |-- PackageOne.java              # Class inside tools package
    `-- PackageTwo.java              # Class inside tools package
```

## Topics Covered

### Basics
- Hello World and output statements
- Variables and arithmetic operations
- User input with `Scanner`
- Basic conditionals and loops

### Object-Oriented Programming
- Classes and objects
- Constructors
- Encapsulation with getters and setters
- Inheritance
- Polymorphism
- Method overriding
- Abstract classes
- Interfaces
- Inner classes and anonymous classes
- `this`, `super`, `static`, and `final`
- Access modifiers

### Arrays and Strings
- 1D, 2D, 3D, and jagged arrays
- Arrays of objects
- Random values in arrays
- `String` and `StringBuffer`

### Exceptions
- `try`, `catch`, and `finally`
- `throw` and `throws`
- Custom exceptions
- Try-with-resources

### Functional Java
- Functional interfaces
- Lambda expressions
- `Consumer`, `Comparator`, and `Runnable`
- Stream API: `filter`, `map`, `reduce`, `sorted`, and `parallelStream`

### Collections and Threads
- `HashSet`, `TreeSet`, and `HashMap`
- Sorting with `Comparator`
- Linear search
- Creating threads with `Thread` and `Runnable`
- `sleep()`, `start()`, `join()`, and `synchronized`

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any IDE such as VS Code, IntelliJ IDEA, or Eclipse

### Run a Single File

Compile and run a file whose public class does not depend on another custom file:

```bash
javac HelloWorld.java
java HelloWorld
```

### Run Files With Dependencies

Some examples depend on other files. Compile the related files together:

```bash
javac Calculator.java AdvancedCalculator.java VeryAdvancedCalculator.java inheritance.java
java inheritance
```

For the package example, compile from the repository root:

```bash
javac tools/PackageOne.java tools/PackageTwo.java PackagesExample.java
java PackagesExample
```

## Recommended Learning Path

1. `HelloWorld.java` -> `VotingEligibility.java` -> `GreatestOfThreeNumbers.java`
2. `ForLoopExample.java` -> `WhileLoopFactorial.java` -> `DoWhileLoop.java`
3. `array.java` -> `all_array_values.java` -> `multi_array.java` -> `jagged_array.java`
4. `ClassObjectExample.java` -> `MethodReturnExample.java` -> `InstanceVariableExample.java`
5. `constructors.java` -> `encapsulation.java` -> `inheritance.java`
6. `polymorphism.java` -> `MethodOverriding.java` -> `DynamicMethodDispatch.java`
7. `AbstractKeyword.java` -> `NeedOfInterface.java` -> `InterfaceMethods.java`
8. `InnerClassExample.java` -> `AnonymousClassExample.java`
9. `FunctionalInterfaceExample.java` -> `LambdaExpression.java` -> `MoreLambdaMethods.java`
10. `exceptions.java` -> `ThrowKeyword.java` -> `ThrowsKeyword.java` -> `custom_exception.java`
11. `collection_api.java` -> `map.java` -> `sorting.java`
12. `stream_api.java` -> `threads.java` -> `threads_safe.java`

## Notes

- File and class names have been cleaned up to be easier to understand on GitHub.
- Most examples are intentionally small and focused on one concept.
- Comments in the code explain what each example is doing.
- The `tools/` folder is required for the package example.

## License

This project is for educational purposes. Feel free to fork it and learn from it.
