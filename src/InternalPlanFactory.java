
public class InternalPlanFactory {

	Plan getPlan(String name) {

		switch (name.toUpperCase()) {
		case "DOMESTIC":
			return new DomesticPlan();
		case "COMMERCIAL":
			return new CommercialPlan();
		default:
			return null;
		}
	}

}
