package inheritance;

class MountainBike extends Bicycle {

	public int seatheight;

	public MountainBike(int startheight, int startspeed, int startgear) {
		super(startspeed, startgear);
		seatheight = startheight;
	}

	public void setheight(int newvalue) {
		seatheight = newvalue;
	}

}
