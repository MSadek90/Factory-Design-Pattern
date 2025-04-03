# Factory Design Pattern Implementation in Java

This repository demonstrates the implementation of the Factory Design Pattern in Java. It provides a way to create objects without specifying the exact class of object that will be created. This pattern is particularly useful when creating objects that share a common interface but may have different implementations. 

By using this design pattern, we can easily extend the code to support new types of objects without modifying existing code, adhering to the Open/Closed Principle.

## Features
- **Flexible design**: Allows for easy creation of different types of objects (e.g., WebDriver instances like Chrome, Firefox).
- **Abstract Factory**: A base class `DriverFactory` is used to create and manage different browser instances.
- **Easy to extend**: The design is open for extension. New browser types can be added by extending the `DriverFactory` class.
- **Cross-browser testing**: Facilitates cross-browser testing in Selenium-based test scripts.
- **Reusable test structure**: The `BaseTest` class provides a foundation for writing reusable test cases.

## Installation
To get started with this project, follow the steps below to clone and set it up on your local machine:

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/MSadek90/Factory-Design-Pattern.git
Navigate to the project directory:

bash
Copy
Edit
cd Factory-Design-Pattern
Install the dependencies using Maven (if Maven is not installed, install it from here):

bash
Copy
Edit
mvn install
Usage
Once the project is set up, you can run the tests using Maven or any IDE like IntelliJ IDEA.

To run tests via Maven:

bash
Copy
Edit
mvn test
To specify the browser you want to test with, use the following Maven command:

bash
Copy
Edit
mvn test -Dbrowser=chrome
By default, the tests will run on the browser specified in your BaseTest class or via the -Dbrowser flag.

Example:
The BaseTest class will automatically handle the WebDriver setup and tear down for you. This ensures that each test runs on the correct browser and instance.

## Code Structure
Here is a brief overview of the key classes in the project:

DriverFactory.java: Responsible for creating and returning WebDriver instances based on the browser type. It contains the logic for initializing different browser types like Chrome, Firefox, etc.

BaseTest.java: This is the base class for all test cases. It contains setup and teardown methods for initializing and quitting the WebDriver instance. All tests extend this class for reusability and consistency.

Factory Design Pattern: The main idea behind this pattern is to provide an interface for creating objects but allow subclasses to alter the type of objects that will be created. This encapsulation improves the maintainability of the code.

## How It Works
When you run a test, the DriverFactory decides which browser to instantiate based on the parameter passed (e.g., chrome, firefox, etc.).

The BaseTest class initializes the WebDriver instance and loads the desired webpage for testing.

After the test completes, the WebDriver instance is quit properly.

## Contributing
Contributions to this repository are welcome! If you have suggestions, bug fixes, or new features to add, feel free to open an issue or submit a pull request. Please follow the guidelines below for contributing:

Fork the repository and create your branch.

Make your changes and commit them.

Push to your forked repository.

Submit a pull request to the main repository.
