import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ItemTest {

    @Test
    public void return_total_order_value_of_selected_items_from_menu(){

        Restaurant restaurant;
        LocalTime openingTime = LocalTime.parse("10:30:00");
        LocalTime closingTime = LocalTime.parse("22:00:00");
        restaurant =new Restaurant("Luigi's Pizza","Chennai",openingTime,closingTime);
        restaurant.addToMenu("Burger",69);
        restaurant.addToMenu("Coke",29);
        restaurant.addToMenu("Veg Pizza",119);
        restaurant.addToMenu("Corn Pizza", 159);
        restaurant.addToMenu("Cheese Pizza",209);

        List<Item> order = new ArrayList<Item>();
        restaurant.addToOrder("Cheese Pizza");
        restaurant.addToOrder("Coke");


        assertEquals(238,restaurant.getOrderTotalValue());



    }
}
