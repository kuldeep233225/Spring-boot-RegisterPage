<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, com.example.demo.model.Appointment" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
    <h2>Welcome, Admin!</h2>
    
    <h3>Appointment List</h3>
    <table>
        <tr>
            <th>ID</th>
            <th>Aadhar Number</th>
            <th>Additional Notes</th>
            <th>Appointment Date</th>
            <th>Appointment Time</th>
            <th>Email</th>
            <th>Full Name</th>
            <th>Doctor Name</th>
        </tr>
        <%
            List<Appointment> appointments = (List<Appointment>) request.getAttribute("appointments");
            if (appointments != null && !appointments.isEmpty()) {
                for (Appointment appointment : appointments) {
        %>
        <tr>
            <td><%= appointment.getId() %></td>
            <td><%= appointment.getAadharNumber() %></td>
            <td><%= appointment.getAdditionalNotes() %></td>
            <td><%= appointment.getAppointmentDate() %></td>
            <td><%= appointment.getAppointmentTime() %></td>
            <td><%= appointment.getEmail() %></td>
            <td><%= appointment.getFullName() %></td>
            <td><%= appointment.getSelectedDoctor() %></td>
        </tr>
        <% 
                }
            } else { 
        %>
        <tr>
            <td colspan="8">No Appointments Found</td>
        </tr>
        <% } %>
    </table>
    
    <br>
    <a href="/admin/logout">Logout</a>
</body>
</html>
