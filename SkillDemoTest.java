import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiply(){
        assertEquals(27, SkillDemo.multiply(9, 3));
    }
}