import java.sql.*;
public class AlbumController {
	Database db;
	public void create(String name,int artistId,int releaseYear) {
		try {
			Statement stmt=db.con.createStatement();
			stmt.executeQuery("insert into albums values (albums_seq.nextval,'"+name+"',"+artistId+","+releaseYear+")"); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	public void findByArtist(int artistId) {
		try {
			Statement stmt=db.con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from albums where artist_id ="+artistId);
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public AlbumController() {
		super();
		this.db = Database.getInstance();
	}
	
}
