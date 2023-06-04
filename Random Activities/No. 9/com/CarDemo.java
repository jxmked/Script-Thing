package com;

import com.Car;
import com.Color;
import com.Model;

public class CarDemo {

  public static void main(String[] args) {
    Car car1 = new Car(2013, Model.SUV, Color.RED);
    Car car2 = new Car(2022, Model.SEDAN, Color.BLACK);

    car1.display();
    car2.display();
  }
}
