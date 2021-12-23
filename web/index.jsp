<%-- 
    Document   : index
    Created on : 29-Oct-2021, 7:54:50 PM
    Author     : Brian
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Management System</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        
        <%--Nav / Header--%>
        <header>
            <nav class="navbar navbar-expand-md navbar-dark" style="background-color: green">
                <div>
                    <a href="index.jsp" class="navbar-brand"> Student Management Application</a>
                </div>

                <ul class="navbar-nav">
                    <li><a href="index.jsp" class="nav-link">Student List</a></li>
                    <li><a href="add.jsp" class="nav-link">New</a></li>
                    <li><a href="edit.jsp" class="nav-link">Edit</a></li>
                    <li><a href="delete.jsp" class="nav-link">Delete</a></li>
                </ul>
            </nav>
        </header>
         <br>
        <%--Nav / Header--%>
        
       
            <div class="row">
                
                <div class="container">
                <h3 class="text-center">Students</h3>
                <hr>
                <form action="Controller" method="POST">
                      <input type="submit" name="action" value="Display" class="btn btn-success">
                      <input type="submit" name="action" value="New" class="btn btn-success">
                      
                </form>
                
                <br>
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>Student ID</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Gender</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="student" items="${students}">   
                        <tr>
                               <td>${student.getId()}</td>
                               <td>${student.getFirstName()}</td>
                               <td>${student.getLastName()}</td>
                               <td>${student.getGender()}</td>
                               
                               <td>
                                    <form action="Controller" method="POST">
                                      
                                         <input type="hidden" name="id" value="${student.getId()}">
                                         <input type="submit" name="action" value="Edit" class="btn btn-warning float-left">
                                         <input type="submit" name="action" value="Delete" class="btn btn-danger float-right">
                                         
                                    </form>
                               </td>
                        </tr>
                        </c:forEach>   
                    </tbody>
                </table>
                </div>
          
            </div>    
           
    
    </body>
</html>
