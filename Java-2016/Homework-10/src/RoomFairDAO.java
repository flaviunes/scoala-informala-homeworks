import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class RoomFairDAO {

	public void add(RoomFair rf) {

		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				PreparedStatement stm = conn
						.prepareStatement("INSERT INTO room_fair(value, season) values('1000','july2017')");) {

			stm.setDouble(1, rf.getValue());
			stm.setString(2, rf.getSeason());

			stm.execute();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public List<RoomFair> getAll() {
		List<RoomFair> result = new LinkedList<>();

		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				Statement stm = conn.createStatement();
				ResultSet rs = stm.executeQuery("select id, value, season from room_fair");

		) {

			while (rs.next()) {
				RoomFair rFair = new RoomFair();

				rFair.setId(rs.getInt("id"));
				rFair.setValue(rs.getDouble("value"));
				rFair.setSeason(rs.getString("season"));

				result.add(rFair);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return result;
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
