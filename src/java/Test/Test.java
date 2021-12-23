/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import model.Student;
import model.StudentDAO;

/**
 *
 * @author Brian
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StudentDAO dao = new StudentDAO();
        Student s = new Student();
        
        //Getter
        s.setId(3);
        s.setFirstName("Larry");
        s.setLastName("Page");
        
        dao.add(s);
        
        
    }
    
}
