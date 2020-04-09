import java.sql.*;

public class ArtistController {
	Database db;
	public void create(String name,String country) {
		try {
			Statement stmt=db.con.createStatement();
			stmt.executeQuery("insert into artists values (artists_seq.nextval,'"+name+"','"+country+"')"); 
			//while(rs.next())  
				//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	public void findByName(String name) {
		try {
			Statement stmt=db.con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from artists where name like '"+name+"%'");
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public ArtistController() {
		super();
		this.db = Database.getInstance();
	}
	
}
