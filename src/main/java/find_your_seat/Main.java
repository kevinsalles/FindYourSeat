package find_your_seat;

import ui.Form;
import ui.FormFactory;


public class Main {

    public static void main(String [] args)
    {
        Form form = new FormFactory().getInstance();
        form.run();
    }
}
