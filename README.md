# Burgerjoint APP

Order a burger at burgerjoint. 
A fictional assignment

For this assignment, I implemented the Decorator Pattern. 
Decorating can provide new behavior for objects at run-time and makes it not necessary to subclass for all different combinations of objects that are offered.
Also, this way it is easy to add, change or remove burgers, toppings and additions. The only thing you have to change is the class of this object.

You can try the app with the Command Line terminal.

----------------------------

What this project is about
---------------------------

The aim is to help a burger company manage their process of selling hamburgers. 
The application selects the types of burger, some of the additional items to be added to the burgers and pricing.

User stories
------------

The basic hamburger should have the following items: 

•	Description and price
•	Up to 4 additional toppings (e.g. lettuce, tomato, carrot, etc) that the customer can select to be added to the burger 
•	Each one of these items gets charged an additional price. 
•	So you need some way to track how many items got added. The burger has a base price and the additions are all separately priced (up to 4 additions). 
•	And calculate the final price (base burger with all the additions). 
•	Create a Hamburger class to deal with all the above. 

The healthy burger should have the following: 

•	It can have 6 additions (toppings) in total. 
•	Hint: You probably want to process the two additional items in this new class (subclass of burger), 
•	The deluxe burger should have the following: 
•	Comes with chips and drinks as additions 
•	No extra additions are allowed. 
•	Prevent other additions being made. 
