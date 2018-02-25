package ATestTask.FirstActivity;


public class Person { //extends Humanity {

	//TODO 1 Implement Person Attributes
	private String firstName;
	private String secondName;
	private int age;

	//Behavior - default constructor
	public Person(int i, String worker, String factory, double v) {
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String introduce()
	{
		String outLine = "My name is " + this.firstName + " " + this.secondName +
				" and i am " + this.age +" years old";
		System.out.println(outLine);
		return outLine;
	}
/*
	@Override
	public String getKindOfHumanity() {
		return "civilized world";
	}

	@Override
	public void setKindOfHumanity(String name) {
		{
	}*/
}

