/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Brian
 */
public class ConnectionFactory {
    Connection con;
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String user = "hr";
    String pass = "hr";
    
    public Connection connect() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            
        }
        return con;
    }
}
