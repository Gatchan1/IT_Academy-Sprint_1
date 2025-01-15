# Exercise Guidelines

# Level 1
- ## Exercise 1
    Create a class called Month with a "name" attribute (which will store the month name of the year). Add 11 Month objects (each with its different attribute) to an ArrayList, except for the object with the "August" attribute. Then, insert in the place that corresponds to this month and show that ArrayList maintains the correct order.

    Turn the ArrayList of the previous exercise into a HashSet and make sure it does not allow duplicates.

    Iterate the list with a for and an iterator.

- ## Exercise 2
    Create and fill in a List<Integer>.

    Create a second List<Integer> and insert the elements of the first in reverse order into the second list.

    Use ListIterator objects to read the items in the first list and insert them into the second list.

- ## Exercise 3
    Given the file countrties.txt (check the resources section) containing countries and capitals. The program must read the file and save the data in a HashMap<String, String>. The program asks for the user's name, and then must show a country randomly, saved in HashMap. The user must write the name of the capital of the country in question. If they're right they earn a point. This action is repeated 10 times. Once the capitals of 10 countries have been requested randomly, then the name of the user and their score must be stored in a file called classification.txt.

# Level 2
- ## Exercise 1
    Create a class called Restaurant with two attributes: name(String) and score(int). Implement the necessary methods so that Restaurant objects with the same name and the same score cannot be entered in a HashSet created in the main() of the application.

    >Important:\
    >There can be restaurants with the same name with different scores, but there can't be restaurants with the same name and the same score.

- ## Exercise 2
    Using the class of the previous program, create the necessary implementation for the Restaurant class objects to be sorted by name and by score in ascending order.

    >Example: 
    >
    >name: restaurant1, score: 8\
    >name: restaurant1, score: 7

# Level 3
- ## Exercise 1
    Create an application capable of reading a CSV file. This file has 3 fields: name, surname and ID, for each record. It is about ordering the people read from the file, through their name, surname or ID. You can use the list that you think is most appropriate.

    The Person class has 3 attributes: 

    - name
    - surname
    - DNI


    The main class has the following menu:

    1.- Enter person.\
    2.- Show people sorted by name (A-Z).\
    3.- Show people sorted by name (Z-A).\
    4.- Show people sorted by surname (A-Z).\
    5.- Show people sorted by surname (Z-A).\
    6.- Show people sorted by DNI (1-9).\
    7.- Show people sorted by DNI (9-1).\
    0.- Exit.
    
    \
    The program must list people as in the following example:

    >___Name___ ____Surname___ __DNI__ 
    >
    >Andreu          Ballestero Llenas  34835767J \
    >Miquel          Bayona Font           48743957B \
    >Guillem         Capdevila Riu        33957834J \
    >Albert          Carbonell Ferrer      77364986R\
    >Ferran          Casas Coderch        23047848P\
    >Maria           Casellas Fuste          47102244S\
    >Genis           Ciutat Vendrell         39718459N
