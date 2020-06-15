package hotel.dbase;

import java.sql.*;

public class Db {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DOMAIN_NAME = "localhost:3306";
    static final String DB_NAME = "hotel";
    static final String DB_URL = "jdbc:mysql://" + DOMAIN_NAME + "/" + DB_NAME + "?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "tahabiyik";
//
    static Connection conn;
    static Statement stat;

    public static void Connnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            stat = (Statement) conn.createStatement();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public static void Add(String sql) {

        try {
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 public static void Edit(String sql) {

        try {
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static ResultSet Find(String sql) {
        ResultSet rs = null;
        try {
            rs = stat.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

}
