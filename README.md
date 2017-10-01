# unwrapped-exceptions

## PROBLEM

In the latest version of Mapstruct (v1.2.0_CR2), the generated implementation files are not wrapping some thrown exceptions in try-catch blocks in this given scenario (refer to the project). I am not entirely sure if this is a configuration problem on my end or a Mapstruct bug. As per request of one of the maintainers of Mapstruct project, I have created a barebones project that replicates the problem.

## Environment

Java SDK: v1.8.0u144

## How to run this project?

The project is using Maven (pom.xml), so all the required dependencies should automatically be imported. Run the test file ("ReproduceUnwrappedExceptions.java") to reproduce the errors below.

### SCREENSHOTS
![Compilation error](/img/uncaught_exceptions_compile_failure.png)

![Generated mapping file does not have the proper throws clause](/img/uncaught_exception_no_throws_clause.png)
