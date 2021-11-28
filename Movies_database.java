/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mulesoftinternship;
import java.sql.*;
/**
 *
 * @author Divam
 */
public class Movies_database {
public static void main(String args[]){
        Connection c = null ;
        Statement createstatement = null;
        String sql;
        try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:Movies.db");
         
         createstatement = c.createStatement();
         sql =     "CREATE TABLE MOVIES"
                 + "( NAME  TEXT NOT NULL,"
                 + "LEAD_ACTRESS TEXT ,"
                 + "LEAD_ACTOR TEXT ,"
                 + "YOR INT NOT NULL,"
                 + "DIRECTOR TEXT NOT NULL)";
         
         createstatement.executeUpdate(sql);
         createstatement.close();
         c.close();
        } catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
