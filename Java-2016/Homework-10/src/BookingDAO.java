import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class BookingDAO {

	public void add(Accomodation accomodation) {

		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				PreparedStatement stm = conn.prepareStatement(
						"INSERT INTO accomodation(type, bed_type, max_guests, description) values('standard','double',2,'this room has sea view')");) {

			// stm.setString(1, student.getFirstName());
			// stm.setString(2, student.getLastName());
			// stm.setString(3, student.getGender().name());
			// java.sql.Date myDate = new
			// java.sql.Date(student.getBirthDate().getTime());
			//
			// stm.setDate(4, myDate);
			//
			// stm.execute();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	private static void loadDriver() {
		try {
			Class.forName("org.postgresql.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.err.println("Can’t load driver. Verify CLASSPATH");
			System.err.println(e.getMessage());
		}

	}

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
