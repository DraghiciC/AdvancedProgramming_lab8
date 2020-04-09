import java.sql.*;

public class Main {
	public static void main(String[] args) {
		Database db = Database.getInstance();
		ArtistController ac = new ArtistController();
		AlbumController alc = new AlbumController();
		ac.create("Mihai Alex", "Moldova");
		ac.create("Mihai Margineanu", "Romania");
		ac.create("Alexander", "America");
		ac.create("Ivan Ivanovski", "Rusia");
		ac.findByName("Mihai");
		System.out.println("");
		ac.findByName("Ivan");
		System.out.println("");
		alc.create("Top songs", 3, 2010);
		alc.create("Fum de taverna", 2, 2019);
		alc.create("khoroshaya muzyka", 4, 2009);
		alc.findByArtist(3);
		alc.findByArtist(2);
	}
}
