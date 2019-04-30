/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood.bank;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Dell
 */
public class javaconnection {
    static Connection conn;
    public static Connection connect(){
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
        return conn;
    }
    catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
    }
}
