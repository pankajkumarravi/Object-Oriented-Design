
public class RportGenerator {
	private Reporting txnObject;

	public void generateReport() {
		System.out.println(txnObject.getName() + " " + txnObject.getDate() + " " + txnObject.productBreakDown());
	}
}
