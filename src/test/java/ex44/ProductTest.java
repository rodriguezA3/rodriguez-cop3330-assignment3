package ex44;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getName() {

        JSONObject obj1 = new  JSONObject();

        obj1.put("name", "Widget");
        obj1.put("price", 25.00);
        obj1.put("quantity", 5);

        JSONObject obj2 = new  JSONObject();

        obj2.put("name", "Thing");
        obj2.put("price", 15.00);
        obj2.put("quantity", 5);

        JSONObject obj3 = new  JSONObject();

        obj3.put("name", "Doodad");
        obj3.put("price", 5.00);
        obj3.put("quantity", 10);

        Product test = new Product();
        String result1 =test.getName(obj1);
        String result2 =test.getName(obj2);
        String result3 =test.getName(obj3);

        assertEquals(result1,"Widget");
        assertEquals(result2,"Thing");
        assertEquals(result3,"Doodad");




    }
}