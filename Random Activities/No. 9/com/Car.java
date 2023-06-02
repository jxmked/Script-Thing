package com;

import com.Model;
import com.Color;

public class Car {
  private int year;
  private Model model;
  private Color color;
  
  public Car(int y, Model m, Color c) {
    /**
     * Assign Car Properties.
     * */
    this.year = y;
    this.model = m;
    this.color = c;
  }
  
  public void display() {
    /**
     * Display Car Properties
     * */
     
    System.out.printf(
      "Model: %s\n - Color: %s\n - Year: %d\n\n", 
      this.model,
      this.color,
      this.year
    );
  }
}