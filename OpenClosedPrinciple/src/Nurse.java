
public class Nurse extends Employee {
	// Nurse
	private void checkVitalSigns() {
		System.out.println("Checking Vitals ...");
	}

	private void drawBlood() {
		System.out.println("drawing Blood ....");
	}

	private void cleanPatientArea() {
		System.out.println("cleaning patient area....");

	}

	public Nurse(int id, String name, String departnemt, boolean working) {
		super(id, name, departnemt, working);
		System.out.println("Nurse in Action ...");
	}

	@Override
	public void performDuties() {
		checkVitalSigns();
		drawBlood();
		cleanPatientArea();

	}

}
