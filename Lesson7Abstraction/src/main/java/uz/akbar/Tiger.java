package uz.akbar;

/**
 * Tiger
 */
public class Tiger implements Animal {

	public Tiger() {
		System.out.println("************* Tiger ******************");
	}

	@Override
	public void voice() {
		System.out.println("I am tiger!");
	}

	@Override
	public void eat() {
		System.out.println("I eat meat!");
	}

	@Override
	public void run() {
		System.out.println("I run very fast!");
	}

	@Override
	public String getName() {
		return "Tiger";
	}
}
