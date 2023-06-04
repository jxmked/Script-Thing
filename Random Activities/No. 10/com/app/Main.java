package com.app;

import com.ThrowableExceptions.InsertionFailure;
import com.ThrowableExceptions.DeletionFailure;
import com.ThrowableExceptions.SearchFailure;
import com.ThrowableExceptions.UpdateFailure;

import java.util.Arrays;

public class Main {
  private static String[] stored_data = {};
  
  public static void main(String[] args) {
    
  }
  
  
  
  private static void insert(String str) throws InsertionFailure {
    try {
      /**
       * This would clone the stored_data variable,
       * push new value, and assign the new values
       * back to stored_data.
       * */
      stored_data = pushToArray(stored_data, str);
      
      /**
       * This return would prevent the code
       * to continue. Only if the code above
       * successfully executed
       * */
      return;
    } catch(err) { }
    
    /**
     * Otherwise, throw an exception InsertionFailure
     * to catch to handle error.
     * */
    throw new InsertionFailure("Failed to insert new element");
  }
  
  private static <T> T[] pushToArray(T[] arr, T new_value) {
    /**
     * We need to copy the old array into new array
     * with larger size. This is because Java has a fixed
     * size of array.
     * */
    int lengthOfArray = arr.length;
    T[] new_array = Arrays.copyOf(arr, lengthOfArray + 1);
    
    // Then add new element
    new_array[lengthOfArray] = new_value;
    
    return new_array;
  }
}
