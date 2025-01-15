# Exercise Guidelines

# Level 1
- ## Exercise 1
Create a class called "Product" with the attributes name and price, and another class called "Sale". This class has as an attribute a collection of products and the total price of the sale.

The "Sale" class has a method called calculateTotal() that launches the custom exception "EmptySaleException" and displays on screen "To make a sale you must first add products" if the product collection is empty. If the collection has products, then you must loop across the collection and save the sum of all the prices of the products to the total price attribute of the sale.

The custom exception "EmptySaleException" must be the child of the Exception class. To make a sale you must first add products and when we capture the exception, we must show it on screen with the getMessage() method of the exception.

Write the necessary code to generate and capture an exception type "IndexOutOfBoundsException".


# Level 2
- ## Exercise 1
Create a class called "Input". This class should be used to control the different exceptions that may appear in Java when entering keyboard data using the Scanner class.

The first thing to do is to instantiate an object of the Scanner class and from there, create static methods to read the different types of data from the keyboard.

>Important\
>\
>It is important that if an exception is missed in any method, we treat it and ask the user for the data again until it is well introduced. For example: If you enter a float with a dot instead of a comma, it must show “Format Error”. Until the user does not enter a well-formed float, they must continue to request the data.

All methods receive a String with the message to be displayed to the user, for example: “Enter your age”, and return the timely data entered by the user in each method, for example: a byte with the age of the user.

Methods to be implemented by capturing the exception of the class "InputMismatchException":

public static byte readByte(String message);\
public static int readInt(String message);\
public static float readFloat(String message);\
public static double readDouble(String message);\
Methods to be implemented by capturing a custom exception of the Exception class:\
public static char readChar(String message);\
public static String readString(String message);\
public static boolean readYesNo(String message), if the user enters “y”, returns “true”, if the user enters “n”, returns “false”.

# Level 3
- ## Exercise 1
A famous cinema company has asked us to develop an app for the reservation of seats in their cinemas. The application will be used by sellers when selling tickets.

### Functioning
Once the application has been started, the user will be asked how many rows and how many seats per row the cinema has. Once you have entered this data, the following menu will be shown:

1.- Show all the reserved seats.\
2.- Show the seats reserved by one person.\
3.- Book an armchair.\
4.- Cancel the reservation of an armchair.\
5.- Cancel all reservations of a person.\
0.- Exit.


The application will have the following classes:

- **Main Class**

    It will have the main of the application where an object of the class "Cine" will be introduced and will call its method "start".

\
- **Seat class**

    You will have the details of a seat:

    Attributes:
    - Row number.
    - Seat number.
    - Person who reserves the seat.

    Methods:
    - Constructor with all parameters.
    - Getters for all attributes.
    - Equals: it will return that two seats are equal if the row and the seat are equal.
    - toString: returns a String in the following format: "September 5, Seated 20, Person: Mary February.”

\
- **Cinema Class**

    It will contain the attributes and the initialization method.

    Attributes:
    - Number of rows of the cinema.
    - Number of seats per row.
    - An object of the class "SeatManagement"
    - An object of the class "CinemaManagement"

    Methods:
    - Constructor: will not receive parameters. It will initialize the object of the class "SeatManagement" and "CinemaManagement". It will call the "InitialData" method that will initialize the number of rows and seats.
    - start: the application will start. It will call the "menu" method and depending on the number returned, it will call the corresponding "CinemaManagement" method.
    - "RequiredInitialData": Ask the user for the number of rows and seats and save them in the corresponding attributes

- **CinemaManagement class:**

    It will contain the logic for the management of cinema operations.

    Attributes:

    - An object of the class "Cine"

    Methods:

    - "Constructor": It will receive as a parameter an object of the class "Cine" and assign it to the corresponding attribute.
    - "menu": Show the main menu options to the user, ask the number of the chosen option and return it.
    - "ShowSeats": Show all reserved seats.
    - "ShowPersonSeats": Ask for the name of the person who made the reservation and show all the seats reserved by that person
    - "bookSeat": Ask the user for a row number (calls the method "enterRow"), a seat number (calls the method "enterSeat"), the name of the person making the reservation (calls the method "enterPerson") and reserves the seat.
    - "deleteBooking": Ask the user for a row number (calls the method "enterRow"), a seat number (calls the method "enterSeat") and removes the seat reservation.
    - "deletePersonBookings": Ask the user for the name of the person (calls the method "enterPerson") and removes the seats reserved by the person entered.
    - "enterPerson": Ask the user for the name of the person and return it if it is correct. If it contains numbers, launch a custom exception "IncorrectPersonNameException"
    - "enterRow": Asks for the row number, if this is between 1 and the total number of rows, returns it. If not, release a custom exception "IncorrectRowException"
    - "enterSeat": Ask for the seat, if the number is between 1 and the total number of seats, returns it. If not, release a custom exception "IncorrectSeatException"


- **SeatManagement class**

    It will contain an ArrayList of seats and the necessary methods to add, remove and search the seats in the ArrayList.

    Attributes:

    - seats: ArrayList of seats.

    Methods:

    - Constructor: It will not receive parameters and will initialize the ArrayList of seats.

    - getSeats: Returns the armchair attribute.

    - "addSeat": will be in charge of adding an armchair to the ArrayList of seats. It will receive as a parameter an object from the "Seat" class and add it to the ArrayList. If the row and seat of the received armchair match that of a armchair that is already in ArrayList (the "searchSeat Search" method will be used), the custom exception "TakenSeatException" will be released.

    - "deleteSeat": will be responsible for removing an armchair from the ArrayList of armchairs. It will receive the row number and seat as parameters and remove it from ArrayList. If the row and seat do not match that of a reserved seat (the "searchSeat" method will be used), a custom exception "UnusedSeatException" will be released.

    - "searchSeat": Search the ArrayList of seats, the chair that matches the data received as a parameter (row and seat). If it finds it, it will return the position of the armchair to the ArrayList and, if it does not find it, it will return -1.
