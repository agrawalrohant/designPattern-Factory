import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBillService {

	public static void main(String[] args) throws IOException {
		InternalPlanFactory planFactory = new InternalPlanFactory();
		System.out.println("Enter the name of the plan for which bill need to be generated:");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String planName = bf.readLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = Integer.parseInt(bf.readLine());
		Plan plan = planFactory.getPlan(planName);
		System.out.println("Bill amount for " + planName + " of " + units + " units is : ");
		// Sync with the latest rates applicable from DB or another service.
		plan.getRate();
		plan.calculateBill(units);
	}

}
