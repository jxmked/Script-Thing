# Car Demo

Basic use of java enums

___Hands-on Activity 1 - ARG___

***Instructions***

1. Create four (4) Java classes named ___Color___, ___Model___, ___Car___, and ___CarDemo___.

2. In the ___Color____ class, create an enum named ___Color___ that consists of 
six (6) colors of your choice.

3. In the ___Model___ class, create an enum named ___Model___ that contains
the following values: ___SEDAN___, ___SUV___, ___CONVERTIBLE___, and ___HATCHBACK___.

4. In the ___Car___ class, declare three (3) private fields:
    - `int` variable named `year`
    - A `Model` object named `model`
    - A `Color` model named `color`

5. Add a constructor for the ___Car___ class with three (3) parameters:
___yr___ (int), ___model___ (Model), and ___color___ (Color). Inside the constructor,
assign ___yr___ to ___year___, ___m___ to ___model___, and ___c___ to ___color___.

6. Add a `display()` method that prints the three (3) Car object's data.

7. In the main method of the ___CarDemo___ class, instantiate two (2) Car
objects assigning values to them using enumeration values for the
models and colors.
___Example___: `Car car1 = new Car(2014, Model.SUV, Color.RED);`

8. Add two (2) statements to display the data of the two (2) Car objects.

#### Problem Source - Facebook Post
