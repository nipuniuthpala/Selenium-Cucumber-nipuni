package steps;




import cucumber.api.java.Before;
import com.myTrip.utils.SeleniumDriver;

public class BeforeActions  {

	@Before
    public static void setUp() {

    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
}
