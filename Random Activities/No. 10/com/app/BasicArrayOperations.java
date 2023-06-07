package com.app;

import com.ThrowableExceptions.InvaidArgumentTypeException;
import com.app.Displays;
import com.app.Selection;
import com.app.Utils;
import com.validators.StringValidator;

public class BasicArrayOperations extends Displays {

  private static final StringValidator validate = new StringValidator();

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
    final Selection selection = new Selection();

    selection.add_option("Insert");
    selection.add_option("Modify");
    selection.add_option("Search");
    selection.add_option("Delete");
    selection.add_option("View");
    selection.add_option("Exit");

    selection.print_selections();

    selection_ask(selection);

    System.out.println("Congrats");
  }

  public static int selection_ask(Selection instance) {
    do {
      System.out.println("Please, select a method to perform:");

      instance.ask();

      try {
        if (instance.is_on_range(instance.get_answer())) {
          return 0;
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
}
