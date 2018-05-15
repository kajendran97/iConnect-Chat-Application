package com.iConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ragulravindiran
 */
@WebService(serviceName = "iConnectChatApp")
public class iConnectChatApp {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "loginUI")
    public boolean loginUI(@WebParam(name = "loginId") String loginId, @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        Connection conn = new databaseConn().connect();

        String sql = "select * from userAccounts where loginID=? and password=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, loginId);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "signUp")
    @Oneway
    public void signUp(@WebParam(name = "nickname") String nickname, @WebParam(name = "loginID") String loginID, @WebParam(name = "pass") String pass, @WebParam(name = "confirmPass") String confirmPass) {

        Connection conn = new databaseConn().connect();

        try {

            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO userAccounts (nickname, loginID, password, confirmPassword) VALUES ('" + nickname + "','" + loginID + "','" + pass + "','" + confirmPass + "')";
            stmt.executeUpdate(sql);
            System.out.println(sql);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "threadCreate")
    @Oneway
    public void threadCreate(@WebParam(name = "titleThread") String titleThread, @WebParam(name = "lastEditedTime") String lastEditedTime, @WebParam(name = "editedBy") String editedBy) {

        Connection conn = new databaseConn().connect();

        try {

            Statement statement = conn.createStatement();
            String sql = "INSERT INTO threads (threadTitle, LastEdited, User) VALUES ('" + titleThread + "','" + lastEditedTime + "','" + editedBy + "')";
            statement.executeUpdate(sql);
            System.out.println(sql);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "threadEdit")
    @Oneway
    public void threadEdit(@WebParam(name = "thread") int thread, @WebParam(name = "message") String message, @WebParam(name = "editedTime") String editedTime, @WebParam(name = "editedUser") String editedUser) {
    
        Connection conn = new databaseConn().connect();
        
        try {

            Statement statement = conn.createStatement();

            String sql = "insert into messages (threadId, message, lastEditedTime, sentUser) VALUES ('" + thread + "','" + message + "','" + editedTime + "','" + editedUser + "')";
            statement.executeUpdate(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }



}
