/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myroject;
import java.sql.*;
/**
 *
 * @author guest2211
 */
public class Databsae {

    static final String DB_URL ="jdbc:mysql://localhost/demo";
    static final String USER ="root";
    static final String PASS ="";
        
        public static Connection mydb(){
        
            Connection conn = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);
                System.out.println("DataBase is connected");
                return conn;
                
            }catch(Exception e){
                
                System.out.println(e);
            }
            return null;
        }
        
}


