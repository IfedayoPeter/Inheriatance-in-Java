package inheritance;

public class EncapsulationDemo {
//	this is a student example
	private String name;
	private int age;
	private String address;
//	private is used to hide the properties of the object from outside world

	public EncapsulationDemo(String name, int age, String address) {
//		the constructor is set as public so the object can be accessed but the properties is private
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
//	this is a perfect encapsulation example

}
