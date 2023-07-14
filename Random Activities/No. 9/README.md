# Car Demo

Basic use of java enums

**_Hands-on Activity 1 - ARG_**

**_Instructions_**

1. Create four (4) Java classes named **_Color_**, **_Model_**, **_Car_**, and **_CarDemo_**.

2. In the **\_Color\_\_** class, create an enum named **_Color_** that consists of
   six (6) colors of your choice.

3. In the **_Model_** class, create an enum named **_Model_** that contains
   the following values: **_SEDAN_**, **_SUV_**, **_CONVERTIBLE_**, and **_HATCHBACK_**.

4. In the **_Car_** class, declare three (3) private fields:

   - `int` variable named `year`
   - A `Model` object named `model`
   - A `Color` model named `color`

5. Add a constructor for the **_Car_** class with three (3) parameters:
   **_yr_** (int), **_model_** (Model), and **_color_** (Color). Inside the constructor,
   assign **_yr_** to **_year_**, **_m_** to **_model_**, and **_c_** to **_color_**.

6. Add a `display()` method that prints the three (3) Car object's data.

7. In the main method of the **_CarDemo_** class, instantiate two (2) Car
   objects assigning values to them using enumeration values for the
   models and colors.
   **_Example_**: `Car car1 = new Car(2014, Model.SUV, Color.RED);`

8. Add two (2) statements to display the data of the two (2) Car objects.

#### Problem Source - Facebook Post
