
public class SchoolStaff {
	private void makeAnnouncement() {
		System.out.println("made annoucement ...");
	}

	private void takeAttendance() {
		System.out.println("took attendance ....");
	}

	private void collectPaperWork() {
		System.out.println("collected paperwork ...");
	}

	private void conductHallwayDuties() {
		System.out.println("Collected hallway duties... ");
	}

	public void performotherDuties() {
		makeAnnouncement();
		takeAttendance();
		collectPaperWork();
		conductHallwayDuties();
	}
}
