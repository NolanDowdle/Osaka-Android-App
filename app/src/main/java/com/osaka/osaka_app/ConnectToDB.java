package com.osaka.osaka_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * author: Nolan Dowdle
 * Date: April 30, 2020
 */
public class ConnectToDB {

    String username;
    String password;
    String dbname;
    Connection connDB;
    ResultSet rsFinal;

    public ConnectToDB() {

        // connect to DB
        username = "root";
        password = "Rntaz333";
        dbname = "OsakaChinese";

        connDB = null;

        try {
            /*
            must use (com.mysql.cj.jdbc.Driver) for sql versions 5.0+
             */
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String connectionString = String.format("jdbc:mysql://localhost:3306/%s?autoReconnect=true&useSSL=false", dbname);
            connDB = DriverManager.getConnection(connectionString, username, password);
        } catch (Exception e) {
            System.out.println("DB connection error: " + e);
        }
        // create SQL command and test the connection:
        String sqlstr = "SELECT * FROM MenuItems;";
        try{
            Statement stmnt = null;
            System.out.println("");
            if (connDB != null) {
                stmnt = connDB.createStatement();


                System.out.println(sqlstr);

                ResultSet rs = stmnt.executeQuery(sqlstr);
                setRS(rs);

                while (rs.next()) {
                    System.out.println(rs.getString(1) + "\t" + rs.getString(2));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void setRS(ResultSet rs) {
        this.rsFinal = rs;
    }

    public ResultSet getRS() {
        return rsFinal;
    }
}