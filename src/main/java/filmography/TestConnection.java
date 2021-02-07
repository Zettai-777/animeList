package filmography;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
    Тестовый класс для проверки соединения.
    Временный, используется один раз.
 */

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db_anime_list";
        String userName = "root";
        String password = "root";
        System.out.println("Start connection");

        try(Connection connection = DriverManager.getConnection(url, userName, password)) {
            System.out.println("Connection completed.");
        } catch (SQLException sqlException) {
            System.err.println("Connection denied!");
        }
    }
}
