# Exercise Guidelines

# Level 1
- ## Exercise 1
    Create a hierarchy of objects with three classes: Worker, Remote Worker and On-site Worker.

    The Worker class has the attributes name, surname, price/hour, and the method CalculateYou() that receives by parameter the number of hours worked and multiplies it by the price/hour. The child classes must overwrite it, using @Override.

    From main() of the Main class, make the necessary invocations to demonstrate the operation of the @Override annotation.

    In on-site workers, the method to calculate their salary will receive by parameter the number of hours worked per month. When calculating the salary, it will be the number of hours worked multiplied by the price/hour, plus the value of a static attribute called gasoline that we will add in this class.

    In remote workers, the method to calculate their salary will receive by parameter the number of hours worked per month. When calculating the salary, it will be the number of hours worked by the price / hour, and the price of the flat rate of the Internet will be added, which will be a constant of the RemoteWorker class.

- ## Exercise 2
    Add some obsolete (deprecated) methods to the child classes, and use the corresponding annotation. It invokes outdated methods from an external class, deleting warnings by the corresponding annotation to be obsolete.

# Level 2
- ## Exercise 1
    Create a custom annotation that should allow a Java object to be serialized in a JSON file. The annotation must receive the directory where the resulting file will be placed.
