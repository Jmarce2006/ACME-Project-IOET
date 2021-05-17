# ACME EXERCISE - IOET

The solution was developed with the Java programming language using Hexagonal Architecture as a design pattern. 

## Solution

### Architecture

Using the hexagonal architecture I have distributed the packages and classes in entity, service and implementation service for each of the objects defined in the exercise (schedule, employee, employee-schedule)

### Methodology
This architecture separates our application into different layers or regions with its own responsibility

Makes it easy to implement new features based on dependency injection


### Overview Solution
In the project folder there is a text file that is used to upload information about the employees and their work schedules.

The FileTextService class contains all the methods for reading and transforming information from the text file

The main class is sent the path of the text file and the calculated information is displayed in the console, through the implementation of the EmployeeService class and the calculatePayFromFile method.

the getEmployeeSchedules method in the EmployeeScheduleServiceImpl class has a line of text as a parameter and calls the method to calculate the amount and cost of hours worked according to the established rules of the company.

- Junit for testing purpose

### How to Run
- Requirements:
  - JAVA JDK
  - Netbeans IDE

- Running the Program:
  - Clone this repository, open from Netbeans IDE and run the Main Class.
  - If you want to modify the input data, the file is located at src/input.txt


