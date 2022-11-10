/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weaponmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
/**
 *
 * @author Best
 */
class insert{
    void load(){
        try{
            Scanner s=new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/weapon", "root", "");
            System.out.println("Enter the weapon_type");
            String a=s.next();
            System.out.println("Enter the weapon_id");
            int b=s.nextInt();
            System.out.println("Enter the weapon_name");
            String c= s.next();
            System.out.println("Enter the fire_rate");
            int d=s.nextInt();
            System.out.println("Enter the target range");
            int e=s.nextInt();
            System.out.println("Enter the weapon_caliber");
            Float f=s.nextFloat();
            PreparedStatement ps=(PreparedStatement)con.prepareStatement("insert into arm_info values(?,?,?,?,?,?)");
            ps.setString(1, a);
            ps.setInt(2, b);
            ps.setString(3, c);
            ps.setInt(4, d);
            ps.setInt(5, e);
            ps.setFloat(6, f);
            if(ps.executeUpdate()==1){
                System.out.println("Inserted Successfully");
            }
        }
        catch(ClassNotFoundException | SQLException exp){
            System.out.println(exp);
        }
    }
}
class delete{
    void destroy(){
        try{
            Scanner s1=new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/weapon", "root", "");
            System.out.println("Enter the weapon name to delete from weapon info");
            String c=s1.next();
            PreparedStatement ps=(PreparedStatement)con.prepareStatement("delete from arm_info where weapon_name=?");
            ps.setString(1, c);
            if(ps.executeUpdate()==1){
                System.out.println("Deleted Successfully");
            }
        }
        catch(ClassNotFoundException | SQLException exp){
            System.out.println(exp);
        }
    }
}
class update{
    void repair(){
        try{
            Scanner s1=new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/weapon", "root", "");
            System.out.println("Enter the values to update:");
            System.out.println("Enter the weapon_id");
            int b=s1.nextInt();
            System.out.println("Enter the weapon_name");
            String c= s1.next();
            System.out.println("Enter the fire_rate");
            int d=s1.nextInt();
            System.out.println("Enter the target range");
            int e=s1.nextInt();
            System.out.println("Enter the weapon caliber");
            Float f=s1.nextFloat();
            PreparedStatement ps=(PreparedStatement)con.prepareStatement("update arm_info set weapon_name=?,fire_rate=?,target=?,caliber=? where id=?");
            ps.setInt(5, b);
            ps.setString(1, c);
            ps.setInt(2, d);
            ps.setInt(3, e);
            ps.setFloat(4, f);
            if(ps.executeUpdate()==1){
                System.out.println("Updated Successfully");
            }
        }
        catch(ClassNotFoundException | SQLException exp){
            System.out.println(exp);
        }
    }
}
class display{
    void display(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/weapon", "root", "");
            PreparedStatement p=(PreparedStatement)con.prepareStatement("select * from arm_info");
            ResultSet rs = p.executeQuery();
                while(rs.next())
                {
                    System.out.println(rs.getString("weapon_type")+ "," +rs.getInt("id")+","+rs.getString("weapon_name")+ ","+rs.getInt("fire_rate")+","+rs.getInt("target")+","+rs.getFloat("caliber"));
                }
        }
        catch(ClassNotFoundException | SQLException exp){
            System.out.println(exp);
        }
    }
}
public class WeaponManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int j=1;
		Scanner s2=new Scanner(System.in);
		while(j>0)
		{
            System.out.println("Weapon Management System");
            System.out.println("Options");
            System.out.println("1.LOAD\n2.DISMANTLE\n3.RELOAD\n4.DISPLAY\n5.EXIT");
            System.out.println("Enter an option");
            int n=s2.nextInt();
            switch(n)
            {
                case 1:
                    insert i=new insert();
                    i.load();
                    break;
				case 2:
                    delete del=new delete();
                    del.destroy();
                    break;
				case 3:
                    update u=new update();
                    u.repair();
                    break;
				case 4:
                    display dis=new display();
                    dis.display();
                    break;
                case 5:
                    return;
            }		
		}
    }
} 
