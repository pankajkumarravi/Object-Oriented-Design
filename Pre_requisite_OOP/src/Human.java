
public class Human {
	String name;
	int age;
	int heightInInch;
	String eyeColor;

	public Human(int age, String name, int heightInInch, String eyeColor) {
		this.age = age;
		this.name = name;
		this.heightInInch = heightInInch;
		this.eyeColor = eyeColor;
	}

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public void spesk() {
		System.out.println("Hello , my name is " + name);
		System.out.println("My height in inch " + heightInInch);
		System.out.println("My age is " + age);
		System.out.println("My eye color " + eyeColor);
	}

	public void eat() {
		System.out.println("i m eating .........");
	}

	public void walk() {
		System.out.println("i m walking  .........");
	}
}
