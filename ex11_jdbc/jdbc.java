/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Best
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/hotel", "root", "");
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the id and hotel name");
            int x = obj.nextInt();
            String n = obj.next();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into infos values(?,?)");
            ps.setInt(1, x);
            ps.setString(2, n);
            if( ps.executeUpdate()==1){
                System.out.println("insert successfully");
            }
            PreparedStatement pm=(PreparedStatement) con.prepareStatement("select * from info");
            ResultSet rs=pm1.executeQuery();
            while(rs.next())
            {
                int s = rs.getInt("id");
                String m = rs.getString("name");
                System.out.println(s + " " + m);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
