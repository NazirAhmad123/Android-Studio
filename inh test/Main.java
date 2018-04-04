package inheritance;

public class Main {
	public static void main(String[] args) {
		Outlander outlander = new Outlander(40);
		outlander.steer(45);
		outlander.accelerate(36);
		outlander.accelerate(20);
		outlander.accelerate(-42);
	}
}
