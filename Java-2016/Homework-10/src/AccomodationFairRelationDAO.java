import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class AccomodationFairRelationDAO {
	/**
	 * This method adds data into accommodation table.
	 * 
	 * @param accomodation
	 */
	public void add(AccomodationFairRelation afr) {

		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				PreparedStatement stm = conn.prepareStatement(
						("INSERT INTO accomodation_fair_relation(id_accomodation, id_room_fair) values(?,?)"));) {

			stm.setLong(1, afr.getIdAccomodation());
			stm.setLong(2, afr.getIdRoomFair());

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
	public void delete(AccomodationFairRelation afr) {
		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				PreparedStatement stm = conn.prepareStatement("DELETE FROM accomodation_fair_relation");) {

			stm.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public void printJoinResult() {
		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				PreparedStatement stm = conn.prepareStatement(
						"SELECT * FROM accomodation_fair_relation [INNER] JOIN accomodation ON accomodation.id=accomodation_fair_relation.id_accomodation"
								+ "[INNER] JOIN room_fair ON room_fair.id=accomodation_fair_relation.id_room_fair");) {
			stm.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * This method prints all data from the accommodation table.
	 * 
	 * @return
	 */
	public List<AccomodationFairRelation> getAll() {
		List<AccomodationFairRelation> result = new LinkedList<>();

		try (Connection conn = newConnection("postgresql", "localhost", "5432", "Booking", "postgres", "portocaliu");
				Statement stm = conn.createStatement();
				ResultSet rs = stm.executeQuery("select idAccomodation, idRoomFair from accomodation_fair_relation");

		) {

			while (rs.next()) {
				AccomodationFairRelation afr = new AccomodationFairRelation();

				afr.setId(rs.getInt("id"));
				afr.setIdAccomodation(rs.getInt("id_accomodation"));
				afr.setIdRoomFair(rs.getInt("id_room_fair"));

				result.add(afr);
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
			System.err.println("Can’t load driver. Verify CLASSPATH");
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
