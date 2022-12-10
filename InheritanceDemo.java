package inheritance;

class InheritanceDemo {

	public static void main(String[] args) {

		MountainBike mountainbike = new MountainBike(20, 10, 1);
		System.out.println("Gear is: " + mountainbike.gear);
		System.out.println("seat heght is: " + mountainbike.seatheight);
		System.out.println("speed is: " + mountainbike.speed);

		mountainbike.applybreaks(3);
		mountainbike.changegear(3, 0);
		System.out.println("bike speed after break is: " + mountainbike.speed);
		System.out.println("change gear to: " + mountainbike.gear);
		mountainbike.changegear(0, 1);
		System.out.println("change gear to: " + mountainbike.gear);
	}

}
