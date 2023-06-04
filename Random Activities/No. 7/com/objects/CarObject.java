package com.objects;

public class CarObject implements com.interfaces.CarObjectInterface {

  public String brand;
  public String model;
  public String type;
  public String color;
  public String torque;
  public String engine;

  /**
   * Currency: Pesos
   */
  public float price;

  /**
   * System generated ID
   */
  public int id;

  public CarObject() {}
}
