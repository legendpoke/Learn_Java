# Java Practice Repository

A beginner-friendly Java practice repository covering core language concepts through small, focused examples. Each program demonstrates one topic, making the repository useful as both a learning path and a quick reference.

## Author

**Dhruv** - A Java learning journey documented through practical code examples.

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
|-- JAVA.docx                        # Additional Java notes
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
|-- naming_conv.java                 # Java naming conventions
|-- PackagesExample.java             # Package import example
`-- tools/
    |-- PackageOne.java              # Class inside tools package
    `-- PackageTwo.java              # Class inside tools package
```

## Java Terms & Keywords Reference

This section contains commonly used Java keywords, concepts, and terms used across this repository, along with their meaning and use cases.

---

### 1. Basic Java Keywords

| Keyword | Meaning | Use Case |
|--------|--------|----------|
| `class` | Blueprint of objects | Used to define a new class |
| `public` | Access modifier | Makes class/method accessible everywhere |
| `static` | Belongs to class, not object | Used for `main()` and shared variables |
| `void` | No return value | Methods that do not return anything |
| `int`, `String`, `double` | Data types | Store different types of data |
| `new` | Creates object | Used to instantiate classes |
| `return` | Sends value back | Used in methods |

---

### 2. Object-Oriented Programming (OOP)

| Term | Meaning | Use Case |
|------|--------|----------|
| Class | Blueprint | Defines structure of objects |
| Object | Instance of class | Used to access methods and variables |
| Encapsulation | Data hiding | Using private variables + getters/setters |
| Inheritance | Parent-child relationship | Code reuse using `extends` |
| Polymorphism | Many forms | Overloading and overriding |
| Abstraction | Hiding implementation | Abstract classes and interfaces |

---

### 3. Control Flow

| Term | Meaning | Use Case |
|------|--------|----------|
| `if`, `else` | Conditional statements | Decision making |
| `for` loop | Repeated execution | Fixed iterations |
| `while` loop | Condition-based loop | Unknown iterations |
| `do-while` | Runs at least once | Execute before condition check |
| `switch` | Multi-condition check | Alternative to multiple if-else |

---

### 4. Arrays & Data Structures

| Term | Meaning | Use Case |
|------|--------|----------|
| Array | Collection of same type | Store multiple values |
| 2D Array | Matrix form | Tables, grids |
| Jagged Array | Uneven rows | Dynamic column size |
| ArrayList | Dynamic array | Flexible size storage |
| HashSet | Unique elements | Remove duplicates |
| TreeSet | Sorted unique elements | Auto sorting |
| HashMap | Key-value pairs | Fast lookup using keys |

---

### 5. Methods & Functions

| Term | Meaning | Use Case |
|------|--------|----------|
| Method | Function inside class | Performs actions |
| Overloading | Same name, different parameters | Compile-time polymorphism |
| Overriding | Redefining parent method | Runtime polymorphism |
| Constructor | Initializes object | Called automatically on object creation |

---

### 6. Exception Handling

| Term | Meaning | Use Case |
|------|--------|----------|
| try | Block for risky code | Code that may fail |
| catch | Handles error | Prevent program crash |
| finally | Always executes | Cleanup operations |
| throw | Manually throw exception | Custom error creation |
| throws | Declares exception | Pass responsibility to caller |
| Exception | Runtime error | Handle program failures |
| Custom Exception | User-defined error | Business logic errors |

---

### 7. Multithreading

| Term | Meaning | Use Case |
|------|--------|----------|
| Thread | Lightweight process | Parallel execution |
| Runnable | Task for thread | Define thread logic |
| synchronized | Thread safety | Prevent race conditions |
| join() | Wait for thread | Synchronization control |
| sleep() | Pause thread | Delay execution |
| Race Condition | Conflict in threads | Shared variable issue |

---

### 8. Functional Programming

| Term | Meaning | Use Case |
|------|--------|----------|
| Functional Interface | One abstract method | Used in lambdas |
| Lambda Expression | Short function syntax | Cleaner code |
| Stream API | Data processing pipeline | filter, map, reduce |
| Consumer | Accepts input, no return | forEach loops |
| Predicate | Returns true/false | Filtering data |
| Function | Transforms data | map operations |

---

### 9. Advanced Java Concepts

| Term | Meaning | Use Case |
|------|--------|----------|
| enum | Fixed set of constants | Status, days, etc. |
| package | Folder of classes | Code organization |
| import | Access external classes | Use libraries |
| final | Constant / non-changeable | Security and restriction |
| this | Current object reference | Avoid variable conflict |
| super | Parent class reference | Access parent members |
| upcasting | Child → Parent | Polymorphism |
| downcasting | Parent → Child | Access child methods |
| annotation | Metadata | `@Override`, compiler checks |

---

### 10. Stream Operations

| Operation | Meaning | Use Case |
|----------|----------|----------|
| filter() | Select data | Condition-based filtering |
| map() | Transform data | Modify elements |
| reduce() | Combine data | Sum, product, etc. |
| sorted() | Sort data | Ordering values |
| forEach() | Iterate | Printing elements |

---

## Why This Section is Useful

- Acts as a Java cheat sheet  
- Helps quick revision before exams/interviews  
- Connects theory with your practice files  
- Covers core + advanced Java concepts

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
- A terminal or command prompt for compiling and running files

### Run a Single File

Compile and run a file whose public class does not depend on another custom class:

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

## Study Tips

- Start with the basics, then move into arrays, object-oriented programming, exceptions, collections, streams, and threads.
- Run each file after reading it so the output connects with the code.
- Try changing values, method names, and conditions to understand how the program behaves.

## Notes

- File and class names are kept easy to understand on GitHub.
- Most examples are intentionally small and focused on one concept.
- Comments in the code explain what each example is doing.
- The `tools/` folder is required for the package example.

## License

This project is for educational purposes. Feel free to fork it and learn from it.
