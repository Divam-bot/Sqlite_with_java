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
public class Query {
    public static void main(String args[]){
        Connection c = null ;
        Statement createstatement = null;
        String sql;
        try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:Movies.db");
         
         createstatement = c.createStatement();
         ResultSet rs = createstatement.executeQuery( "SELECT * FROM MOVIES;" );
         
         System.out.println("***** Printing without parameter all movies. *****\n");
         while ( rs.next() ) {
            int year = rs.getInt("YOR");
            String  name = rs.getString("NAME");
            String actor  = rs.getString("LEAD_ACTOR");
            String actress  = rs.getString("LEAD_ACTRESS");
            String  director = rs.getString("DIRECTOR");

            System.out.println( "NAME = " + name );
            System.out.println( "LEAD_ACTRESS = " + actress );
            System.out.println( "LEAD_ACTOR = " + actor );
            System.out.println( "YEAR OF REALESE = " + year );
            System.out.println( "DIRECTOR = " + director );
            System.out.println();
            }
         System.out.println("***** Printing with parameter(Actor name=Akshay kumar) movie. *****\n");
         rs = createstatement.executeQuery( "SELECT * FROM MOVIES WHERE LEAD_ACTOR='Akshay Kumar';" );
         while ( rs.next() ) {
            int year = rs.getInt("YOR");
            String  name = rs.getString("NAME");
            String actor  = rs.getString("LEAD_ACTOR");
            String actress  = rs.getString("LEAD_ACTRESS");
            String  director = rs.getString("DIRECTOR");

            System.out.println( "NAME = " + name );
            System.out.println( "LEAD_ACTRESS = " + actress );
            System.out.println( "LEAD_ACTOR = " + actor );
            System.out.println( "YEAR OF REALESE = " + year );
            System.out.println( "DIRECTOR = " + director );
            System.out.println();
            }
         
         
         rs.close();
         createstatement.close();
         c.close();
         
        }
        catch ( Exception e ) {
           System.err.println( e.getClass().getName() + ": " + e.getMessage() );
           System.exit(0);
        }
        System.out.println("operation done successfully");

    }
}