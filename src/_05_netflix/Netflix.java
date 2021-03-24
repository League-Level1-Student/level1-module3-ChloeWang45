package _05_netflix;

public class Netflix {

	public static void main(String[] args) {
		Movie wonder = new Movie("Wonder", 4);
		Movie titanic = new Movie("Titanic", 5);
		Movie twilight = new Movie("Twilight", 2);
		Movie kissingbooth = new Movie("The Kissing Booth", 3);
		Movie dirt = new Movie("Dirt", 1);
		System.out.println(wonder.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(wonder);
		queue.addMovie(titanic);
		queue.addMovie(twilight);
		queue.addMovie(kissingbooth);
		queue.addMovie(dirt);
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie());
		System.out.println("The second best movie is " + queue.getSecondBestMovie());
	}
}
