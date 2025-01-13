# Exercise Guidelines

# Level 1

- ## Exercise 1
In a music group there are different types of musical instruments. There are wind, string and percussion instruments.

All instruments have their name and price as attributes. In addition, they have a method called play(). This will be abstract in the instrument class and therefore must be implemented in the daughter classes. If a wind instrument is being played, the method must be shown per console: "A wind instrument is being played", if you're playing a string instrument: “A string instrument is being played” and if a percussion instrument is being played: “A percussion instrument is being played.”.


The process of loading a class only takes place once. It shows that the load can be caused by the creation of the first instance of this class or by access to a static member of it.

Search for information about initialization blocks and static blocks in Java.

- ## Exercise 2
Create a "Car" class with attributes: brand, model and power. The brand must be final static, the model static and the power final. Show the difference between the three. Can any of them be initialized in the class constructor?

Add two methods to the "Car" class. A static method called brake() and a non-static method called accelerate(). The acceleration method must be shown per console: “The vehicle is accelerating” and the brake() method must show: “The vehicle is braking.”.

Demonstrate how to invoke the static and non-static method from main() of the main class.

# Level 2

- ## Exercise 1
Create a class called "Telephone" with the brand and model attributes, and the call() method. This method must receive a String with a phone number. The method must display a message per console saying that the number received by parameter is being called.

Create an interface called "Camera" with the photograph() method, and another interface called Clock with the alarm() method.

Create a class called "Smartphone" that is a subclass of "Telephone" and at the same time implements the "Camera" and "Clock" interfaces.

The photograph() method must show per console: “A photo is being taken” and the alarm() method must show: “The alarm is ringing.”.

From the main() application, create a Smartphone object and call the above methods.

# Level 3
- ## Exercise 1
In a newsroom of sports the news are classified by sports: football, basketball, tennis, F1 and motorcycling.

The writing team can have more than one editor, and of each of them we want to know their name, identity card number and salary. Once an identity number has been assigned, it will never be able to change. All the editors have the same salary, and if in the future the company increases it, it will apply to everyone equally. At the moment the current salary is 1500€.

Each editor can work on more than one news item. The news must have a headline, a text, a score and a price. At the time of creation, the text must be empty.

In addition, football news should show which competition is referred to (String), which club (String) and which player (String).

Basketball news must indicate which competition is referred to (String) and which club (String).

From the news of tennis you have to know which competition (String) they talk about and which tennis players (String).

From the F1 news we need to know which team(String) they refer to.

From the motorcycle news it must be indicated which team (String) is talked about.

The news are sold to different media. To know the price of each news we have to implement a method called calculateNewsPrice().

Below is how to calculate the price of each news item:

- **Football news:**\
Initial price: 300€\
Champions League: 100€\
Barça or Madrid: 100€\
Ferran Torres or Benzema: 50€

Example: A story that talks about a goal by Ferran Torres of Barça in the Champions League, has a price of ' 550.

- **Basketball news:**\
Initial price: 250€\
Euroleague: 75€\
Barça or Madrid: 75€

- **Tennis news:**\
Initial price: 150€\
Federer, Christmas or Djokovic: 100€

- **F1 News:**\
Initial price: 100€\
Ferrari or Mercedes: 50€

- **Motorcycling news:**\
Initial price: 100€\
Honda or Yamaha: 50€

\
To calculate the scores of the news, the following criteria are followed:

- **Football news:**\
5 Points.\
Champions League: 3 points\
League: 2 points\
Barça or Madrid: 1 point\
Ferran Torres or Benzema: 1 point

Example: A story that talks about a goal by Ferran Torres of Barça in the Champions League, has a score of 10 points.

- **Basketball news**:\
4 points\
Euroleague: 3 points\
ACB: 2 points\
Barça or Madrid: 1 point

- **Tenis News**:\
4 points\
Federer, Christmas or Djokovic: 3 points

- **F1 News**:\
4 points\
Ferrari or Mercedes: 2 points

- **Motorcycling news**:\
3 points\
Honda or Yamaha: 3 points

\
In the main class you have to make a menu with the following options:

1.- Introduce editor.\
2.- Delete editor.\
3.- Introduce news to an editor.\
4.- Delete news (you must request editor and owner of the news).\
5.- Show all the news per editor.\
6.- Calculate the score of the news.\
7.- Calculate price-news.
