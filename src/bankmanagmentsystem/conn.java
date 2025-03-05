package bankmanagmentsystem;

import java.sql.*;

public class conn {

    Connection c;
    static Statement s;

    public conn() {
        try {
            // Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "umang@2126");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
