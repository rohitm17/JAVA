//import java.util.*;

class TestCuboid {

	public static void main(String[] args) {

		Cuboid c1 = new Cuboid(10, 20, 30);
		Cuboid c2 = new Cuboid(11, 22, 30);
		Cuboid c3 = new Cuboid(12, 12, 30);

		System.out.println("Cuboid 1 ceated with id " + c1.getCuboidID());
		System.out.println("Cuboid 2 ceated with id " + c2.getCuboidID());
		System.out.println("Cuboid 3 ceated with id " + c3.getCuboidID());

		System.out.println("C1 Surface Area " + c1.getSurfaceArea() + " and Volume " + c1.getVolume());
		System.out.println("C2 Surface Area " + c2.getSurfaceArea() + " and Volume " + c2.getVolume());
		System.out.println("C3 Surface Area " + c3.getSurfaceArea() + " and Volume " + c3.getVolume());

		System.out.println("vol of c2 after removing hollow sphere " + Math.round(c2.getVolume(7.5)));

		System.out.println("ID of cuboid with max Volume: " + findCuboidWithMaxVolume(c1, c2, c3));
	}

	public static int findCuboidWithMaxVolume(Cuboid c1, Cuboid c2, Cuboid c3) {

		double v1 = c1.getVolume();
		double v2 = c2.getVolume();
		double v3 = c3.getVolume();

		if (v1 >= v2 && v1 >= v3) {
			return c1.getCuboidID();
		} else if (v3 >= v2 && v1 < v3) {
			return c3.getCuboidID();
		} else {
			return c2.getCuboidID();
		}

	}
}