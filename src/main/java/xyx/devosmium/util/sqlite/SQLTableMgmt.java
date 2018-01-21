package xyx.devosmium.util.sqlite;

import java.sql.*;

public class SQLTableMgmt {


    /**
     *
     * @param dbFilePath Path to the DB
     * @param sqlStmt Actual SQL Statement to be executed
     */
    public void createTable(String dbFilePath, String sqlStmt) {
        String url = "jdbc:sqlite:" + dbFilePath;

        try(Connection conn = DriverManager.getConnection(url)) {
            Statement stmt = conn.createStatement();
            stmt.execute(sqlStmt);
            System.out.println("Created new table");
        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    public void insertInto(String dbFilePath, String sqlStmt) {
        String url = "jdbc:sqlite:" + dbFilePath;

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(sqlStmt)) {
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
