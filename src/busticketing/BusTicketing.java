package busticketing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class BusTicketing {

  private static final String USERNAME = "root";
  private static final String PASSWORD = "Secretnoclue01";
  private static final String DATA_CONNECTION = "jdbc:mysql://localhost:3306/jtransit";

  public static Connection sqlConn = null;
  static PreparedStatement pst = null;
  static ResultSet rs = null;

  public static void main(String[] args) {
    SignUp bus = new SignUp();
    bus.setVisible(true);
    upDateDB();
  }

  public static void upDateDB() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      sqlConn = DriverManager.getConnection(DATA_CONNECTION, USERNAME, PASSWORD);
      pst = sqlConn.prepareStatement("select * from jtransit.users");
      rs = pst.executeQuery();
      Statement statement = sqlConn.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from jtransit.users");

      while (resultSet.next()) {
        String email = resultSet.getString("email");
        String name = resultSet.getString("name");
        String password = resultSet.getString("password");
        String contactNumber = resultSet.getString("contactNumber");
      }
    } catch (SQLException | ClassNotFoundException e) {
      System.out.print(e);
    }
  }
}