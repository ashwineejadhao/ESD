package cdac.overload;

public class TestAreaFinder {

	public static void main(String[] args) {

		AreaFinder a = new AreaFinder();

		a.findArea(34);
		a.findArea(23.4f);
		a.findArea(12, 9);

	}

}
