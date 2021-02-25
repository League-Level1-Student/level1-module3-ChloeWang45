package _01_intro_to_static;

public class Athlete {
	
	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete (String name, int speed){
	    this.name = name;
	    this.speed = speed;
	}

	public static void main(String[] args) {
		//create two athletes
		Athlete bob = new Athlete("Bob", 10);
		Athlete joe = new Athlete("Joe", 9);
	    //print their names, bibNumbers, and the location of their race. 
		System.out.println(Athlete.nextBibNumber);
		System.out.println(bob.name);
		System.out.println(Athlete.raceLocation);
		System.out.println(Athlete.nextBibNumber + 1);
		System.out.println(joe.name);
		System.out.println(Athlete.raceLocation);
 }
}
