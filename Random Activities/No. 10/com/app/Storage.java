package com.app;

import com.ThrowableExceptions.DeletionFailure;
import com.ThrowableExceptions.InsertionFailure;
import com.ThrowableExceptions.ItemNotFoundException;
import com.ThrowableExceptions.SearchFailure;
import com.ThrowableExceptions.UpdateFailure;
import java.util.Arrays;

public class Storage {

  /**
   * We're going to store all user input in this variable
   * */
  private static String[] stored_data = {};

  private static void delete(int index)
    throws ItemNotFoundException, DeletionFailure {
    try {
      if (stored_data[index] == null) {
        throw new ItemNotFoundException(
          String.format("Item at index %d does not exists.", index)
        );
      }

      String[] tmp = new String[stored_data.length - 1];

      for (int i = 0; i < tmp.length; i++) {
        int index_to_copy = i;

        if (i >= index) {
          index_to_copy = i + 1;
        }

        tmp[i] = stored_data[index_to_copy];
      }

      stored_data = tmp;

      return;
    } catch (ItemNotFoundException err) {
      throw err;
    } catch (Exception err) {}

    throw new DeletionFailure(
      String.format("Failed to delete an item at index %d.", index)
    );
  }

  /**
   * Insert new string into variable array
   * */
  public static void insert(String str) throws InsertionFailure {
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
    } catch (Exception err) {}

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
