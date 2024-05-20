package SirMade;
import SirMade.exception.DBConnectionException;

public class MySQLDBConnection implements DatabaseConnection {
  @Override
  public void connect() throws DBConnectionException {
    boolean success = true;
    // Logic to connect MySQL DB...
    if (success) {
      System.out.println("Connected to MySQL Database ...");
      return;
    }
    throw new DBConnectionException();
  }
}
