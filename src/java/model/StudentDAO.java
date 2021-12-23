/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Brian
 */
public class StudentDAO {
    
     PreparedStatement ps;
     ResultSet rs;
     ConnectionFactory c = new ConnectionFactory();
     Connection con;
     
     public List display(){
            List <Student> students = new ArrayList<>();
            String sql = "SELECT * FROM students ORDER BY id ASC";
            
            try {
                
                con = c.connect();
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

  
            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt(1));
                s.setFirstName(rs.getString(2));
                s.setLastName(rs.getString(3));
                s.setGender(rs.getString(4));
                students.add(s);
                
            }
            
            } catch (SQLException e) {
           
            }
            return students;
              
     }
    
    public int add(Student s) {
            int students = 0; 
            String sql = "INSERT INTO students(id,firstname,lastname,gender) VALUES (?,?,?,?)";
              
            try {     
                    con = c.connect();
                    ps = con.prepareStatement(sql);
                    ps.setInt(1, s.getId());
                    ps.setString(2, s.getFirstName());
                    ps.setString(3, s.getLastName());
                    ps.setString(4, s.getGender());
                    
                    students = ps.executeUpdate();
                    if (students==1){
                        students=1;
                    }else {
                        students=0;
                    }
        
            
            } catch (SQLException e) {
           
            }
            return students;
        
    } 
    
    public Student displayId(String id) {
            String sql = "SELECT * FROM students WHERE id=" +id;
            Student s = new Student();
            try {     
                    con = c.connect();
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();
          
                   while (rs.next()) {
                
                    s.setId(rs.getInt(1));
                    s.setFirstName(rs.getString(2));
                    s.setLastName(rs.getString(3));
                    s.setGender(rs.getString(4));
               
                }

            
            } catch (SQLException e) {
           
            }
            return s;
    }
    public int update(Student s) {
            int student = 0; 
            String sql = "UPDATE students SET firstname=?, lastname=?, gender=? WHERE id=? ";
            try {     
                   con = c.connect();
                   ps = con.prepareStatement(sql);
               
                  
                   ps.setString(1, s.getFirstName());
                   ps.setString(2, s.getLastName());
                   ps.setString(3, s.getGender());
                   ps.setInt(4, s.getId());
                   student = ps.executeUpdate();
                    
                   if (student == 1){
                        student=1;
                   }else {
                        student=0;
                   }     
      
            } catch (SQLException e) {
           
            }
            return student;
    }
    public void delete(String id) {
            String sql = "DELETE FROM students WHERE id=" + id;
            try {     
                   con = c.connect();
                   ps = con.prepareStatement(sql);
                   ps.executeUpdate();
                    
                   
            } catch (SQLException e) {
           
            }
    }
    
}
