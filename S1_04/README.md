# Exercise Guidelines

# Level 1: JUnit
- ## Exercise 1
    Create a Java class that manages a collection of books in a library. The class must allow you to add books, retrieve the list of books, obtain a specific book by its position, add a book in a specific position and delete a book by title.

    Implement the following features:
    - The class must allow you to add books to the collection.
    - The complete list of books must be retrieved.
    - It must be possible to obtain the title of a book given a position.
    - A book must be able to be added in a specific position.
    - One book per title must be deleted.
    
    Verify its correct operation with JUnit:
    - Verify that the book list is not null after creating a new object.
    - They confirm that the list has an expected size after inserting several books.
    - They ensure that the list contains a specific book in its correct position.
    - Verify that there are no duplicate book titles in the list.
    - They check that the title of a book can be retrieved given a specific position.
    - Make sure adding a book modifies the list correctly.
    - Confirm that removing a book decreases the size of the list.
    - They verify that the list remains alphabetically ordered after adding or removing a book.

- ## Exercise 2
    Create a class called CalculateDni that calculates the letter of the DNI when receiving the number as a parameter.
    Create a jUnit class that verifies its correct functioning, parameterizing it so that the test receives a wide data spectrum and validates if the calculation is correct for 10 predefined ID numbers.

- ## Exercise 3
    Create a class with a method that launches an ArrayIndexOutOfBoundsException.
    Verify its correct operation with a jUnit test.

# Level 2: Hamcrest
- ## Exercise 1
    Define a custom matcher for Hamcrest that provides the Matcher length for a String.

    We want to use the class -.FeatureMatcher.

    With FeatureMatcher we can adjust an existing Matcher, decide which test object field should match
    and provide a pleasant error message. FeatureMatcher builder has the following arguments in
    this command:

    - The matcher we want to wrap.
    - A description of the function we try.
    - A description of the possible mismatch (mismatch).

    The only method we must overwrite is featureValueOf (T current), which returns the value to be passed to
    match method () / matchesSafely (). Use your custom comparator in a test to check if
    The "Mordor" string has a length of 8.

    Adjust the test if necessary.
