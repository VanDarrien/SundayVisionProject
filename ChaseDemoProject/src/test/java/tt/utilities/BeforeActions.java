package tt.utilities;
import cucumber.api.java.Before;
import cucumber.api.Scenario;
public class BeforeActions {

	@Before
public void beforeActions(Scenario scen){
System.out.println(">>Initializing Chrome Driver");

SetupDrivers.setupDriver();
System.out.println(scen.getName());
}
}