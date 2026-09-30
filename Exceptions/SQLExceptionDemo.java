import java.sql.SQLException;

class SQLExceptionDemo {

    public static void main(String[] args) throws SQLException {

        throw new SQLException("Database connection error");
    }
}