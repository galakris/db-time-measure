import java.sql.*;
import java.time.Duration;
import java.time.Instant;

public class DBQueryMeasure {


    public void measureQueryTime(String query, int amount) {

        try {
            Connection myConnection = DbConnection.getConnection();

            Statement myStatement = myConnection.createStatement();

            for (int i = 0; i < amount; i++) {
                Instant start = Instant.now();
                ResultSet resultSet = myStatement.executeQuery(query);
                Instant finish = Instant.now();
                long timeElapsed = Duration.between(start, finish).toMillis();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
