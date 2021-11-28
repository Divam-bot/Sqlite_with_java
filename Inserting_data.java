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
public class Inserting_data {
    public static void main(String args[]){
        Connection c = null ;
        Statement createstatement = null;
        String sql;
        try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:Movies.db");
         
         createstatement = c.createStatement();
         
         sql =     "INSERT INTO MOVIES (NAME,LEAD_ACTRESS,LEAD_ACTOR,YOR,DIRECTOR) "
                 + "VALUES ('Shiddat','Radhika Madan','Sunny Kaushal',2021,'Kunal Deshmukh');";
         createstatement.executeUpdate(sql);
         
         sql =     "INSERT INTO MOVIES (NAME,LEAD_ACTRESS,LEAD_ACTOR,YOR,DIRECTOR) "
                 + "VALUES ('Jay Bhim','Lijomol Jose','Suriya',2021,'TJ Gnanavel');";
         createstatement.executeUpdate(sql);
         
         sql =     "INSERT INTO MOVIES (NAME,LEAD_ACTRESS,LEAD_ACTOR,YOR,DIRECTOR) "
                 + "VALUES ('Sultan','Anushka Sharma','Salman Khan',2016,'Ali Abbas Zafar');";
         createstatement.executeUpdate(sql);
         
         sql =     "INSERT INTO MOVIES (NAME,LEAD_ACTRESS,LEAD_ACTOR,YOR,DIRECTOR) "
                 + "VALUES ('URI','Yami Gautam','Vicky Kaushal',2021,'Aditya Dhar');";
         createstatement.executeUpdate(sql);
         
         sql =     "INSERT INTO MOVIES (NAME,LEAD_ACTRESS,LEAD_ACTOR,YOR,DIRECTOR) "
                 + "VALUES ('Brothers','Jacqueline','Akshay Kumar',2015,'Karan Malhotra');";
         createstatement.executeUpdate(sql);
         
         createstatement.close();
         c.close();
         
        }
        catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("insertion done successfully");
    }
}
