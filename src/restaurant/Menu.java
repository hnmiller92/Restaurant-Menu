package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {

        MenuItem salad = new MenuItem(10.00,"salad","appetizer", LocalDate.now());
        MenuItem steak = new MenuItem(25.00,"meat","main course", LocalDate.now());

        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(salad);
        menu.add(steak);

        for (MenuItem item : menu) {
            System.out.println(item.getLastUpdated());
        }
    }

}
