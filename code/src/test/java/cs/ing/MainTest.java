package cs.ing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
    @Test
    public void TestMain() {
        Main app = new Main();
        app.main(new String[0]);
    }
}
