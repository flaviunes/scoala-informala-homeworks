import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 * This is accommodation data acces object class with add , delete and get
 * methods.
 * 
 * @author Flaviu
 *
 */
public class AccomodationDAO {
	/**
	 * This method adds data into accommodation table.
	 * 
	 * @param accomodation
	 */
	public void add(Accomodation accomodation) {

		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				PreparedStatement stm = conn.prepareStatement(
						"INSERT INTO accomodation(type, bed_type, max_guests, description) values(?,?,?, ?)");) {

			stm.setString(1, accomodation.getType());
			stm.setString(2, accomodation.getBedType());
			stm.setInt(3, accomodation.getMaxGuests());
			stm.setString(4, accomodation.getDescription());

			stm.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * This method deletes all data from accommodation when called.
	 * 
	 * @param accomodation
	 */
	public void delete(Accomodation accomodation) {
		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				PreparedStatement stm = conn.prepareStatement("DELETE FROM accomodation");) {

			stm.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * This method prints all data from the accommodation table.
	 * 
	 * @return
	 */
	public List<Accomodation> getAll() {
		List<Accomodation> result = new LinkedList<>();

		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				Statement stm = conn.createStatement();
				ResultSet rs = stm.executeQuery("select id, type, bed_type, max_guests, description from accomodation");

		) {

			while (rs.next()) {
				Accomodation ac = new Accomodation();

				ac.setId(rs.getInt("id"));
				ac.setType(rs.getString("type"));
				ac.setBedType(rs.getString("bed_type"));
				ac.setMaxGuests(rs.getInt("max_guests"));
				ac.setDescription(rs.getString("description"));

				result.add(ac);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return result;
	}

	/**
	 * This method loads postgresql drivers
	 */
	private static void loadDriver() {
		try {
			Class.forName("org.postgresql.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.err.println("Can�t load driver. Verify CLASSPATH");
			System.err.println(e.getMessage());
		}

	}

	/**
	 * This method opens a new connection to out database.
	 * 
	 * @param type
	 * @param host
	 * @param port
	 * @param dbName
	 * @param user
	 * @param pw
	 * @return
	 */
	private static Connection newConnection(String type, String host, String port, String dbName, String user,
			String pw) {

		loadDriver();
		DriverManager.setLoginTimeout(60);
		try {
			String url = new StringBuilder().append("jdbc:").append(type).append("://").append(host).append(":")
					.append(port).append("/").append(dbName).append("?user=").append(user).append("&password=")
					.append(pw).toString();
			return DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.err.println("Cannot connect to the database: " + e.getMessage());
		}

		return null;
	}

}

// new
// StringBuilder().append("jdbc:").append(type).append("://").append(host).append(":")
// .append(port).append("/").append(dbName).append("?user=").append(user).append("&password=")
// .append(pw).toString();
