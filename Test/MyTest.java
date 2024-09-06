import demo.MyFunction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyTest {
    static MyFunction obj;

    @BeforeAll
    public static void setup(){
        obj = new MyFunction();
    }
    @Test
    @DisplayName("Test method cong")
    public void testCong(){
        Assert.assertEquals(10, obj.cong(5,5));
    }

    @Test
    @DisplayName("Test assertTrue")
    public void testTrue(){
        Assert.assertTrue(10==obj.cong(5,5));
    }
}
