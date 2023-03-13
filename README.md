# HBV202GAssignment9
A project skeletonto implement the composite pattern and the observer pattern based on tests using JUnit4.

This project is a Maven project, i.e. it uses the standard Maven project structure that your IDE hopefully understands when you `git clone` it. The provided Maven POM includes the JUnit4 dependency.

Both the implementation and the tests are in Java package `is.hi.hbv202g.ass9`,  but in the usual separate Maven `src` directories:

- `src/main/java`:
  - `is.hi.hbv202g.ass9.composite`: Your implementation of the composite pattern has to go there. Choose class, interface, and method names so that they fit the provided test cases.
  - `is.hi.hbv202g.ass9.compositeLeafObservedByComposite`: Your implementation of the composite pattern that is combined with the observable patterns has to go there. Choose class, interface, and method names so that they fit the provided test cases.

- `src/test/java`:
  - `is.hi.hbv202g.ass9.composite`: Test cases testing a composite implementation.
  - `is.hi.hbv202g.ass9.compositeLeafObservedByComposite`: Test cases testing an implementation of a composite where the leafs are observed by the composite implementation.

Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts with `Test` or ends with `Test`, `Tests`, or `TestCase`).

