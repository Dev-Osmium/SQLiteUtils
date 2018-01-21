package xyx.devosmium.util.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDatabaseMgmt {


    /**
     *
     * @param filePath The relative path used to create the DB
     */

    public void createDb(String filePath) {
        String url = "jdbc:sqlite:" + filePath;

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn!=null) {
                System.out.println("New database was created at: " + filePath);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }


    }

}
