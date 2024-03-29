package com.app;

import com.ThrowableExceptions.InvaidArgumentTypeException;
import com.UnhandledException;
import com.app.Displays;
import com.app.Selection;
import com.app.Storage;
import com.app.Utils;
import com.app.methods.Insert;
import com.validators.StringValidator;

public class BasicArrayOperations extends Displays {

  private static final StringValidator validate = new StringValidator();
  private final Storage db = new Storage();

  public BasicArrayOperations(String client_name) {
    this.client_name = Utils.toTitleCase(client_name);

    /**
     * Match a-z characters with space and case insensitive
     * with upto 32 length of characters.
     *
     * Disallowed white space only
     * */
    validate.string_value_pattern("^(?!^\s+$)[a-z\s]{1,32}$");

    super.intro_banner();
    System.out.println("\n\n");

    this.main_option();
  }

  public void main_option() {
    /**
     * Ask an action to perform
     * */
    final Selection selection = new Selection();

    selection.add_option("Insert");
    selection.add_option("Modify");
    selection.add_option("Search");
    selection.add_option("Delete");
    selection.add_option("View");
    selection.add_option("Exit");

    selection.print_selections();

    String ans = selection_ask(selection);

    switch (ans.toLowerCase()) {
      case "insert":
        break;
      case "modify":
        break;
      case "search":
        break;
      case "delete":
        break;
      case "view":
        break;
      case "exit":
        break;
    }
  }

  public static String selection_ask(Selection instance) {
    /**
     * This function will continuesly ask for a valid input.
     *
     * And may return the selected value instead of an index.
     * */
    do {
      System.out.println("Please, select a method to perform:");

      instance.ask();

      try {
        if (instance.is_on_range(instance.get_answer())) {
          return instance.get_value(instance.get_answer());
        }
      } catch (InvaidArgumentTypeException err) {
        continue;
      } catch (Exception err) {
        System.out.println(
          "\n\nUnhandled error has been caught.\n\nExiting..."
        );
        System.exit(1);
      }

      System.out.println("That is out of selection.\n");
    } while (true);
  }

  /**
   * Our methods like insert, view, edit, delete, and search
   * */

  public void insert(String str) {}
}
