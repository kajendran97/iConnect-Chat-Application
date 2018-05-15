/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iconnect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ragulravindiran
 */
public class dbConnection {

    private Connection dbConnection;

    public Connection connect() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Successfull...!");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Connection Failed...!" + cnfe);
        }

        String url = "jdbc:mysql://localhost:3306/iConnect_Accounts";

        try {
            dbConnection = (Connection) DriverManager.getConnection(url, "root", "");
            System.out.println("Database Connected Successfully..!");
        } catch (SQLException se) {
            System.out.println("No Database" + se);
        }
        return dbConnection;
    }
}
