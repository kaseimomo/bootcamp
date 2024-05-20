package SirMade;
import SirMade.exception.DBConnectionException;

@FunctionalInterface
public interface DatabaseConnection {
  void connect() throws DBConnectionException;
}
