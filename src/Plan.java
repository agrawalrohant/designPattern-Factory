
public abstract class Plan {

	protected double rate;

	protected abstract void getRate();

	protected void calculateBill(int unit) {
		System.out.println(unit * rate);
	}
}
