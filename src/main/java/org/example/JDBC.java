package Task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC{
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
                    Statement sta = con.createStatement();
                    sta.execute("USE JDBC");
            sta.execute("INSERT INTO employee VALUES"
                    +"(101,'Jenny',25,10000),(102,'Jacky',30,20000),"
                    +"(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shameer',25,90000)");

            System.out.println("Statement completed");
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}