import java.util.ArrayList;
import java.util.List;

public class MainArraylist {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(90);
		list.add(45);
		list.add(33);
		list.add(278);
		list.add(1200);
		list.add(3000);
		list.add(290);
		list.add(900);
		list.add(04);
		list.add(56477);
		for (int i = 0; i < args.length; i++) {
			for (int j = i + 1; j < args.length; j++) {
				if (list.get(i) >= list.get(j)) {
					System.out.println("yoooooooooooooo");
				}
			}
		}
	}
}