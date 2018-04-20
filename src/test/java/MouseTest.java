import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void before(){
        mouse = new Mouse("Acer", "100");
    }

    @Test
    public void hasMake(){
        assertEquals("Acer", mouse.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("100", mouse.getModel());
    }

    @Test
    public void canLeftClick(){
        assertEquals(1, mouse.clickLeftButton());
    }

    @Test
    public void canRightClick(){
        assertEquals(2, mouse.clickRightButton());
    }
}
